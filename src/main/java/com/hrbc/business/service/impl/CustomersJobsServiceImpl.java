package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.*;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CustomersJobsMapper;
import com.hrbc.business.mapper.CustomersJobsTeamMapper;
import com.hrbc.business.service.CustomersJobsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CustomersJobsServiceImpl implements CustomersJobsService {
    @Autowired
    private CustomersJobsMapper mapper;
    @Autowired
    private CustomersJobsTeamMapper teamMapper;

    @Override
    public CustomersJobs get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    @ProcessLog(businessName = "职位", methodName = "save")

    public int save(CustomersJobs entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            entity.setUpdateuser(JwtToken.getUser());

            int i = mapper.updateByPrimaryKeySelective(entity);
            //更新全文检索
            updateFulltext(entity, 2);
            updateOpsTeam(entity, 2);
            return i;
        } else {
            updateFulltext(entity, 1);
            entity.setCreateuser(JwtToken.getUser());

            int i = mapper.insertSelective(entity);
            if (StringUtils.isEmpty(entity.getJobno())) {
                String no = String.format("%06d", entity.getId());
                CustomersJobs n = new CustomersJobs();
                n.setJobno(no);
                n.setId(entity.getId());
                entity.setUpdateuser(JwtToken.getUser());
                mapper.updateByPrimaryKeySelective(n);
            }
            updateOpsTeam(entity, 1);
            return i;


        }
    }

    @ProcessLog(businessName = "职位", methodName = "updateOpsTeam")
    private void updateOpsTeam(CustomersJobs entity, int op) {
        if (entity.getId() == null) {
            return;
        }

        Set<Integer> users = Sets.newHashSet();

        if (!StringUtils.isEmpty(entity.getOpsteam())) {
            List<String> team = Lists.newArrayList(entity.getOpsteam().split(","));
            users.addAll(team.stream().map(n -> Integer.parseInt(n)).collect(Collectors.toList()));

        }
        if (!StringUtils.isEmpty(entity.getOpuser())) {
            users.add(Integer.parseInt(entity.getOpuser()));
        }
        if (users.size() > 0) {
            List<CustomersJobsTeam> list = users.stream().map(sid -> {
                CustomersJobsTeam team = new CustomersJobsTeam();
                team.setCreatetime(new Date());
                team.setJobid(entity.getId());
                team.setStaffid(sid);
                team.setUsername(JwtToken.getUser());
                return team;
            }).collect(Collectors.toList());
            CustomersJobsTeamExample example = new CustomersJobsTeamExample();
            example.createCriteria().andJobidEqualTo(entity.getId());
            teamMapper.deleteByExample(example);
            teamMapper.batchInsert(list);
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
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                Integer ownner = params.getQuery().getInteger("auth_ownner");

                example.createCriteria();
                if (ownner != null && !JwtToken.isAdmin()) {

                    Staffs staffs = JwtToken.getStaff(JwtToken.getUser());
                    CustomersJobsTeamExample teamExample = new CustomersJobsTeamExample();
                    teamExample.createCriteria().andStaffidEqualTo(staffs.getId());
                    List<CustomersJobsTeam> team = teamMapper.selectByExample(teamExample);
                    List<Integer> jobids = Optional.of(team).orElse(Lists.newArrayList()).stream().map(n -> n.getJobid()).collect(Collectors.toList());
                    jobids.add(-100);
                    example.getOredCriteria().get(0).andIdIn(jobids);
                }


                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
                if (!StringUtils.isEmpty(dto.getJobno())) {
                    example.getOredCriteria().get(0).andJobnoEqualTo(dto.getJobno());
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

                if (!StringUtils.isEmpty(dto.getCno())) {
                    example.getOredCriteria().get(0).andCnoEqualTo(dto.getCno());
                }

                if (publishtimest != null) {
                    example.getOredCriteria().get(0).andPublishtimeGreaterThanOrEqualTo(publishtimest);
                }
                if (publishtimeed != null) {
                    example.getOredCriteria().get(0).andPublishtimeLessThanOrEqualTo(publishtimeed);
                }


                if (createtimest != null) {
                    example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    example.getOredCriteria().get(0).andCreatetimeLessThanOrEqualTo(createtimeed);
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
    @ProcessLog(businessName = "职位", methodName = "remove")
    public int remove(CustomersJobs dto) {

        CustomersJobs delDto = new CustomersJobs();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    @ProcessLog(businessName = "职位", methodName = "changeState")
    public int changeState(CustomersJobs dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<CustomersJobs> query(CustomersJobsExample example) {
        return mapper.selectByExample(example);
    }
}
