package com.hrbc.business.service;

import com.hrbc.business.domain.TrainData;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;

public interface TrainDataService {
    /**
     * 查询分页数据
     * @param params
     * @return
     */
    public PageResultDTO loadPage(PageQueryParamDTO params);

    public Integer save(TrainData data);


    public Integer remove(TrainData data);
}
