package com.hrbc.business.domain.common;

import com.hrbc.business.domain.WorkPlan;

/**
 * @program: hr-workspace
 * @description: 工作计划传输对象
 * @author: 波波烤鸭
 * @create: 2019-11-30 18:53
 */
public class WorkPlanDto extends WorkPlan {

    // offer计划的完成情况
    private String offerComplete;

    // 绩效计划的完成情况
    private String performanceComplete;

    // 签约计划的完成情况
    private String signComplete;

    public String getOfferComplete() {
        return offerComplete;
    }

    public void setOfferComplete(String offerComplete) {
        this.offerComplete = offerComplete;
    }

    public String getPerformanceComplete() {
        return performanceComplete;
    }

    public void setPerformanceComplete(String performanceComplete) {
        this.performanceComplete = performanceComplete;
    }

    public String getSignComplete() {
        return signComplete;
    }

    public void setSignComplete(String signComplete) {
        this.signComplete = signComplete;
    }
}
