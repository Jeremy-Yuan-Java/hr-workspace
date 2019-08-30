package com.hrbc.business.domain.common;

import com.hrbc.business.domain.CandidatesResumeEducationinfo;
import com.hrbc.business.domain.CandidatesResumeExperienceinfoWithBLOBs;
import com.hrbc.business.domain.CandidatesResumeProjectinfoWithBLOBs;
import com.hrbc.business.domain.CandidatesWithBLOBs;

import java.util.List;

/**
 * @program: hr-workspace
 * @description: 候选人传输对象
 * @author: 波波烤鸭
 * @create: 2019-08-26 23:39
 */
public class CandidatesDto extends CandidatesWithBLOBs {

    private List<CandidatesResumeProjectinfoWithBLOBs> projects;

    private List<CandidatesResumeExperienceinfoWithBLOBs> exprs;

    private List<CandidatesResumeEducationinfo> edus;

    public List<CandidatesResumeExperienceinfoWithBLOBs> getExprs() {
        return exprs;
    }

    public void setExprs(List<CandidatesResumeExperienceinfoWithBLOBs> exprs) {
        this.exprs = exprs;
    }

    public List<CandidatesResumeEducationinfo> getEdus() {
        return edus;
    }

    public void setEdus(List<CandidatesResumeEducationinfo> edus) {
        this.edus = edus;
    }

    public List<CandidatesResumeProjectinfoWithBLOBs> getProjects() {
        return projects;
    }

    public void setProjects(List<CandidatesResumeProjectinfoWithBLOBs> projects) {
        this.projects = projects;
    }
}
