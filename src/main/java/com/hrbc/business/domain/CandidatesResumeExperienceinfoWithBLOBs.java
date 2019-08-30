package com.hrbc.business.domain;

public class CandidatesResumeExperienceinfoWithBLOBs extends CandidatesResumeExperienceinfo {
    private String achievement;

    private String companydescription;

    private String others;

    public String getAchievement() {
        return achievement;
    }

    public void setAchievement(String achievement) {
        this.achievement = achievement == null ? null : achievement.trim();
    }

    public String getCompanydescription() {
        return companydescription;
    }

    public void setCompanydescription(String companydescription) {
        this.companydescription = companydescription == null ? null : companydescription.trim();
    }

    public String getOthers() {
        return others;
    }

    public void setOthers(String others) {
        this.others = others == null ? null : others.trim();
    }
}