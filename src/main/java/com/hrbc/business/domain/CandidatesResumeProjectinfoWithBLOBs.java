package com.hrbc.business.domain;

public class CandidatesResumeProjectinfoWithBLOBs extends CandidatesResumeProjectinfo {
    private String projectdescription;

    private String responsiblities;

    public String getProjectdescription() {
        return projectdescription;
    }

    public void setProjectdescription(String projectdescription) {
        this.projectdescription = projectdescription == null ? null : projectdescription.trim();
    }

    public String getResponsiblities() {
        return responsiblities;
    }

    public void setResponsiblities(String responsiblities) {
        this.responsiblities = responsiblities == null ? null : responsiblities.trim();
    }
}