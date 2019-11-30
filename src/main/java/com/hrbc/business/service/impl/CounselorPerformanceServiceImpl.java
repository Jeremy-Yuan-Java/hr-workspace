package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.CounselorPerformanceDeduct;
import com.hrbc.business.domain.CounselorPerformanceDeductExample;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.domain.enums.DelFlagE;
import com.hrbc.business.mapper.CounselorPerformanceDeductMapper;
import com.hrbc.business.mapper.JobsCandidatesStateMapper;
import com.hrbc.business.service.CounselorPerformanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @program: hr-workspace
 * @description: 员工绩效提成信息
 * @author: 波波烤鸭
 * @create: 2019-11-16 15:15
 */
@Service
public class CounselorPerformanceServiceImpl implements CounselorPerformanceService {

    @Autowired
    private CounselorPerformanceDeductMapper mapper;



    @Override
    public CounselorPerformanceDeduct get(Integer id) {
        return mapper.selectByPrimaryKey(id);
    }

    @Override
    public int save(CounselorPerformanceDeduct entity) {
        if (entity != null && !StringUtils.isEmpty(entity.getId())) {
            entity.setUpdatetime(new Date());
            return mapper.updateByPrimaryKeySelective(entity);
        } else {
            entity.setCreateuser(JwtToken.getUser());
            entity.setCreatetime(new Date());
            int count = mapper.insertSelective(entity);
            return count;
        }
    }

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {
        long count = 0;
        List<CounselorPerformanceDeduct> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            CounselorPerformanceDeduct dto = null;
            CounselorPerformanceDeductExample example = new CounselorPerformanceDeductExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }
            if (params.getQuery() != null) {
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                dto = JSONObject.toJavaObject(params.getQuery(), CounselorPerformanceDeduct.class);
                example.createCriteria();
                //example.getOredCriteria().get(0).andIsdeleteEqualTo(DelFlagE.NO.code);
                String ismy = params.getQuery().getString("ismy");
                if(ismy != null && "yes".equals(ismy)){
                    String username = JwtToken.getUser();
                    example.getOredCriteria().get(0).andUsernameEqualTo(username);
                }

                if (createtimest != null) {
                    //example.getOredCriteria().get(0).andCreatetimeGreaterThanOrEqualTo(createtimest);
                    example.getOredCriteria().get(0).andAccounttimeGreaterThanOrEqualTo(createtimest);
                }
                if (createtimeed != null) {
                    example.getOredCriteria().get(0).andAccounttimeLessThanOrEqualTo(createtimeed);
                }
                if(!StringUtils.isEmpty(dto.getUsername())){
                    example.getOredCriteria().get(0).andUsernameEqualTo(dto.getUsername());
                }
                if(!StringUtils.isEmpty(dto.getDeducttype())){
                    example.getOredCriteria().get(0).andDeducttypeEqualTo(dto.getDeducttype());
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
    public int remove(CounselorPerformanceDeduct dto) {
        return 0;
    }
}
