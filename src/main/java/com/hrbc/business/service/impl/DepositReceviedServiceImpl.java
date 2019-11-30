package com.hrbc.business.service.impl;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.hrbc.business.common.JwtToken;
import com.hrbc.business.domain.Customers;
import com.hrbc.business.domain.DepositRecevied;
import com.hrbc.business.domain.common.PageQueryParamDTO;
import com.hrbc.business.domain.common.PageResultDTO;
import com.hrbc.business.mapper.PerformanceMapper;
import com.hrbc.business.service.DepositReceviedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @program: hr-workspace
 * @description: 预收业绩业务层
 * @author: 波波烤鸭
 * @create: 2019-11-19 16:24
 */
@Service
public class DepositReceviedServiceImpl implements DepositReceviedService {

    @Autowired
    private PerformanceMapper mapper;

    @Override
    public PageResultDTO loadPage(PageQueryParamDTO params) {
        long count = 0;
        List<DepositRecevied> list = null;
        int page = 1;
        int size = 10;
        if (params != null) {
            if (params.getPage() >= 0) {
                page = params.getPage();
            }
            if (params.getSize() >= 0) {
                size = params.getSize();
            }
            DepositRecevied dto = null;
            /*CustomersExample example = new CustomersExample();
            if (!StringUtils.isEmpty(params.getOrderby())) {
                example.setOrderByClause(params.getOrderby());
            }*/
            if (params.getQuery() != null) {
                Date createtimest = params.getQuery().getDate("createtimest");
                Date createtimeed = params.getQuery().getDate("createtimeed");
                dto = JSONObject.toJavaObject(params.getQuery(), DepositRecevied.class);

                dto.setCreatetimest(createtimest);
                dto.setCreatetimeed(createtimeed);

                String ismy = params.getQuery().getString("ismy");
                if(ismy != null && "yes".equals(ismy)){
                    String username = JwtToken.getUser();
                    dto.setOpuser(username);
                }


            }
            count = mapper.countDepositRecevied(dto);

            if (count > 0) {
                /*example.setOffset((page - 1) * size);
                example.setLimit(size);*/
                dto.setOfferset((page - 1) * size);
                dto.setLimit(size);
                list = mapper.queryDepositRecevied(dto);
                // 计算预收业绩和预估回款时间
                for (DepositRecevied dr: list) {
                    String deducts = dr.getDeducts();
                    // [{"money":"20","deduct":"3"},{"money":"30","ratio":"20"}]
                    // offer 额
                    double offermoney = dr.getOffermoney();
                    if(!StringUtils.isEmpty(deducts)){
                        JSONArray array = JSONArray.parseArray(deducts);
                        for (int i = 0 ; i < array.size() ; i++){
                            JSONObject obj = array.getJSONObject(i);
                            String moneyStr = obj.getString("money");
                            if(!StringUtils.isEmpty(moneyStr)){
                                double money = Double.parseDouble(moneyStr.trim())*10000;
                                String deductStr = obj.getString("deduct");
                                double depositMoney = 0;
                                if(!StringUtils.isEmpty(deductStr)){
                                    depositMoney = Double.parseDouble(deductStr.trim()) * 10000;
                                }else{
                                    String ratioStr = obj.getString("ratio");
                                    depositMoney = offermoney * Double.parseDouble(ratioStr.toString()) / 100;
                                }
                                if(offermoney < money){
                                    dr.setDeposit(depositMoney);
                                    break;
                                }
                            }
                        }
                    }
                    // [{"day":"30","ratio":"100"}]
                    String payments = dr.getPayments();
                    if(!StringUtils.isEmpty(payments)){
                        StringBuilder sb = new StringBuilder();
                        JSONArray array = JSONArray.parseArray(payments);
                        // 入职时间
                        Date entrytime = dr.getEntrytime();
                        for(int i = 0 ; i < array.size() ; i++){
                            JSONObject obj = array.getJSONObject(i);
                            int day = Integer.parseInt(obj.getString("day") );
                            double ratio = Double.parseDouble(obj.getString("ratio"))/100;
                            // 计算到账时间
                            Calendar c = Calendar.getInstance();
                            c.setTime(entrytime);
                            c.add(Calendar.DAY_OF_MONTH,day);

                            if (dto.getCreatetimest() != null && dto.getCreatetimeed() != null){
                                if(c.getTime().getTime() < dto.getCreatetimest().getTime() || c.getTime().getTime() > dto.getCreatetimeed().getTime()){
                                    break;
                                }
                            }
                            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                            sb.append(sdf.format(c.getTime()));
                            sb.append(" 到账:");
                            sb.append(dr.getDeposit()*ratio + "元 </br>");
                        //[{"day":"7","ratio":"50"},{"day":"14","ratio":"50"}]
                        }
                        dr.setEstimatetime(sb.toString());
                    }
                    String ensurences = dr.getEnsurences();

                }
            }
        }

        // 返回分页数据
        return new PageResultDTO(count, list);
    }
}
