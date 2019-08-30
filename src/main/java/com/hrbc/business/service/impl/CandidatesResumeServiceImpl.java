package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.Constants;
import com.hrbc.business.common.ResumeUtilAliy;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.aliylincv.ResumeInfo;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.mapper.*;
import com.hrbc.business.service.CandidatesResumeService;
import com.hrbc.business.service.CandidatesService;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: hr-workspace
 * @description: 简历解析实现类
 * @author: 波波烤鸭
 * @create: 2019-08-23 22:31
 */
@Service
public class CandidatesResumeServiceImpl implements CandidatesResumeService {

    @Autowired
    private CandidatesService candidatesService;

    @Autowired
    private CandidatesResumeDetailMapper candidatesResumeDetailMapper;

    @Autowired
    private CandidatesResumeEducationinfoMapper candidatesResumeEducationinfoMapper;
    @Autowired
    private CandidatesResumeExperienceinfoMapper candidatesResumeExperienceinfoMapper;
    @Autowired
    private CandidatesResumeTraininginfoMapper candidatesResumeTraininginfoMapper;
    @Autowired
    private CandidatesResumeProjectinfoMapper candidatesResumeProjectinfoMapper;


    @Override
    @ProcessLog(businessName = "简历解析",methodName = "resolveResume")
    public Integer resolveResume(InputStream in, String suffixName) {
        Integer flag = 1;
        // 字节流转换为字节数组
        byte[] data = ResumeUtilAliy.inputStreamConvertByteArray(in);
        try {
            // 解析 简历 获取到对应的包装对象
            Map<String,Object> map = ResumeUtilAliy.getResume(data, suffixName);
            Object infoMap =map.get("info");
            if(infoMap == null){
                return 0;
            }
            String json = (String)map.get("msg");
            ResumeInfo info = (ResumeInfo)infoMap;
            if (info != null) {
                // 将简历信息 保存到 候选人对象中
                CandidatesDto candidates = ResumeUtilAliy.resolveResumeCandidates(info);
                // 保存简历详情信息
                candidates.setResumedetail(json.getBytes());
                flag = candidatesService.save(candidates,1);
                if (flag > 0) {
                    // 说明候选人添加失败
                    // 将简历信息保存到 简历对象中
                    CandidatesResumeDetailWithBLOBs detail = ResumeUtilAliy.resolveResumeDetails(info);
                    detail.setResumejson(json);
                    detail.setCandidatesid(candidates.getId());
                    saveCandidatesResumeDetail(detail);
                    // 保存 各个详细信息
                    List<CandidatesResumeEducationinfo> edus = ResumeUtilAliy.resolveResumeEducation(info, detail.getId());
                    if (edus != null && edus.size() > 0) {
                        saveCandidatesResumeEdus(edus,detail.getId());
                    }
                    List<CandidatesResumeExperienceinfoWithBLOBs> exps = ResumeUtilAliy.resolveResumeExperience(info,detail.getId());
                    if (exps != null && exps.size() > 0) {
                        saveCandidatesResumeExpr(exps,detail.getId());
                    }
                    List<CandidatesResumeProjectinfoWithBLOBs> pros = ResumeUtilAliy.resolveResumeProjects(info, detail.getId());
                    if ( pros != null && pros.size() > 0) {
                        saveCandidatesResumeProjs(pros,detail.getId());
                    }

                    List<CandidatesResumeTraininginfo> trans = ResumeUtilAliy.resolveResumeTraining(info, detail.getId());
                    if (trans != null && trans.size() > 0) {
                        saveCandidatesResumeTrans(trans,detail.getId());
                    }
                }

            }
        }catch (Exception e){
            // 简历解析异常
            flag = -1;
        }
        return flag;
    }

    /**
     * 根据 候选人编号查询对应的 简历信息
     * @param candidatesId
     * @return
     */
    @Override
    public ResponseDTO loadResumeDetail(Integer candidatesId) {
        CandidatesResumeDetailWithBLOBs detail = queryResumeDetail(candidatesId);
        Map<String,Object> map = new HashMap<>();
        if (detail != null ) {
            // 简历记录编号
            Integer detailId = detail.getId();
            map.put(Constants.RESUME_DETAIL,detail);
            map.put(Constants.RESUME_EDUS,queryResumeEdus(detailId));
            map.put(Constants.RESUME_EXPRS,queryResumeExprs(detailId));
            map.put(Constants.RESUME_PROS,queryResumePros(detailId));
            map.put(Constants.RESUME_TRANS,queryResumeTrans(detailId));
        }
        return new ResponseDTO(true,"数据获取成功",map);
    }

    @Override
    public CandidatesResumeDetailWithBLOBs queryResumeDetail(Integer candidatesId) {
        CandidatesResumeDetailExample detailExample = new CandidatesResumeDetailExample();
        detailExample.createCriteria().andCandidatesidEqualTo(candidatesId);
        List<CandidatesResumeDetailWithBLOBs> list =candidatesResumeDetailMapper.selectByExampleWithBLOBs(detailExample);
        if (list != null && list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<CandidatesResumeEducationinfo> queryResumeEdus(Integer resumeId) {
        CandidatesResumeEducationinfoExample eduExample = new CandidatesResumeEducationinfoExample();
        eduExample.createCriteria().andResumeidEqualTo(resumeId);
        return candidatesResumeEducationinfoMapper.selectByExample(eduExample);
    }

    @Override
    public List<CandidatesResumeExperienceinfoWithBLOBs> queryResumeExprs(Integer resumeId) {
        CandidatesResumeExperienceinfoExample expExample = new CandidatesResumeExperienceinfoExample();
        expExample.createCriteria().andResumeidEqualTo(resumeId);
       return candidatesResumeExperienceinfoMapper.selectByExampleWithBLOBs(expExample);
    }

    @Override
    public List<CandidatesResumeProjectinfoWithBLOBs> queryResumePros(Integer resumeId) {
        CandidatesResumeProjectinfoExample prosExample = new CandidatesResumeProjectinfoExample();
        prosExample.createCriteria().andResumeidEqualTo(resumeId);
        return candidatesResumeProjectinfoMapper.selectByExampleWithBLOBs(prosExample);
    }

    @Override
    public List<CandidatesResumeTraininginfo> queryResumeTrans(Integer resumeId) {
        CandidatesResumeTraininginfoExample tranExample = new CandidatesResumeTraininginfoExample();
        tranExample.createCriteria().andResumeidEqualTo(resumeId);
        return  candidatesResumeTraininginfoMapper.selectByExampleWithBLOBs(tranExample);
    }

    @Override
    public Integer saveCandidatesResumeDetail(CandidatesResumeDetailWithBLOBs detail) {
        if (detail.getId() != null) {
            // 更新数据
            return candidatesResumeDetailMapper.updateByPrimaryKeyWithBLOBs(detail);
        }
        // 插入数据
        return  candidatesResumeDetailMapper.insertSelective(detail);
    }

    @Override
    public Integer saveCandidatesResumeEdus(List<CandidatesResumeEducationinfo> edus,Integer resumeId) {

        if (resumeId != null && resumeId > 0) {
            // 删除原有的信息
            CandidatesResumeEducationinfoExample example = new CandidatesResumeEducationinfoExample();
            example.createCriteria().andResumeidEqualTo(resumeId);
            candidatesResumeEducationinfoMapper.deleteByExample(example);
        }

        return candidatesResumeEducationinfoMapper.batchInsert(edus);
    }

    @Override
    public Integer saveCandidatesResumeExpr(List<CandidatesResumeExperienceinfoWithBLOBs> expr,Integer resumeId) {
        if (resumeId != null && resumeId > 0) {
            // 删除原有的信息
            CandidatesResumeExperienceinfoExample example = new CandidatesResumeExperienceinfoExample();
            example.createCriteria().andResumeidEqualTo(resumeId);
            candidatesResumeExperienceinfoMapper.deleteByExample(example);
        }
        return candidatesResumeExperienceinfoMapper.batchInsert(expr);
    }

    @Override
    public Integer saveCandidatesResumeProjs(List<CandidatesResumeProjectinfoWithBLOBs> pros,Integer resumeId) {
        if (resumeId != null && resumeId > 0) {
            // 删除原有的信息
            CandidatesResumeProjectinfoExample example = new CandidatesResumeProjectinfoExample();
            example.createCriteria().andResumeidEqualTo(resumeId);
            candidatesResumeProjectinfoMapper.deleteByExample(example);
        }
        return candidatesResumeProjectinfoMapper.batchInsert(pros);
    }

    @Override
    public Integer saveCandidatesResumeTrans(List<CandidatesResumeTraininginfo> trans,Integer resumeId) {
        if (resumeId != null && resumeId > 0) {
            // 删除原有的信息
            CandidatesResumeTraininginfoExample example = new CandidatesResumeTraininginfoExample();
            example.createCriteria().andResumeidEqualTo(resumeId);
            candidatesResumeTraininginfoMapper.deleteByExample(example);
        }
        return candidatesResumeTraininginfoMapper.batchInsert(trans);
    }

    /**
     *  手动添加 候选信息 同步添加简历信息
     * @param candidates
     * @return
     */
    @Override
    public Integer saveResumeByCandidates(CandidatesDto candidates) {
        CandidatesResumeDetailWithBLOBs detail = this.queryResumeDetail(candidates.getId());
        if (detail == null ) {
            detail = new CandidatesResumeDetailWithBLOBs();
        }
        detail.setCandidatesid(candidates.getId());
        detail.setName(candidates.getUsername());
        detail.setMobile(candidates.getPhoneno());
        detail.setPhone(candidates.getPhonenobak());
        detail.setEmail(candidates.getEmail());
        //detail.setForwardvocation(candidates.getExpectjob());
        detail.setIdno(candidates.getIdcard());
        try {
            detail.setAge(NumberUtils.toByte(candidates.getAge()+""));
        }catch (Exception e){

        }

        detail.setSex(candidates.getGender());
        detail.setBirth(candidates.getBirthday());
        detail.setNowlocation(candidates.getLivebase());
        detail.setEducation(candidates.getDegree());
        detail.setForwardlocation(candidates.getExpectworkbase());
        detail.setTitle(candidates.getExpectjob());
        detail.setIsjobsearch(candidates.getWorkbase());
        detail.setVocation(candidates.getMajor());
        detail.setLastcompany(candidates.getWork1());
        detail.setLasttitle(candidates.getJobtitle());
        detail.setMarryied(candidates.getMarried());
        // 期望薪资
       Integer minSalary = candidates.getSalarymin();
       Integer maxSalary = candidates.getSalarymax();
       if (maxSalary != null || minSalary != null) {
           StringBuilder sb = new StringBuilder();
           sb.append(minSalary + "-" + maxSalary + "元/月");

           //detail.setSalary(sb.toString());
           detail.setAimsalary(sb.toString());
       }
       // 当前薪资
        List<CandidatesResumeExperienceinfoWithBLOBs> exprs = candidates.getExprs();
       if (exprs != null && exprs.size() > 0) {
           CandidatesResumeExperienceinfoWithBLOBs expr = exprs.get(0);
           if (StringUtils.isNotEmpty(expr.getSalary()) && !expr.getSalary().contains("元/月")) {
               detail.setSalary(expr.getSalary() + "元/月");
           }
       }
        if (candidates.getWorkyears() == null) {
            detail.setExperience("0");
        }else {
            detail.setExperience(candidates.getWorkyears() + "");
        }

        detail.setGradeofenglishs(candidates.getCertifications());
        detail.setPersonal(candidates.getPerprofile());
        detail.setCertificate(candidates.getCertifications());
        // 技能
        detail.setSkill(candidates.getPersonaliy());
        int i = saveCandidatesResumeDetail(detail);
        if ( i > 0) {
            // 教育经历
            List<CandidatesResumeEducationinfo> edus =  candidates.getEdus();
            if (edus != null && edus.size() > 0) {
                for (CandidatesResumeEducationinfo e: edus) {
                    e.setResumeid(detail.getId());
                }
                saveCandidatesResumeEdus(edus,detail.getId());
            }
            // 工作经历
            List<CandidatesResumeExperienceinfoWithBLOBs> exps = candidates.getExprs();
            if (exps != null && exps.size() > 0) {
                for (CandidatesResumeExperienceinfoWithBLOBs e: exps) {
                    e.setResumeid(detail.getId());
                }
                saveCandidatesResumeExpr(exps,detail.getId());
            }
            // 项目经历
            List<CandidatesResumeProjectinfoWithBLOBs> pros = candidates.getProjects();

            if (pros != null && pros.size() > 0) {
                for (CandidatesResumeProjectinfoWithBLOBs p:pros) {
                    p.setResumeid(detail.getId());
                }
                saveCandidatesResumeProjs(pros,detail.getId());
            }
        }
        return i;
    }

    public void saveResumeByCandidatesSynchronization(CandidatesDto candidates) {
        CandidatesResumeDetailWithBLOBs detail = this.queryResumeDetail(candidates.getId());
        if (detail == null ) {
            detail = new CandidatesResumeDetailWithBLOBs();
        }
        detail.setCandidatesid(candidates.getId());
        detail.setName(candidates.getUsername());
        detail.setMobile(candidates.getPhoneno());
        detail.setPhone(candidates.getPhonenobak());
        detail.setEmail(candidates.getEmail());
        //detail.setForwardvocation(candidates.getExpectjob());
        detail.setIdno(candidates.getIdcard());
        try {
            detail.setAge(NumberUtils.toByte(candidates.getAge()+""));
        }catch (Exception e){

        }

        detail.setSex(candidates.getGender());
        detail.setBirth(candidates.getBirthday());
        detail.setNowlocation(candidates.getLivebase());
        detail.setEducation(candidates.getDegree());
        detail.setForwardlocation(candidates.getExpectworkbase());
        detail.setTitle(candidates.getExpectjob());
        detail.setIsjobsearch(candidates.getWorkbase());
        detail.setVocation(candidates.getMajor());
        detail.setLastcompany(candidates.getWork1());
        detail.setLasttitle(candidates.getJobtitle());
        detail.setMarryied(candidates.getMarried());
        // 期望薪资
        Integer minSalary = candidates.getSalarymin();
        Integer maxSalary = candidates.getSalarymax();
        if (maxSalary != null || minSalary != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(minSalary + "-" + maxSalary + "元/月");

            //detail.setSalary(sb.toString());
            detail.setAimsalary(sb.toString());
        }
        // 当前薪资
        List<CandidatesResumeExperienceinfoWithBLOBs> exprs = candidates.getExprs();
        if (exprs != null && exprs.size() > 0) {
            CandidatesResumeExperienceinfoWithBLOBs expr = exprs.get(0);
            if (!expr.getSalary().contains("元/月")) {
                detail.setSalary(expr.getSalary() + "元/月");
            }
        }
        if (candidates.getWorkyears() == null) {
            detail.setExperience("0");
        }else {
            detail.setExperience(candidates.getWorkyears() + "");
        }

        detail.setGradeofenglishs(candidates.getCertifications());
        detail.setPersonal(candidates.getPerprofile());
        detail.setCertificate(candidates.getCertifications());
        // 技能
        detail.setSkill(candidates.getPersonaliy());
        int i = saveCandidatesResumeDetail(detail);
        if ( i > 0) {
            // 教育经历
            List<CandidatesResumeEducationinfo> edus =  new ArrayList<>();
            if(StringUtils.isNotEmpty(candidates.getEdu1())){
                CandidatesResumeEducationinfo e1 = new CandidatesResumeEducationinfo();
                e1.setResumeid(detail.getId());
                e1.setSchool(candidates.getEdu1());
                e1.setStartdate(candidates.getEdu1stdate());
                e1.setEnddate(candidates.getEdu1eddate());
                e1.setEducation(candidates.getDegree());
                edus.add(e1);
            }
            if(StringUtils.isNotEmpty(candidates.getEdu2())){
                CandidatesResumeEducationinfo e2 = new CandidatesResumeEducationinfo();
                e2.setResumeid(detail.getId());
                e2.setSchool(candidates.getEdu2());
                e2.setStartdate(candidates.getEdu2stdate());
                e2.setEnddate(candidates.getEdu2eddate());
                edus.add(e2);
            }
            if(StringUtils.isNotEmpty(candidates.getEdu3())){
                CandidatesResumeEducationinfo e3 = new CandidatesResumeEducationinfo();
                e3.setResumeid(detail.getId());
                e3.setSchool(candidates.getEdu3());
                e3.setStartdate(candidates.getEdu3stdate());
                e3.setEnddate(candidates.getEdu3eddate());
                edus.add(e3);
            }
            if(edus.size() > 0){
                saveCandidatesResumeEdus(edus,detail.getId());
            }



            // 工作经历
            List<CandidatesResumeExperienceinfoWithBLOBs> exps = new ArrayList<>();
            if (StringUtils.isNotEmpty(candidates.getWork1())) {
                CandidatesResumeExperienceinfoWithBLOBs c = new CandidatesResumeExperienceinfoWithBLOBs();
                c.setResumeid(detail.getId());
                c.setCompany(candidates.getWork1());
                c.setStartdate(candidates.getWork1stdate());
                c.setEnddate(candidates.getWork1eddate());
                c.setTitle(candidates.getJobtitle());
                c.setSummary(candidates.getWork1desc());
                exps.add(c);
            }
            if (StringUtils.isNotEmpty(candidates.getWork2())) {
                CandidatesResumeExperienceinfoWithBLOBs c = new CandidatesResumeExperienceinfoWithBLOBs();
                c.setResumeid(detail.getId());
                c.setCompany(candidates.getWork2());
                c.setStartdate(candidates.getWork2stdate());
                c.setEnddate(candidates.getWork2eddate());
                c.setTitle(candidates.getWork2jobtitle());
                c.setSummary(candidates.getWork2desc());
                exps.add(c);
            }

            if (StringUtils.isNotEmpty(candidates.getWork3())) {
                CandidatesResumeExperienceinfoWithBLOBs c = new CandidatesResumeExperienceinfoWithBLOBs();
                c.setResumeid(detail.getId());
                c.setCompany(candidates.getWork3());
                c.setStartdate(candidates.getWork3stdate());
                c.setEnddate(candidates.getWork3eddate());
                c.setTitle(candidates.getWork3jobtitle());
                c.setSummary(candidates.getWork3desc());
                exps.add(c);
            }
            if (StringUtils.isNotEmpty(candidates.getWork4())) {
                CandidatesResumeExperienceinfoWithBLOBs c = new CandidatesResumeExperienceinfoWithBLOBs();
                c.setResumeid(detail.getId());
                c.setCompany(candidates.getWork4());
                c.setStartdate(candidates.getWork4stdate());
                c.setEnddate(candidates.getWork4eddate());
                c.setTitle(candidates.getWork4jobtitle());
                c.setSummary(candidates.getWork4desc());
                exps.add(c);
            }
            if (exps.size() > 0) {
                saveCandidatesResumeExpr(exps,detail.getId());
            }
        }

    }


    /**
     * 同步 数据 （执行一次）
     */
    @Override
    public void updateSynchronizationCandidatesInfo() {
        // 1.同步有解析简历的情况
        CandidatesExample example = new CandidatesExample();
        List<Candidates> list = candidatesService.query(example);
        for (Candidates c:list) {
            CandidatesDto dto = candidatesService.getWithBLOBs(c.getId());
            byte[] data = dto.getResumedetail();
            if (data != null) {
                // 解析简历
                ResumeInfo info = JSONObject.parseObject(data,ResumeInfo.class);
                if (info != null) {
                    // 将简历信息 保存到 候选人对象中
                    CandidatesDto candidates = ResumeUtilAliy.resolveResumeCandidates(info);
                    candidates.setId(c.getId());
                    int flag = candidatesService.save(candidates,1);
                    if (flag > 0) {
                        // 说明候选人添加失败
                        // 将简历信息保存到 简历对象中
                        CandidatesResumeDetailWithBLOBs detail = ResumeUtilAliy.resolveResumeDetails(info);
                        detail.setResumejson(new String(data));
                        detail.setCandidatesid(candidates.getId());
                        saveCandidatesResumeDetail(detail);
                        // 保存 各个详细信息
                        List<CandidatesResumeEducationinfo> edus = ResumeUtilAliy.resolveResumeEducation(info, detail.getId());
                        if (edus != null && edus.size() > 0) {
                            saveCandidatesResumeEdus(edus,detail.getId());
                        }
                        List<CandidatesResumeExperienceinfoWithBLOBs> exps = ResumeUtilAliy.resolveResumeExperience(info,detail.getId());
                        if (exps != null && exps.size() > 0) {
                            saveCandidatesResumeExpr(exps,detail.getId());
                        }
                        List<CandidatesResumeProjectinfoWithBLOBs> pros = ResumeUtilAliy.resolveResumeProjects(info, detail.getId());
                        if ( pros != null && pros.size() > 0) {
                            saveCandidatesResumeProjs(pros,detail.getId());
                        }

                        List<CandidatesResumeTraininginfo> trans = ResumeUtilAliy.resolveResumeTraining(info, detail.getId());
                        if (trans != null && trans.size() > 0) {
                            saveCandidatesResumeTrans(trans,detail.getId());
                        }
                    }
                }
            }else{
                // 同步数据
                saveResumeByCandidatesSynchronization(dto);

            }
        }

        // 2.同步没有解析简历的情况
    }


    public List<CandidatesResumeExperienceinfoWithBLOBs> candidatesParseExps(CandidatesWithBLOBs candidates,Integer resumeId){
        List<CandidatesResumeExperienceinfoWithBLOBs> exps = new ArrayList<>();
        java.lang.String e1 = candidates.getWork1();
        if ( StringUtils.isNotBlank(e1)) {
            CandidatesResumeExperienceinfoWithBLOBs e = new CandidatesResumeExperienceinfoWithBLOBs();
            e.setCandidatesnum(1);
            e.setCompany(e1);
            e.setStartdate(candidates.getWork1stdate());
            e.setEnddate(candidates.getWork1eddate());
            e.setResumeid(resumeId);
            e.setSummary(candidates.getWork1desc());
            exps.add(e);
        }
        String e2 = candidates.getWork2();
        if ( StringUtils.isNotBlank(e2)) {
            CandidatesResumeExperienceinfoWithBLOBs e = new CandidatesResumeExperienceinfoWithBLOBs();
            e.setCandidatesnum(2);
            e.setCompany(e2);
            e.setStartdate(candidates.getWork2stdate());
            e.setEnddate(candidates.getWork2eddate());
            e.setResumeid(resumeId);
            e.setSummary(candidates.getWork2desc());
            exps.add(e);
        }
        String e3 = candidates.getWork3();
        if ( StringUtils.isNotBlank(e3)) {
            CandidatesResumeExperienceinfoWithBLOBs e = new CandidatesResumeExperienceinfoWithBLOBs();
            e.setCandidatesnum(3);
            e.setCompany(e3);
            e.setStartdate(candidates.getWork3stdate());
            e.setEnddate(candidates.getWork3eddate());
            e.setResumeid(resumeId);
            e.setSummary(candidates.getWork3desc());
            exps.add(e);
        }

        String e4 = candidates.getWork4();
        if ( StringUtils.isNotBlank(e4)) {
            CandidatesResumeExperienceinfoWithBLOBs e = new CandidatesResumeExperienceinfoWithBLOBs();
            e.setCandidatesnum(4);
            e.setCompany(e4);
            e.setStartdate(candidates.getWork4stdate());
            e.setEnddate(candidates.getWork4eddate());
            e.setResumeid(resumeId);
            e.setSummary(candidates.getWork4desc());
            exps.add(e);
        }
        return exps;
    }

    public List<CandidatesResumeProjectinfoWithBLOBs> candidatesParseProj(CandidatesWithBLOBs candidates,Integer resumeId){
        List<CandidatesResumeProjectinfoWithBLOBs> pros = new ArrayList<>();
        String p1 = candidates.getWork1();
        if (StringUtils.isNotBlank(p1)) {
            CandidatesResumeProjectinfoWithBLOBs p = new CandidatesResumeProjectinfoWithBLOBs();
            p.setProjectname(p1);
            p.setStartdate(candidates.getWork1stdate());
            p.setEnddate(candidates.getWork1eddate());
            p.setProjectdescription(candidates.getWork1projs());
            p.setResponsiblities(candidates.getWork1desc());
            p.setResumeid(resumeId);
            pros.add(p);
        }
        String p2 = candidates.getWork2();
        if (StringUtils.isNotBlank(p2)) {
            CandidatesResumeProjectinfoWithBLOBs p = new CandidatesResumeProjectinfoWithBLOBs();
            p.setProjectname(p2);
            p.setStartdate(candidates.getWork2stdate());
            p.setEnddate(candidates.getWork2eddate());
            p.setProjectdescription(candidates.getWork2projs());
            p.setResponsiblities(candidates.getWork2desc());
            p.setResumeid(resumeId);
            pros.add(p);
        }
        String p3 = candidates.getWork3();
        if (StringUtils.isNotBlank(p3)) {
            CandidatesResumeProjectinfoWithBLOBs p = new CandidatesResumeProjectinfoWithBLOBs();
            p.setProjectname(p3);
            p.setStartdate(candidates.getWork3stdate());
            p.setEnddate(candidates.getWork3eddate());
            p.setProjectdescription(candidates.getWork3projs());
            p.setResponsiblities(candidates.getWork3desc());
            p.setResumeid(resumeId);
            pros.add(p);
        }
        String p4 = candidates.getWork4();
        if (StringUtils.isNotBlank(p4)) {
            CandidatesResumeProjectinfoWithBLOBs p = new CandidatesResumeProjectinfoWithBLOBs();
            p.setProjectname(p4);
            p.setStartdate(candidates.getWork4stdate());
            p.setEnddate(candidates.getWork4eddate());
            p.setProjectdescription(candidates.getWork4projs());
            p.setResponsiblities(candidates.getWork4desc());
            p.setResumeid(resumeId);
            pros.add(p);
        }
        return pros;
    }

    public List<CandidatesResumeEducationinfo> candidatesParseEdus(CandidatesWithBLOBs candidates,Integer resumeId){
        List<CandidatesResumeEducationinfo> edus = new ArrayList<>();
        String school = candidates.getEdu1();
        if (StringUtils.isNotBlank(school)) {
            CandidatesResumeEducationinfo e = new CandidatesResumeEducationinfo();
            e.setSchool(school);
            e.setStartdate(candidates.getEdu1stdate());
            e.setEnddate(candidates.getEdu1eddate());
            e.setSpeciality(candidates.getDegree());
            e.setResumeid(resumeId);
            edus.add(e);
        }
        String school2 = candidates.getEdu2();
        if (StringUtils.isNotBlank(school2)) {
            CandidatesResumeEducationinfo e = new CandidatesResumeEducationinfo();
            e.setSchool(school2);
            e.setStartdate(candidates.getEdu2stdate());
            e.setEnddate(candidates.getEdu2eddate());
            e.setResumeid(resumeId);
            edus.add(e);
        }
        String school3 = candidates.getEdu3();
        if (StringUtils.isNotBlank(school3)) {
            CandidatesResumeEducationinfo e = new CandidatesResumeEducationinfo();
            e.setSchool(school3);
            e.setStartdate(candidates.getEdu3stdate());
            e.setEnddate(candidates.getEdu3eddate());
            e.setResumeid(resumeId);
            edus.add(e);
        }
        return edus;
    }
}
