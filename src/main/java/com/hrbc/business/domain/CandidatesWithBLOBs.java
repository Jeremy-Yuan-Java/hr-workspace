package com.hrbc.business.domain;

public class CandidatesWithBLOBs extends Candidates {
    private byte[] resumedetail;

    private byte[] resumedetail1;

    private byte[] resumedetail2;

    private String certifications;

    private String educations;

    private String workexperiences;

    private String perprofile;

    private String work1desc;

    private String work1projs;

    private String work2desc;

    private String work2projs;

    private String work3desc;

    private String work3projs;

    private String work4projs;

    private String fulltexts;

    private String educationdetail;

    private String experiencedetail;

    private String training;

    private String skill;

    private String team;

    private String volunteer;

    public byte[] getResumedetail() {
        return resumedetail;
    }

    public void setResumedetail(byte[] resumedetail) {
        this.resumedetail = resumedetail;
    }

    public byte[] getResumedetail1() {
        return resumedetail1;
    }

    public void setResumedetail1(byte[] resumedetail1) {
        this.resumedetail1 = resumedetail1;
    }

    public byte[] getResumedetail2() {
        return resumedetail2;
    }

    public void setResumedetail2(byte[] resumedetail2) {
        this.resumedetail2 = resumedetail2;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications == null ? null : certifications.trim();
    }

    public String getEducations() {
        return educations;
    }

    public void setEducations(String educations) {
        this.educations = educations == null ? null : educations.trim();
    }

    public String getWorkexperiences() {
        return workexperiences;
    }

    public void setWorkexperiences(String workexperiences) {
        this.workexperiences = workexperiences == null ? null : workexperiences.trim();
    }

    public String getPerprofile() {
        return perprofile;
    }

    public void setPerprofile(String perprofile) {
        this.perprofile = perprofile == null ? null : perprofile.trim();
    }

    public String getWork1desc() {
        return work1desc;
    }

    public void setWork1desc(String work1desc) {
        this.work1desc = work1desc == null ? null : work1desc.trim();
    }

    public String getWork1projs() {
        return work1projs;
    }

    public void setWork1projs(String work1projs) {
        this.work1projs = work1projs == null ? null : work1projs.trim();
    }

    public String getWork2desc() {
        return work2desc;
    }

    public void setWork2desc(String work2desc) {
        this.work2desc = work2desc == null ? null : work2desc.trim();
    }

    public String getWork2projs() {
        return work2projs;
    }

    public void setWork2projs(String work2projs) {
        this.work2projs = work2projs == null ? null : work2projs.trim();
    }

    public String getWork3desc() {
        return work3desc;
    }

    public void setWork3desc(String work3desc) {
        this.work3desc = work3desc == null ? null : work3desc.trim();
    }

    public String getWork3projs() {
        return work3projs;
    }

    public void setWork3projs(String work3projs) {
        this.work3projs = work3projs == null ? null : work3projs.trim();
    }

    public String getWork4projs() {
        return work4projs;
    }

    public void setWork4projs(String work4projs) {
        this.work4projs = work4projs == null ? null : work4projs.trim();
    }

    public String getFulltexts() {
        return fulltexts;
    }

    public void setFulltexts(String fulltexts) {
        this.fulltexts = fulltexts == null ? null : fulltexts.trim();
    }

    public String getEducationdetail() {
        return educationdetail;
    }

    public void setEducationdetail(String educationdetail) {
        this.educationdetail = educationdetail == null ? null : educationdetail.trim();
    }

    public String getExperiencedetail() {
        return experiencedetail;
    }

    public void setExperiencedetail(String experiencedetail) {
        this.experiencedetail = experiencedetail == null ? null : experiencedetail.trim();
    }

    public String getTraining() {
        return training;
    }

    public void setTraining(String training) {
        this.training = training == null ? null : training.trim();
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill == null ? null : skill.trim();
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team == null ? null : team.trim();
    }

    public String getVolunteer() {
        return volunteer;
    }

    public void setVolunteer(String volunteer) {
        this.volunteer = volunteer == null ? null : volunteer.trim();
    }
}