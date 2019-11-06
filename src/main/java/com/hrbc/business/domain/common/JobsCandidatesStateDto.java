package com.hrbc.business.domain.common;

import com.hrbc.business.domain.JobsCandidatesState;

/**
 * @program: hr-workspace
 * @description: 候选人职位状态的传输对象
 * @author: 波波烤鸭
 * @create: 2019-11-06 19:42
 */
public class JobsCandidatesStateDto extends JobsCandidatesState {

    private Integer candidatesid;

    private String candidatesname;

    private String jobno;

    private String jobdesc;

    private String cno;

    private String cname;

    public Integer getCandidatesid() {
        return candidatesid;
    }

    public void setCandidatesid(Integer candidatesid) {
        this.candidatesid = candidatesid;
    }

    public String getCandidatesname() {
        return candidatesname;
    }

    public void setCandidatesname(String candidatesname) {
        this.candidatesname = candidatesname;
    }

    public String getJobno() {
        return jobno;
    }

    public void setJobno(String jobno) {
        this.jobno = jobno;
    }

    public String getJobdesc() {
        return jobdesc;
    }

    public void setJobdesc(String jobdesc) {
        this.jobdesc = jobdesc;
    }

    public String getCno() {
        return cno;
    }

    public void setCno(String cno) {
        this.cno = cno;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
