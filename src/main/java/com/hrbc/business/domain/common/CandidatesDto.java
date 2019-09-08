package com.hrbc.business.domain.common;

import com.hrbc.business.domain.CandidatesWithBLOBs;
import com.hrbc.business.domain.aliylincv.EducationInfo;
import com.hrbc.business.domain.aliylincv.ExperienceInfo;
import com.hrbc.business.domain.aliylincv.ProjectInfo;

/**
 * @program: hr-workspace
 * @description: 候选人传输对象
 * @author: 波波烤鸭
 * @create: 2019-08-26 23:39
 */
public class CandidatesDto extends CandidatesWithBLOBs {

    private String startfrom;

    private String isjob;

    private String hxys;

    private String qzyy;

    private String jtqk;

    private ExperienceInfo[] exprs;

    private ProjectInfo[] projects;

    private EducationInfo[] edus;

    public ExperienceInfo[] getExprs() {
        return exprs;
    }

    public void setExprs(ExperienceInfo[] exprs) {
        // 调整 时间类型的字符串
        if (exprs != null && exprs.length > 0) {
            for (ExperienceInfo e : exprs) {
                if (e.getStartDate() != null && e.getStartDate().contains("T")) {
                    // 2019.09.02T16:00:00.000Z
                    String msg = e.getStartDate();
                    e.setStartDate(msg.substring(0,msg.indexOf("T")));
                }
                if (e.getEndDate() != null && e.getEndDate().contains("T")) {
                    String msg = e.getEndDate();
                    e.setEndDate(msg.substring(0,msg.indexOf("T")));
                }
            }
        }
        this.exprs = exprs;
    }

    public ProjectInfo[] getProjects() {
        return projects;
    }

    public void setProjects(ProjectInfo[] projects) {
        // 调整 时间类型的字符串
        if (projects != null && projects.length > 0) {
            for (ProjectInfo e : projects) {
                if (e.getStartDate() != null && e.getStartDate().contains("T")) {
                    // 2019.09.02T16:00:00.000Z
                    String msg = e.getStartDate();
                    e.setStartDate(msg.substring(0,msg.indexOf("T")));
                }
                if (e.getEndDate() != null && e.getEndDate().contains("T")) {
                    String msg = e.getEndDate();
                    e.setEndDate(msg.substring(0,msg.indexOf("T")));
                }
            }
        }
        this.projects = projects;
    }

    public EducationInfo[] getEdus() {
        return edus;
    }

    public void setEdus(EducationInfo[] edus) {
        // 调整 时间类型的字符串
        if (edus != null && edus.length > 0) {
            for (EducationInfo e : edus) {
                if (e.getStartDate() != null  && e.getStartDate().contains("T")) {
                    // 2019.09.02T16:00:00.000Z
                    String msg = e.getStartDate();
                    e.setStartDate(msg.substring(0,msg.indexOf("T")));
                }
                if (e.getEndDate() != null  && e.getEndDate().contains("T")) {
                    String msg = e.getEndDate();
                    e.setEndDate(msg.substring(0,msg.indexOf("T")));
                }
            }
        }
        this.edus = edus;
    }

    public String getStartfrom() {
        return startfrom;
    }

    public void setStartfrom(String startfrom) {
        this.startfrom = startfrom;
    }

    public String getIsjob() {
        return isjob;
    }

    public void setIsjob(String isjob) {
        this.isjob = isjob;
    }

    public String getHxys() {
        return hxys;
    }

    public void setHxys(String hxys) {
        this.hxys = hxys;
    }

    public String getQzyy() {
        return qzyy;
    }

    public void setQzyy(String qzyy) {
        this.qzyy = qzyy;
    }

    public String getJtqk() {
        return jtqk;
    }

    public void setJtqk(String jtqk) {
        this.jtqk = jtqk;
    }

}
