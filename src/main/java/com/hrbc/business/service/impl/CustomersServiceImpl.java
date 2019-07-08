package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.CustomersExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CustomersMapper;
import com.hrbc.business.service.CustomersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class CustomersServiceImpl implements CustomersService {
    @Autowired
    private CustomersMapper mapper;

    @Override
    public Customers get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Customers entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            int i =  mapper.insertSelective(entity);
            String no = String.format("%08d", entity.getId());
            Customers n = new Customers();
            n.setCno(no);
            n.setId(entity.getId());
            mapper.updateByPrimaryKeySelective(n);
            return i;

        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        int count = 0;
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
                dto = JSONObject.toJavaObject(params.getQuery(), Customers.class);
                example.createCriteria();
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
                if (!StringUtils.isEmpty(dto.getOpsstaffname())) {
                    example.getOredCriteria().get(0).andOpsstaffnameLike("%" + dto.getOpsstaffname() + "%");

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
