package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.Constants;
import com.hrbc.business.common.ResumeUtil;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.aliylincv.EducationInfo;
import com.hrbc.business.domain.aliylincv.ExperienceInfo;
import com.hrbc.business.domain.aliylincv.ProjectInfo;
import com.hrbc.business.domain.aliylincv.ResumeInfo;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.domain.common.ResponseDTO;
import com.hrbc.business.mapper.*;
import com.hrbc.business.service.CandidatesResumeService;
import com.hrbc.business.service.CandidatesService;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import sun.misc.BASE64Encoder;

import java.io.*;
import java.util.*;

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
    private CandidatesResumeMapper resumeMapper;


    @Override
    public List<CandidatesResume> query(CandidatesResume resume) {
        CandidatesResumeExample example = new CandidatesResumeExample();
        if (resume != null) {
            if (resume.getCandidatesId() != null && resume.getCandidatesId() > 0) {
                example.createCriteria().andCandidatesIdEqualTo(resume.getCandidatesId());
            }
        }
        return resumeMapper.selectByExampleWithBLOBs(example);
    }

    /**
     * 获取 简历的json数据对应的 ResumeInfo对象
     * @param candidatesId
     * @return
     */
    @Override
    public ResumeInfo getResumeInfo(Integer candidatesId) {
        CandidatesResume r = getCandidatesResume(candidatesId);
        if(r != null){
            byte[] b = r.getResumeJson();
            if (b != null) {
                String json = new String(b);
                return JSONObject.parseObject(json,ResumeInfo.class);
            }
        }
        return null;
    }

    @Override
    public CandidatesResume getCandidatesResume(Integer candidatesId){
        // 获取 候选简历的json数据
        CandidatesResume resume = new CandidatesResume();
        resume.setCandidatesId(candidatesId);
        List<CandidatesResume> list = this.query(resume);
        if (list != null && list.size() == 1) {
           return list.get(0);
        }
        return null;
    }

    @Override
    @ProcessLog(businessName = "简历解析",methodName = "resolveResume")
    public Integer resolveResume(InputStream in, String suffixName) {
        Integer flag = 1;
        // 字节流转换为字节数组
        byte[] data = ResumeUtil.inputStreamConvertByteArray(in);
        try {
            // 解析 简历 获取到对应的包装对象
            String json = ResumeUtil.getResume(data, suffixName);
            if (json == null) {
                return 0 ;
            }
            ResumeInfo info = JSONObject.parseObject(json, ResumeInfo.class);
            if (info != null) {
                // 将简历信息 保存到 候选人对象中
                CandidatesDto candidates = ResumeUtil.resolveResumeCandidates(info);

                flag = candidatesService.save(candidates,1);
                if (flag > 0) {
                    // 将简历信息保存到 简历对象中
                    CandidatesResume resume = new CandidatesResume();
                    resume.setCandidatesId(candidates.getId());
                    resume.setResumeJson(json.getBytes());
                    resumeMapper.insertSelective(resume);
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
        // 查询 简历的json 数据
        CandidatesResumeExample example = new CandidatesResumeExample();
        example.createCriteria().andCandidatesIdEqualTo(candidatesId);
        List<CandidatesResume> list = resumeMapper.selectByExampleWithBLOBs(example);
        //Map<String,Object> map = new HashMap<>();
        //map.put("",de)
        if (list != null && list.size() == 1) {
            CandidatesResume resume = list.get(0);
            byte[] bytes = resume.getResumeJson();
            if (bytes != null) {
                String json = new String(bytes);
                ResumeInfo info = JSONObject.parseObject(json,ResumeInfo.class);
                return new ResponseDTO(true,"数据获取成功",info);
            }
        }
        return new ResponseDTO(false,"数据获取失败",null);
    }



    /**
     *  手动添加 候选信息 同步添加简历信息
     * @param candidates
     * @return
     */
    @Override
    public Integer saveResumeByCandidates(CandidatesDto candidates) {
        CandidatesResume candidatesResume = getCandidatesResume(candidates.getId());
        if (candidatesResume == null) {
            candidatesResume = new CandidatesResume();
            candidatesResume.setCandidatesId(candidates.getId());
        }

        // 获取 ResumeInfo对象
        ResumeInfo info = getResumeInfo(candidates.getId());
        if( info == null){
            info = new ResumeInfo();
        }
        if(StringUtils.isNotBlank(candidates.getMarried())){
            info.setMarried(candidates.getMarried());
        }
        if (StringUtils.isNotBlank(candidates.getIdcard())) {
            info.setIDNO(candidates.getIdcard());
        }
        if(StringUtils.isNotBlank(candidates.getUsername())){
            info.setName(candidates.getUsername());
        }
        if (StringUtils.isNotBlank(candidates.getPhoneno())) {
            info.setMobile(candidates.getPhoneno());
        }
        if (StringUtils.isNotBlank(candidates.getEmail())) {
            info.setEmail(candidates.getEmail());
        }
        if (candidates.getAge() != null) {
            info.setAge(candidates.getAge()+"");
        }
        if (StringUtils.isNotBlank(candidates.getGender())) {
            info.setSex(candidates.getGender());
        }

        if (candidates.getBirthday() != null) {
            info.setBirth(QuickTimeUtil.dateParseString(candidates.getBirthday(),"yyyy-MM-dd"));
        }
        if (StringUtils.isNotBlank(candidates.getLivebase())) {
            info.setNowLocation(candidates.getLivebase());
        }
        if (StringUtils.isNotBlank(candidates.getDegree())) {
            info.setEducation(candidates.getDegree());
        }
        if (StringUtils.isNotBlank(candidates.getExpectworkbase())) {
            info.setForwardlocation(candidates.getExpectworkbase());
        }

        if (StringUtils.isNotBlank(candidates.getExpectjob())) {
            info.setForwardVocation(candidates.getExpectjob());
        }

        if (candidates.getSalarymin() != null && candidates.getSalarymax() != null) {
            info.setAimSalary(candidates.getSalarymin() + "-" + candidates.getSalarymax() + "元/月");
        }

        if( StringUtils.isNotBlank(candidates.getWorkbase())){
            info.setSwitch(candidates.getWorkbase());
        }

        if (StringUtils.isNotBlank(candidates.getMajor())) {
            info.setVocation(candidates.getMajor());
        }

        if (StringUtils.isNotBlank(candidates.getStartfrom())) {
            info.setStartFrom(candidates.getStartfrom());
        }

        if (StringUtils.isNotBlank(candidates.getPersonaliy())) {
            info.setSkill(candidates.getPersonaliy());
        }

        if (StringUtils.isNotBlank(candidates.getHxys())) {
            info.setHxys(candidates.getHxys());
        }

        if (StringUtils.isNotBlank(candidates.getQzyy())) {
            info.setQzyy(candidates.getQzyy());
        }

        if (StringUtils.isNotBlank(candidates.getJtqk())) {
            info.setJtqk(candidates.getJtqk());
        }

        if (StringUtils.isNotBlank(candidates.getPerprofile())) {
            info.setPersonal(candidates.getPerprofile());
        }

        if (StringUtils.isNotBlank(candidates.getCertifications())) {
            info.setCertificate(candidates.getCertifications());
        }

        // 设置 工作经历  项目经历   教育经历
        // 更新 工作经验
        ExperienceInfo[] exprs = candidates.getExprs();
        if (exprs != null && exprs.length > 0) {
            ExperienceInfo experienceInfo = exprs[0];
            if (StringUtils.isBlank(experienceInfo.getCompany())) {
                experienceInfo.setCompany(candidates.getWork1());
            }
            if (StringUtils.isBlank(experienceInfo.getTitle())) {
                experienceInfo.setTitle(candidates.getJobtitle());
            }
            if (StringUtils.isBlank(experienceInfo.getPeriodsOfTime())) {
                experienceInfo.setPeriodsOfTime(candidates.getWorkyears()+"");
            }
            if (StringUtils.isBlank(experienceInfo.getStartDate())) {
                experienceInfo.setStartDate(QuickTimeUtil.dateParseString(candidates.getWork1stdate(),Constants.DATE_PATTERN_YMD));
            }

            if (StringUtils.isBlank(experienceInfo.getEndDate())) {
                experienceInfo.setEndDate(QuickTimeUtil.dateParseString(candidates.getWork1eddate(),Constants.DATE_PATTERN_YMD));
            }
        }

        info.setExperienceInfo(exprs);
        info.setProjectInfo(candidates.getProjects());
        info.setEducationInfo(candidates.getEdus());
        // 将 ResumeInfo 转换为 json数据
        candidatesResume.setResumeJson(JSONObject.toJSON(info).toString().getBytes());
        try {
            if (candidatesResume.getId() != null) {
                // 更新数据
                return resumeMapper.updateByPrimaryKeyWithBLOBs(candidatesResume);
            }else {
                // 新增数据
                return resumeMapper.insertSelective(candidatesResume);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Map<String, Object> resolveExportCandidatesInfo(Integer candidatesId) {
        Map<String, Object> map = new HashMap<String, Object>();
        // 获取的 候选人信息
        Candidates candidates = candidatesService.get(candidatesId);
        ResumeInfo resume = getResumeInfo(candidatesId);
        // 应聘职位
        map.put("forwardvocation",ResumeUtil.resolveMsgIsNull(resume.getForwardVocation()));
        // 应聘时间
        map.put("now", QuickTimeUtil.dateParseString(new Date(),"yyyy.MM.dd"));
        // 姓名
        map.put("name",ResumeUtil.resolveMsgIsNull(resume.getName()));
        // 性别
        map.put("sex",ResumeUtil.resolveMsgIsNull(resume.getSex()));
        // 年龄
        map.put("age",ResumeUtil.resolveMsgIsNull(resume.getAge()));
        // 籍贯
        map.put("jiguan",ResumeUtil.resolveMsgIsNull(resume.getJiguan()));
        // 婚姻
        map.put("m",ResumeUtil.resolveMsgIsNull(resume.getMarried()));
        // 现居
        map.put("location",ResumeUtil.resolveMsgIsNull(resume.getNowLocation()));
        // 学历
        map.put("education",ResumeUtil.resolveMsgIsNull(resume.getEducation()));
        // 是否统招
        map.put("studenttype",ResumeUtil.resolveMsgIsNull(resume.getStudentType()));
        map.put("hxys",ResumeUtil.resolveMsgIsNull(resume.getHxys()));
        map.put("qzyy",ResumeUtil.resolveMsgIsNull(resume.getQzyy()));
        map.put("jtqk",ResumeUtil.resolveMsgIsNull(resume.getJtqk()));
        // 头像
        String imgPath = candidates.getPicpath();
        if (StringUtils.isNotEmpty(imgPath)) {
            try {
                map.put("img",1);
                map.put("imgcode", getImageBase64(PathConf.getSavePathPic() + candidates.getPicpath()));
            }catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }else {
            map.put("img",0);
            map.put("imgcode", "未上传");
        }
        map.put("exprs",parseExperienceInfoToMap(resume.getExperienceInfo()));
        // 职业状态
        map.put("jobstatus",ResumeUtil.resolveMsgIsNull(resume.getSwitch())) ;
        // 薪资
        map.put("nowsalary",ResumeUtil.resolveMsgIsNull(resume.getSalary()) );
        map.put("aimsalary",ResumeUtil.resolveMsgIsNull(resume.getAimSalary()));
        // 到岗时间
        map.put("startfrom",ResumeUtil.resolveMsgIsNull(resume.getStartFrom()));

        // 项目经历
        map.put("proj",parseProjectInfoMap(resume.getProjectInfo())  );
        // 教育经历
        map.put("edus",parseEducationInfoMap(resume.getEducationInfo() ));
        return map;
    }


    public String getImageBase64(String path) throws FileNotFoundException {
        BASE64Encoder encoder = new BASE64Encoder();
        //InputStream input = this.getClass().getResourceAsStream("/image.jpg");
        System.out.println(path);
        File file = new File(path);
        InputStream input = new FileInputStream(file);
        byte[] fileBytes = new byte[(int) file.length()];
        try {
            input.read(fileBytes);//读进fileBytes数组里面
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null)
                    input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return encoder.encodeBuffer(fileBytes).trim();
    }

    public List<Map<String,Object>> parseExperienceInfoToMap(ExperienceInfo[] exprs){
        List<Map<String,Object>> list = new ArrayList<>();
        if(exprs != null && exprs.length > 0){
            for (ExperienceInfo e: exprs) {
                Map<String,Object> map = new HashMap<>();
                map.put("startDate",ResumeUtil.resolveMsgIsNull(e.getStartDate()));
                map.put("endDate",ResumeUtil.resolveMsgIsNull(e.getEndDate()));
                map.put("company",ResumeUtil.resolveMsgIsNull(e.getCompany()));
                map.put("leader",ResumeUtil.resolveMsgIsNull(e.getLeader()));
                map.put("title",ResumeUtil.resolveMsgIsNull(e.getTitle()));
                map.put("summary",ResumeUtil.resolveMsgIsNull(e.getSummary()));
                map.put("companyDescription",ResumeUtil.resolveMsgIsNull(e.getCompanyDescription()));
                map.put("underlingNumber",ResumeUtil.resolveMsgIsNull(e.getUnderlingNumber()));
                map.put("reasonOfLeaving",ResumeUtil.resolveMsgIsNull(e.getReasonOfLeaving()));
                list.add(map);
            }
        }
        return list;
    }

    public List<Map<String,Object>> parseEducationInfoMap(EducationInfo[] edus){
        List<Map<String,Object>> list = new ArrayList<>();
        if (edus != null && edus.length > 0) {
            for (EducationInfo e:edus) {
                Map<String,Object> map = new HashMap<>();
                map.put("startDate",ResumeUtil.resolveMsgIsNull(e.getStartDate()));
                map.put("endDate",ResumeUtil.resolveMsgIsNull(e.getEndDate()));
                map.put("school",ResumeUtil.resolveMsgIsNull(e.getSchool()));
                map.put("speciality",ResumeUtil.resolveMsgIsNull(e.getSpeciality()));
                map.put("education",ResumeUtil.resolveMsgIsNull(e.getEducation()));
                list.add(map);
            }
        }
        return list;
    }

    public List<Map<String,Object>> parseProjectInfoMap(ProjectInfo[] pros){
        List<Map<String,Object>> list = new ArrayList<>();
        if (pros != null && pros.length > 0) {
            for (ProjectInfo e:pros) {
                Map<String,Object> map = new HashMap<>();
                map.put("startDate",ResumeUtil.resolveMsgIsNull(e.getStartDate()));
                map.put("endDate",ResumeUtil.resolveMsgIsNull(e.getEndDate()));
                map.put("projectName", ResumeUtil.resolveMsgIsNull(e.getProjectName()));
                map.put("projectDescription",ResumeUtil.resolveMsgIsNull(e.getProjectDescription()));
                map.put("responsibilities",ResumeUtil.resolveMsgIsNull(e.getResponsibilities()));
                list.add(map);
            }
        }
        return list;
    }
}
