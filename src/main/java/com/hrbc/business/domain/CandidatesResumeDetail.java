package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class CandidatesResumeDetail {
    private Integer id;

    private Integer candidatesid;

    private String resumetype;

    private String resumegrade;

    private String marryied;

    private String fromwebsite;

    private Integer websiteresumeid;

    private String keyword;

    private String idno;

    private String encouragement;

    private String team;

    private String volunteer;

    private String graduatetime;

    private String beginworktime;

    private String lastupdate;

    private String lastupdate2;

    private Integer score;

    private String certificate;

    private String personal;

    private String lesson;

    private String computer;

    private String english;

    private String school;

    private String schoolrankings;

    private String schooltype;

    private String postcode;

    private String speciality;

    private String address;

    private String jiguan;

    private String national;

    private String nationality;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birth;

    private String name;

    private String familyname;

    private String href;

    private String title;

    private String title2;

    private String titlestandard;

    private String amiinstitution;

    private Byte age;

    private String sex;

    private String highr;

    private String weightr;

    private String mobile;

    private String phone;

    private String fax;

    private String email;

    private String nowlocation;

    private String forwardlocation;

    private String education;

    private String advanceddegree;

    private String experience;

    private String vocation;

    private String forwardvocation;

    private String vocationstandard;

    private String salary;

    private String aimsalary;

    private String political;

    private String startfrom;

    private String isjobsearch;

    private String issuedate;

    private String qq;

    private String studenttype;

    private String photourl;

    private String lastcompany;

    private String lasttitle;

    private String overseaswork;

    private String jobhoppingfrequency;

    private String integrity;

    private String worktype;

    private String level;

    private String sort;

    private String msn;

    private String webchat;

    private String donotrecommend;

    private String personalinterests;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCandidatesid() {
        return candidatesid;
    }

    public void setCandidatesid(Integer candidatesid) {
        this.candidatesid = candidatesid;
    }

    public String getResumetype() {
        return resumetype;
    }

    public void setResumetype(String resumetype) {
        this.resumetype = resumetype == null ? null : resumetype.trim();
    }

    public String getResumegrade() {
        return resumegrade;
    }

    public void setResumegrade(String resumegrade) {
        this.resumegrade = resumegrade == null ? null : resumegrade.trim();
    }

    public String getMarryied() {
        return marryied;
    }

    public void setMarryied(String marryied) {
        this.marryied = marryied == null ? null : marryied.trim();
    }

    public String getFromwebsite() {
        return fromwebsite;
    }

    public void setFromwebsite(String fromwebsite) {
        this.fromwebsite = fromwebsite == null ? null : fromwebsite.trim();
    }

    public Integer getWebsiteresumeid() {
        return websiteresumeid;
    }

    public void setWebsiteresumeid(Integer websiteresumeid) {
        this.websiteresumeid = websiteresumeid;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword == null ? null : keyword.trim();
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno == null ? null : idno.trim();
    }

    public String getEncouragement() {
        return encouragement;
    }

    public void setEncouragement(String encouragement) {
        this.encouragement = encouragement == null ? null : encouragement.trim();
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

    public String getGraduatetime() {
        return graduatetime;
    }

    public void setGraduatetime(String graduatetime) {
        this.graduatetime = graduatetime == null ? null : graduatetime.trim();
    }

    public String getBeginworktime() {
        return beginworktime;
    }

    public void setBeginworktime(String beginworktime) {
        this.beginworktime = beginworktime == null ? null : beginworktime.trim();
    }

    public String getLastupdate() {
        return lastupdate;
    }

    public void setLastupdate(String lastupdate) {
        this.lastupdate = lastupdate == null ? null : lastupdate.trim();
    }

    public String getLastupdate2() {
        return lastupdate2;
    }

    public void setLastupdate2(String lastupdate2) {
        this.lastupdate2 = lastupdate2 == null ? null : lastupdate2.trim();
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public String getPersonal() {
        return personal;
    }

    public void setPersonal(String personal) {
        this.personal = personal == null ? null : personal.trim();
    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson == null ? null : lesson.trim();
    }

    public String getComputer() {
        return computer;
    }

    public void setComputer(String computer) {
        this.computer = computer == null ? null : computer.trim();
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english == null ? null : english.trim();
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school == null ? null : school.trim();
    }

    public String getSchoolrankings() {
        return schoolrankings;
    }

    public void setSchoolrankings(String schoolrankings) {
        this.schoolrankings = schoolrankings == null ? null : schoolrankings.trim();
    }

    public String getSchooltype() {
        return schooltype;
    }

    public void setSchooltype(String schooltype) {
        this.schooltype = schooltype == null ? null : schooltype.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality == null ? null : speciality.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan == null ? null : jiguan.trim();
    }

    public String getNational() {
        return national;
    }

    public void setNational(String national) {
        this.national = national == null ? null : national.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname == null ? null : familyname.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title2) {
        this.title2 = title2 == null ? null : title2.trim();
    }

    public String getTitlestandard() {
        return titlestandard;
    }

    public void setTitlestandard(String titlestandard) {
        this.titlestandard = titlestandard == null ? null : titlestandard.trim();
    }

    public String getAmiinstitution() {
        return amiinstitution;
    }

    public void setAmiinstitution(String amiinstitution) {
        this.amiinstitution = amiinstitution == null ? null : amiinstitution.trim();
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getHighr() {
        return highr;
    }

    public void setHighr(String highr) {
        this.highr = highr == null ? null : highr.trim();
    }

    public String getWeightr() {
        return weightr;
    }

    public void setWeightr(String weightr) {
        this.weightr = weightr == null ? null : weightr.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getNowlocation() {
        return nowlocation;
    }

    public void setNowlocation(String nowlocation) {
        this.nowlocation = nowlocation == null ? null : nowlocation.trim();
    }

    public String getForwardlocation() {
        return forwardlocation;
    }

    public void setForwardlocation(String forwardlocation) {
        this.forwardlocation = forwardlocation == null ? null : forwardlocation.trim();
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getAdvanceddegree() {
        return advanceddegree;
    }

    public void setAdvanceddegree(String advanceddegree) {
        this.advanceddegree = advanceddegree == null ? null : advanceddegree.trim();
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience == null ? null : experience.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public String getForwardvocation() {
        return forwardvocation;
    }

    public void setForwardvocation(String forwardvocation) {
        this.forwardvocation = forwardvocation == null ? null : forwardvocation.trim();
    }

    public String getVocationstandard() {
        return vocationstandard;
    }

    public void setVocationstandard(String vocationstandard) {
        this.vocationstandard = vocationstandard == null ? null : vocationstandard.trim();
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary == null ? null : salary.trim();
    }

    public String getAimsalary() {
        return aimsalary;
    }

    public void setAimsalary(String aimsalary) {
        this.aimsalary = aimsalary == null ? null : aimsalary.trim();
    }

    public String getPolitical() {
        return political;
    }

    public void setPolitical(String political) {
        this.political = political == null ? null : political.trim();
    }

    public String getStartfrom() {
        return startfrom;
    }

    public void setStartfrom(String startfrom) {
        this.startfrom = startfrom == null ? null : startfrom.trim();
    }

    public String getIsjobsearch() {
        return isjobsearch;
    }

    public void setIsjobsearch(String isjobsearch) {
        this.isjobsearch = isjobsearch == null ? null : isjobsearch.trim();
    }

    public String getIssuedate() {
        return issuedate;
    }

    public void setIssuedate(String issuedate) {
        this.issuedate = issuedate == null ? null : issuedate.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getStudenttype() {
        return studenttype;
    }

    public void setStudenttype(String studenttype) {
        this.studenttype = studenttype == null ? null : studenttype.trim();
    }

    public String getPhotourl() {
        return photourl;
    }

    public void setPhotourl(String photourl) {
        this.photourl = photourl == null ? null : photourl.trim();
    }

    public String getLastcompany() {
        return lastcompany;
    }

    public void setLastcompany(String lastcompany) {
        this.lastcompany = lastcompany == null ? null : lastcompany.trim();
    }

    public String getLasttitle() {
        return lasttitle;
    }

    public void setLasttitle(String lasttitle) {
        this.lasttitle = lasttitle == null ? null : lasttitle.trim();
    }

    public String getOverseaswork() {
        return overseaswork;
    }

    public void setOverseaswork(String overseaswork) {
        this.overseaswork = overseaswork == null ? null : overseaswork.trim();
    }

    public String getJobhoppingfrequency() {
        return jobhoppingfrequency;
    }

    public void setJobhoppingfrequency(String jobhoppingfrequency) {
        this.jobhoppingfrequency = jobhoppingfrequency == null ? null : jobhoppingfrequency.trim();
    }

    public String getIntegrity() {
        return integrity;
    }

    public void setIntegrity(String integrity) {
        this.integrity = integrity == null ? null : integrity.trim();
    }

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getMsn() {
        return msn;
    }

    public void setMsn(String msn) {
        this.msn = msn == null ? null : msn.trim();
    }

    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat == null ? null : webchat.trim();
    }

    public String getDonotrecommend() {
        return donotrecommend;
    }

    public void setDonotrecommend(String donotrecommend) {
        this.donotrecommend = donotrecommend == null ? null : donotrecommend.trim();
    }

    public String getPersonalinterests() {
        return personalinterests;
    }

    public void setPersonalinterests(String personalinterests) {
        this.personalinterests = personalinterests == null ? null : personalinterests.trim();
    }
}