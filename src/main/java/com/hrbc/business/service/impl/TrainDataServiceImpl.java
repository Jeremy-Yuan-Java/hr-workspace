package com.hrbc.business.service.impl;

import com.hrbc.business.common.JwtToken;
import com.hrbc.business.conf.PathConf;
import com.hrbc.business.conf.aop.ProcessLog;
import com.hrbc.business.domain.Staffs;
import com.hrbc.business.domain.TrainData;
import com.hrbc.business.domain.TrainDataExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.TrainDataMapper;
import com.hrbc.business.service.TrainDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

/**
 * @program: hr-workspace
 * @description: 培训资料业务层实现类
 * @author: 波波烤鸭
 * @create: 2019-10-17 16:34
 */
@Service
public class TrainDataServiceImpl implements TrainDataService {

    @Autowired
    private TrainDataMapper trainDataMapper;

    /**
     * 查询分页数据
     * @param params
     * @return
     */
    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {
        long count = 0;
        List<TrainData> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0){
                page = params.getPage();
            }
            if(params.getSize() >= 0){
                size = params.getSize();
            }
            TrainDataExample example = new TrainDataExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            example.createCriteria();
            example.getOredCriteria().get(0).andBacki1EqualTo(DelFlagE.NO.code);

            Staffs staff = JwtToken.getStaff(JwtToken.getUser());
            staff.getJobtitle();
            // 分页查询条件
            example.getOredCriteria().get(0).andAuthcUserLike("%" + staff.getJobtitle() +"%");

            TrainDataExample.Criteria criteria = example.createCriteria();
            criteria.andAuthcUserLike("%全部可见%");
            criteria.andBacki1EqualTo(DelFlagE.NO.code);
            example.or(criteria);


            count = trainDataMapper.countByExample(example);
            if (count > 0) {
                example.setOffset((page - 1) * size);
                example.setLimit(size);
                list = trainDataMapper.selectByExample(example);
            }

        }
        // 返回分页数据
        return new PageResultDTO(count, list);
    }

    @Override
    public Integer save(TrainData data) {
        data.setCreateUser(JwtToken.getUser());
        String fileName = data.getFileName();
        data.setFileUrl(data.getFileUrl());
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        if (suffix.contains("mp4") || suffix.contains("mov") || suffix.contains("avi")) {
            data.setFileType("视频");
        }


        if(data != null && !StringUtils.isEmpty(data.getId())){
            return trainDataMapper.updateByPrimaryKeySelective(data);
        }

        return trainDataMapper.insertSelective(data);
    }

    @Override
    @ProcessLog(businessName = "培训文档", methodName = "remove")
    public Integer remove(TrainData data) {
        data.setBacki1(DelFlagE.YES.code);
        return trainDataMapper.updateByPrimaryKeySelective(data);
    }
}
