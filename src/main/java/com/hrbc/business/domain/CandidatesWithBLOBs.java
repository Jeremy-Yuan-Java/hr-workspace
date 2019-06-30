package com.hrbc.business.domain;

public class CandidatesWithBLOBs extends Candidates {
    private byte[] resumedetail;

    private byte[] resumedetail1;

    private byte[] resumedetail2;

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
}