package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.StaffsExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.StaffsMapper;
import com.hrbc.business.service.StaffsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class StaffsServiceImpl implements StaffsService {
    @Autowired
    private StaffsMapper mapper;

    @Override
    public Staffs get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(Staffs entity) {

        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            int i = mapper.insertSelective(entity);
            String no = String.format("%08d", entity.getId());
            Staffs n = new Staffs();
            n.setStaffno(no);
            n.setId(entity.getId());
            mapper.updateByPrimaryKeySelective(n);
            return i;

        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {

        int count = 0;
        List<Staffs> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            Staffs dto = null;
            StaffsExample example = new StaffsExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                dto = JSONObject.toJavaObject(params.getQuery(), Staffs.class);
                example.createCriteria();
                if (dto.getDelflag() == null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(DelFlagE.NO.code);
                }
                if (dto.getDelflag() != null) {
                    example.getOredCriteria().get(0).andDelflagEqualTo(dto.getDelflag());

                }
                if (!StringUtils.isEmpty(dto.getState())) {
                    example.getOredCriteria().get(0).andStateEqualTo(dto.getState());

                }

                if (!StringUtils.isEmpty(dto.getStaffname())) {
                    example.getOredCriteria().get(0).andStaffnameLike("%" + dto.getStaffname() + "%");

                }
                if (!StringUtils.isEmpty(dto.getStaffno())) {
                    example.getOredCriteria().get(0).andStaffnoLike("%" + dto.getStaffno() + "%");

                }
                if (!StringUtils.isEmpty(dto.getPhoneno())) {
                    example.getOredCriteria().get(0).andPhonenoLike("%" + dto.getPhoneno() + "%");

                }
                if (!StringUtils.isEmpty(dto.getPhonenobak())) {
                    example.getOredCriteria().get(0).andPhonenobakLike("%" + dto.getPhonenobak() + "%");

                }
                if (!StringUtils.isEmpty(dto.getEmail())) {
                    example.getOredCriteria().get(0).andEmailLike("%" + dto.getEmail() + "%");

                }
                if (!StringUtils.isEmpty(dto.getIdcard())) {
                    example.getOredCriteria().get(0).andIdcardLike("%" + dto.getIdcard() + "%");
                }
                if (!StringUtils.isEmpty(dto.getJobtitle())) {
                    example.getOredCriteria().get(0).andJobtitleLike("%" + dto.getJobtitle() + "%");
                }
            }
            count = mapper.countByExample(example);

            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = mapper.selectByExample(example);
                list.forEach(s -> {
                    s.setPicpath(PathConf.ACCESS_PATH_PIC+s.getPicpath());
                });
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    public int remove(Staffs dto) {

        Staffs delDto = new Staffs();
        delDto.setId(dto.getId());
        delDto.setDelflag(DelFlagE.YES.code);

        return mapper.updateByPrimaryKeySelective(delDto);
    }

    @Override
    public int changeState(Staffs dto) {

        return mapper.updateByPrimaryKeySelective(dto);
    }

    @Override
    public List<Staffs> query(StaffsExample example) {
        return mapper.selectByExample(example);
    }
}
