package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.CustomersExample;
import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CustomersMapper;
import com.hrbc.business.service.CustomersService;
import com.hrbc.business.util.Patten;
import com.hrbc.business.util.QuickTimeUtil;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    private CustomersMapper mapper;

    @Override
    public Customers get(Integer id) {

        return mapper.selectByPrimaryKey(id);
    }

    @Override
    @ProcessLog(businessName = "客户", methodName = "save")
    public int save(Customers entity) {
        CustomersExample example = new CustomersExample();
        example.createCriteria().andCnameEqualTo(entity.getCname());
        if (entity.getId() != null) {
            example.getOredCriteria().get(0).andIdNotEqualTo(entity.getId());
        }
        if (mapper.countByExample(example) > 0) {
            return -2;
        }
        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            entity.setUpdateuser(JwtToken.getUser());
            entity.setUpdatetime(new Date());
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            entity.setCreateuser(JwtToken.getUser());
            Staffs staffs = JwtToken.getStaff(JwtToken.getUser());

            entity.setOpsstaffno(staffs.getStaffno());
            entity.setOpsstaffname(staffs.getStaffname());
            entity.setOpsstaffid(staffs.getId());

            int i = mapper.insertSelective(entity);
            if (StringUtils.isEmpty(entity.getCno())) {
                String no = String.format("%06d", entity.getId());
                Customers n = new Customers();
                n.setCno(no);
                n.setId(entity.getId());
                mapper.updateByPrimaryKeySelective(n);
            }
            return i;

        }
    }

    @Override
    @ProcessLog(businessName = "客户", methodName = "changeOpsUser")
    public int changeOpsUser(Customers entity) {
        Customers n = new Customers();
        n.setId(entity.getId());
        n.setOpsstaffname(entity.getOpsstaffname());
        n.setOpsstaffno(entity.getOpsstaffno());
        return mapper.updateByPrimaryKeySelective(n);
    }

    @Override
    @ProcessLog(businessName = "客户", methodName = "saveCommunicate")
    public Customers saveCommunicate(Customers entity) {
        Customers customers = mapper.selectByPrimaryKey(entity.getId());
        JSONArray cs = null;

        if (customers.getFollowrec() == null) {
            cs = JSONArray.parseArray(new String("[]"));

        } else {
            cs = JSONArray.parseArray(new String(customers.getFollowrec()));
        }
        JSONObject obj = new JSONObject();
        obj.put("user", JwtToken.getUser());
        obj.put("stmp", DateFormatUtils.format(new Date(), Patten.DATETIME));
        obj.put("rec", entity.getCommunicaterec());
        cs.add(obj);
        entity.setFollowrec(JSONObject.toJSONString(cs).getBytes());
        mapper.updateByPrimaryKeySelective(entity);
        return entity;
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        long count = 0;
        List<Customers> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            Customers dto = null;
            CustomersExample example = new CustomersExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                Integer ownner = params.getQuery().getInteger("auth_ownner");
                dto = JSONObject.toJavaObject(params.getQuery(), Customers.class);
                example.createCriteria();
                if (ownner != null && !JwtToken.isAdmin()) {
                    Staffs staffs = JwtToken.getStaff(JwtToken.getUser());

                    example.getOredCriteria().get(0).andOpsstaffnoEqualTo(Optional.of(staffs).orElse(new Staffs()).getStaffno());
                }
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
                if (!StringUtils.isEmpty(dto.getCname())) {
                    example.getOredCriteria().get(0).andCnameLike("%" + dto.getCname() + "%");
                }
                if (!StringUtils.isEmpty(dto.getCno())) {
                    example.getOredCriteria().get(0).andCnoLike("%" + dto.getCno() + "%");
                }

                if (!StringUtils.isEmpty(dto.getBusinessstate())) {
                    example.getOredCriteria().get(0).andBusinessstateEqualTo(dto.getBusinessstate());
                }
                if (!StringUtils.isEmpty(dto.getVerify())) {
                    example.getOredCriteria().get(0).andVerifyEqualTo(dto.getVerify());
                }
                if (!StringUtils.isEmpty(dto.getOpsstaffno())) {
                    example.getOredCriteria().get(0).andOpsstaffnoEqualTo(dto.getOpsstaffno());
                }
                if (!StringUtils.isEmpty(dto.getOpsstaffname())) {
                    example.getOredCriteria().get(0).andOpsstaffnameLike("%" + dto.getOpsstaffname() + "%");

                }
                if (createtimest != null) {
                    createtimest = QuickTimeUtil.firstDate(createtimest);

                    example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    createtimeed = QuickTimeUtil.firstDate(createtimeed);

                    example.getOredCriteria().get(0).andCreatetimeLessThanOrEqualTo(createtimeed);
                }

            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExampleWithBLOBs(example);
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    @ProcessLog(businessName = "客户", methodName = "remove")
    public int remove(Customers dto) {

        Customers delDto = new Customers();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    public int changeState(Customers dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<Customers> query(CustomersExample example) {
        return mapper.selectByExample(example);
    }


    public static void main(String[] args) {
        System.out.printf(String.format("%04d", 1));

    }
}
