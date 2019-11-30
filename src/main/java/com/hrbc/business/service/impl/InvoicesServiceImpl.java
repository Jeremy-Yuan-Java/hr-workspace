package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.CustomersExample;
import com.hrbc.business.domain.Invoices;
import com.hrbc.business.domain.InvoicesExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.InvoicesMapper;
import com.hrbc.business.service.CustomersService;
import com.hrbc.business.service.InvoicesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @program: hr-workspace
 * @description: 发票管理
 * @author: 波波烤鸭
 * @create: 2019-11-22 09:55
 */
@Service
public class InvoicesServiceImpl implements InvoicesService {

    @Autowired
    private InvoicesMapper mapper;

    @Autowired
    private CustomersService customersService;

    @Override
    public Invoices get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Invoices entity) {

        if(entity!= null && !StringUtils.isEmpty(entity.getCno())){
            CustomersExample example = new CustomersExample();
            example.createCriteria().andCnoEqualTo(entity.getCno());
            List<Customers> list = customersService.query(example);
            if(list != null && list.size() == 1){
                Customers c = list.get(0);
                entity.setCname(c.getCname());
            }
        }

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            entity.setUpdateuser(JwtToken.getUser());
            entity.setUpdatetime(new Date());

            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            // 录入申请人
            entity.setProposer(JwtToken.getUser());
            entity.setProposername(JwtToken.getUserName(JwtToken.getUser()));
            entity.setDrawer(JwtToken.getUser());
            entity.setDrawername(JwtToken.getUserName(JwtToken.getUser()));

            // 开票状态 默认为待开
            entity.setInvoicestatus("待开");
            entity.setCreatetime(new Date());
            entity.setCreateuser(JwtToken.getUser());
            return mapper.insertSelective(entity);
        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {
        long count = 0;
        List<Invoices> list = new ArrayList<>();
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            Invoices dto = null;

            Date createtimest = params.getQuery().getDate("createtimest");
            Date createtimeed = params.getQuery().getDate("createtimeed");

            String ismy = params.getQuery().getString("ismy");

            InvoicesExample example = new InvoicesExample();
            example.createCriteria();

            example.getOredCriteria().get(0).andIsdeleteEqualTo(DelFlagE.NO.code);
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }

            if(ismy != null && "yes".equals(ismy)){
                String username = JwtToken.getUser();
                example.getOredCriteria().get(0).andProposerEqualTo(username);
            }

            if (params.getQuery() != null) {
                dto = JSONObject.toJavaObject(params.getQuery(), Invoices.class);
                /*if(!StringUtils.isEmpty(dto.getOpuser())){
                    example.getOredCriteria().get(0).andOpuserEqualTo(dto.getOpuser());
                }*/

                if (createtimest != null) {
                    example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    example.getOredCriteria().get(0).andCreatetimeLessThanOrEqualTo(createtimeed);
                }

                if(!StringUtils.isEmpty(dto.getCno())){
                    example.getOredCriteria().get(0).andCnoEqualTo(dto.getCno());
                }
                if(!StringUtils.isEmpty(dto.getProposer())){
                    example.getOredCriteria().get(0).andProposerEqualTo(dto.getProposer());
                }
                if(!StringUtils.isEmpty(dto.getInvoicetype())){
                    example.getOredCriteria().get(0).andInvoicetypeEqualTo(dto.getInvoicetype());
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
    public int remove(Invoices dto) {
        Invoices invoices = new Invoices();
        invoices.setId(dto.getId());
        invoices.setIsdelete(DelFlagE.YES.code);
        return mapper.updateByPrimaryKeySelective(invoices);
    }
}
