package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.CustomersJobs;
import com.hrbc.business.domain.CustomersJobsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CustomersJobsMapper;
import com.hrbc.business.service.CustomersJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
public class CustomersJobsServiceImpl implements CustomersJobsService {
    @Autowired
    private CustomersJobsMapper mapper;

    @Override
    public CustomersJobs get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(CustomersJobs entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            int i = mapper.updateByPrimaryKeySelective(entity);
            //更新全文检索
            updateFulltext(entity, 2);
            return i;
        } else {
            updateFulltext(entity, 1);
            int i = mapper.insertSelective(entity);
            String no = String.format("%06d", entity.getId());
            CustomersJobs n = new CustomersJobs();
            n.setJobno(no);
            n.setId(entity.getId());
            entity.setUpdateuser(JwtToken.getUser());
            mapper.updateByPrimaryKeySelective(n);
            return i;


        }
    }


    private void updateFulltext(CustomersJobs entity, int op) {
        if (op == 2) {

            entity = mapper.selectByPrimaryKey(entity.getId());
        }

        StringBuilder stringBuilder = new StringBuilder();
        if (!StringUtils.isEmpty(entity.getJobdesc())) {
            stringBuilder.append(entity.getJobdesc()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getJobno())) {
            stringBuilder.append(entity.getJobno()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getJobresource())) {
            stringBuilder.append(entity.getJobresource()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getJobstate())) {
            stringBuilder.append(entity.getJobstate()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getPhoneno())) {
            stringBuilder.append(entity.getPhoneno()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getOpuser())) {
            stringBuilder.append(entity.getOpuser()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getOpsteam())) {
            stringBuilder.append(entity.getOpsteam()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getCno())) {
            stringBuilder.append(entity.getCno()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getCname())) {
            stringBuilder.append(entity.getCname()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getTargetcompany())) {
            stringBuilder.append(entity.getTargetcompany()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getWorkbase())) {
            stringBuilder.append(entity.getWorkbase()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getMajor())) {
            stringBuilder.append(entity.getMajor()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getContactuser())) {
            stringBuilder.append(entity.getContactuser()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getEmail())) {
            stringBuilder.append(entity.getEmail()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getInterviewflow())) {
            stringBuilder.append(entity.getInterviewflow()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getInterviewqs())) {
            stringBuilder.append(entity.getInterviewqs()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getInterviewer())) {
            stringBuilder.append(entity.getInterviewer()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getOpusername())) {
            stringBuilder.append(entity.getOpusername()).append(",");
        }
        if (!StringUtils.isEmpty(entity.getPublishtime())) {
            stringBuilder.append(entity.getPublishtime()).append(",");
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
            CustomersJobs dto = new CustomersJobs();
            dto.setFulltexts(entity.getFulltexts());
            dto.setId(entity.getId());
            mapper.updateByPrimaryKeySelective(dto);
        }


    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
        List<CustomersJobs> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            CustomersJobs dto = null;
            CustomersJobsExample example = new CustomersJobsExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                dto = JSONObject.toJavaObject(params.getQuery(), CustomersJobs.class);
                Date publishtimest = params.getQuery().getDate("publishtimest");
                Date publishtimeed = params.getQuery().getDate("publishtimeed");

                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
                if (!StringUtils.isEmpty(dto.getJobdesc())) {
                    example.getOredCriteria().get(0).andJobdescLike("%" + dto.getJobdesc() + "%");
                }
                if (!StringUtils.isEmpty(dto.getMajor())) {
                    example.getOredCriteria().get(0).andMajorLike("%" + dto.getMajor() + "%");
                }
                if (!StringUtils.isEmpty(dto.getWorkbase())) {
                    example.getOredCriteria().get(0).andWorkbaseEqualTo(dto.getWorkbase());
                }
                if (!StringUtils.isEmpty(dto.getTargetcompany())) {
                    example.getOredCriteria().get(0).andTargetcompanyLike("%" + dto.getTargetcompany() + "%");
                }

                if (publishtimest != null) {
                    example.getOredCriteria().get(0).andPublishtimeGreaterThanOrEqualTo(publishtimest);
                }
                if (publishtimeed != null) {
                    example.getOredCriteria().get(0).andPublishtimeLessThanOrEqualTo(publishtimeed);
                }


                if (dto.getSalarymin() != null) {
                    example.getOredCriteria().get(0).andSalarymaxGreaterThanOrEqualTo(dto.getSalarymin());
                }
                if (dto.getSalarymax() != null) {
                    example.getOredCriteria().get(0).andSalaryminLessThanOrEqualTo(dto.getSalarymax());
                }
                if (!StringUtils.isEmpty(dto.getFulltexts())) {
                    example.getOredCriteria().get(0).andFulltextsLike("%" + dto.getFulltexts() + "%");
                }


            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExample(example);
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    public int remove(CustomersJobs dto) {

        CustomersJobs delDto = new CustomersJobs();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    public int changeState(CustomersJobs dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<CustomersJobs> query(CustomersJobsExample example) {
        return mapper.selectByExample(example);
    }
}
