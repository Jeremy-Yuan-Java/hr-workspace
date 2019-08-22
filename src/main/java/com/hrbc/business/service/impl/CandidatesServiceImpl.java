package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.Candidates;
import com.hrbc.business.domain.CandidatesExample;
import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CandidatesMapper;
import com.hrbc.business.service.CandidatesService;
import com.hrbc.business.util.QuickTimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class CandidatesServiceImpl implements CandidatesService {
    @Autowired
    private CandidatesMapper mapper;

    @Override
    public CandidatesWithBLOBs getWithBLOBs(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public Candidates get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }



    @Override
    @ProcessLog(businessName = "候选人管理",methodName = "save")
    public int save(CandidatesWithBLOBs entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            if(checkPhoneNo(entity,2)){
                return -3;
            }
            entity.setUpdateuser(JwtToken.getUser());

            int i = mapper.updateByPrimaryKeySelective(entity);
            //更新全文检索
            updateFulltext(entity, 2);

            return i;
        } else {

            if(checkPhoneNo(entity,1)){
                return -3;
            }
            entity.setCreateuser(JwtToken.getUser());

            updateFulltext(entity, 1);
            return mapper.insertSelective(entity);

        }
    }

    private boolean checkPhoneNo(CandidatesWithBLOBs candidates ,int op ){
        if(StringUtils.isEmpty(candidates.getPhoneno())){
            return false;
        }
        //1 代表新增 2代表编辑
        CandidatesExample candidatesExample = new CandidatesExample();
        candidatesExample.createCriteria().andPhonenoEqualTo(candidates.getPhoneno()).andDelflagEqualTo(DelFlagE.NO.code);
        if(op==2){
            candidatesExample.getOredCriteria().get(0).andIdNotEqualTo(candidates.getId());
        }
        if(mapper.countByExample(candidatesExample)>0){
            return true;
        }else{
            return false;
        }

    }


    /**
     * 1 新增时候  2 编辑时候
     *
     * @param entity
     * @param op
     */
    private void updateFulltext(CandidatesWithBLOBs entity, int op) {
        if (op == 2) {

            entity = mapper.selectByPrimaryKey(entity.getId());
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (!StringUtils.isEmpty(entity.getUsername())) {
            stringBuilder.append(entity.getUsername()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getCertifications())) {
            stringBuilder.append(entity.getCertifications()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getDegree())) {
            stringBuilder.append(entity.getDegree()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getEmail())) {
            stringBuilder.append(entity.getEmail()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getPhoneno())) {
            stringBuilder.append(entity.getPhoneno()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getExpectjob())) {
            stringBuilder.append(entity.getExpectjob()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getExpectworkbase())) {
            stringBuilder.append(entity.getExpectworkbase()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getTags())) {
            stringBuilder.append(entity.getTags()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getJobtitle())) {
            stringBuilder.append(entity.getJobtitle()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getGender())) {
            stringBuilder.append(entity.getGender()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getEdu1())) {
            stringBuilder.append(entity.getEdu1()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getEdu2())) {
            stringBuilder.append(entity.getEdu2()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getEdu3())) {
            stringBuilder.append(entity.getEdu3()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork1())) {
            stringBuilder.append(entity.getWork1()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getPersonaliy())) {
            stringBuilder.append(entity.getPersonaliy()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork2())) {
            stringBuilder.append(entity.getWork2()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork3())) {
            stringBuilder.append(entity.getWork3()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork4())) {
            stringBuilder.append(entity.getWork4()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork1projs())) {
            stringBuilder.append(entity.getWork1projs()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork2projs())) {
            stringBuilder.append(entity.getWork2projs()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork3projs())) {
            stringBuilder.append(entity.getWork3projs()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWork4projs())) {
            stringBuilder.append(entity.getWork4projs()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getRemark())) {
            stringBuilder.append(entity.getRemark()).append(",");
        }
        String full = stringBuilder.toString();
        if (full.length() > 2999) {
            entity.setFulltexts(full.substring(0, 2999));
        } else {
            entity.setFulltexts(full);

        }
        if (op == 2) {
            CandidatesWithBLOBs candidates = new CandidatesWithBLOBs();
            candidates.setFulltexts(entity.getFulltexts());
            candidates.setId(entity.getId());
            mapper.updateByPrimaryKeySelective(candidates);
        }


    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
        List<CandidatesWithBLOBs> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            CandidatesWithBLOBs dto = null;
            CandidatesExample example = new CandidatesExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {

                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");

                dto = JSONObject.toJavaObject(params.getQuery(), CandidatesWithBLOBs.class);
                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
                if (!StringUtils.isEmpty(dto.getUsername())) {
                    example.getOredCriteria().get(0).andUsernameEqualTo(dto.getUsername());
                }
                if (!StringUtils.isEmpty(dto.getPhoneno())) {
                    example.getOredCriteria().get(0).andPhonenobakEqualTo(dto.getPhoneno());
                }
                if (!StringUtils.isEmpty(dto.getEmail())) {
                    example.getOredCriteria().get(0).andEmailEqualTo(dto.getEmail());
                }
                if (!StringUtils.isEmpty(dto.getExpectworkbase())) {
                    example.getOredCriteria().get(0).andUsernameEqualTo(dto.getExpectworkbase());
                }

                if (!StringUtils.isEmpty(dto.getJobtitle())) {
                    example.getOredCriteria().get(0).andJobtitleLike("%" + dto.getJobtitle() + "%");
                }

                if (!StringUtils.isEmpty(dto.getWork1())) {
                    example.getOredCriteria().get(0).andJobtitleLike("%" + dto.getWork1() + "%");
                }

                if (!StringUtils.isEmpty(dto.getEdu1())) {
                    example.getOredCriteria().get(0).andJobtitleLike("%" + dto.getEdu1() + "%");
                }
               /* if (!StringUtils.isEmpty(dto.getFulltexts())) {
                    example.getOredCriteria().get(0).andFulltextsLike("%" + dto.getFulltexts() + "%");
                }*/

                if (!StringUtils.isEmpty(dto.getWorkyears())) {
                    example.getOredCriteria().get(0).andWorkyearsGreaterThan(dto.getWorkyears());
                }
                if (createtimest != null) {
                    createtimest = QuickTimeUtil.firstDate(createtimest);
                    example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    createtimeed = QuickTimeUtil.lastDate(createtimeed);
                    example.getOredCriteria().get(0).andCreatetimeLessThanOrEqualTo(createtimeed);
                }


            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExampleWithBLOBs(example);

                list.forEach(s -> {
                    if (!StringUtils.isEmpty(s.getPicpath())) {

                        s.setPicpath(PathConf.ACCESS_PATH_PIC + s.getPicpath());
                    }
                    if (!StringUtils.isEmpty(s.getPostcard())) {

                        s.setPostcard(PathConf.ACCESS_PATH_POSTCARD + s.getPostcard());
                    }
                    if (!StringUtils.isEmpty(s.getResumefile())) {

                        s.setResumefile(PathConf.ACCESS_PATH_RESUME + s.getResumefile());
                    }
                });
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    @ProcessLog(businessName = "候选人管理",methodName = "remove")

    public int remove(CandidatesWithBLOBs dto) {

        CandidatesWithBLOBs delDto = new CandidatesWithBLOBs();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    @ProcessLog(businessName = "候选人管理",methodName = "changeState")

    public int changeState(CandidatesWithBLOBs dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<Candidates> query(CandidatesExample example) {
        return mapper.selectByExample(example);
    }
}
