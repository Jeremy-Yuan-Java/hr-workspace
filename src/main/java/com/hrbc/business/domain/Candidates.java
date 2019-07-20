package com.hrbc.business.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Candidates {
    private Integer id;

    private String username;

    private String phoneno;

    private String phonenobak;

    private String email;

    private String emailbak;

    private String idcard;

    private String picpath;

    private String postcard;

    private String jobtitle;

    private Integer age;

    private String gender;

    private String major;

    private String majorsub;

    private Integer salary;

    private Integer salarymin;

    private Integer salarymax;

    private String hometown;

    private String workbase;

    private String expectworkbase;

    private String tags;

    private Integer worksate;

    private Integer resumestate;

    private String resumefile;

    private String dresume;

    private Integer state;

    private Integer delflag;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createtime;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date updatetime;

    private String expectjob;

    private Integer weight;

    private String languagelevel;

    private String degree;

    private String livebase;

    private String edu1;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edu1stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edu1eddate;

    private String edu2;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edu2stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edu2eddate;

    private String edu3;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edu3stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date edu3eddate;

    private String work1;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work1stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work1eddate;

    private String work2;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work2stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work2eddate;

    private String work3;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work3stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work3eddate;

    private String work4;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work4stdate;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date work4eddate;

    private String certifications;

    private String educations;

    private String workexperiences;

    private String perprofile;

    private String personaliy;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String remark;

    private String married;

    private Integer workyears;

    private String work2jobtitle;

    private String work3jobtitle;

    private String work4jobtitle;

    private String work1desc;

    private String work1projs;

    private String work2desc;

    private String work2projs;

    private String work3desc;

    private String work3projs;

    private String work4desc;

    private String work4projs;

    private String createuser;

    private String updateuser;

    private String createstaff;

    private String updatestaff;

    private String fulltexts;

    public String getFulltexts() {
        return fulltexts;
    }

    public void setFulltexts(String fulltexts) {
        this.fulltexts = fulltexts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(String phoneno) {
        this.phoneno = phoneno == null ? null : phoneno.trim();
    }

    public String getPhonenobak() {
        return phonenobak;
    }

    public void setPhonenobak(String phonenobak) {
        this.phonenobak = phonenobak == null ? null : phonenobak.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getEmailbak() {
        return emailbak;
    }

    public void setEmailbak(String emailbak) {
        this.emailbak = emailbak == null ? null : emailbak.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPicpath() {
        return picpath;
    }

    public void setPicpath(String picpath) {
        this.picpath = picpath == null ? null : picpath.trim();
    }

    public String getPostcard() {
        return postcard;
    }

    public void setPostcard(String postcard) {
        this.postcard = postcard == null ? null : postcard.trim();
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle == null ? null : jobtitle.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major == null ? null : major.trim();
    }

    public String getMajorsub() {
        return majorsub;
    }

    public void setMajorsub(String majorsub) {
        this.majorsub = majorsub == null ? null : majorsub.trim();
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Integer getSalarymin() {
        return salarymin;
    }

    public void setSalarymin(Integer salarymin) {
        this.salarymin = salarymin;
    }

    public Integer getSalarymax() {
        return salarymax;
    }

    public void setSalarymax(Integer salarymax) {
        this.salarymax = salarymax;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown == null ? null : hometown.trim();
    }

    public String getWorkbase() {
        return workbase;
    }

    public void setWorkbase(String workbase) {
        this.workbase = workbase == null ? null : workbase.trim();
    }

    public String getExpectworkbase() {
        return expectworkbase;
    }

    public void setExpectworkbase(String expectworkbase) {
        this.expectworkbase = expectworkbase == null ? null : expectworkbase.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public Integer getWorksate() {
        return worksate;
    }

    public void setWorksate(Integer worksate) {
        this.worksate = worksate;
    }

    public Integer getResumestate() {
        return resumestate;
    }

    public void setResumestate(Integer resumestate) {
        this.resumestate = resumestate;
    }

    public String getResumefile() {
        return resumefile;
    }

    public void setResumefile(String resumefile) {
        this.resumefile = resumefile == null ? null : resumefile.trim();
    }

    public String getDresume() {
        return dresume;
    }

    public void setDresume(String dresume) {
        this.dresume = dresume == null ? null : dresume.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getDelflag() {
        return delflag;
    }

    public void setDelflag(Integer delflag) {
        this.delflag = delflag;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getExpectjob() {
        return expectjob;
    }

    public void setExpectjob(String expectjob) {
        this.expectjob = expectjob == null ? null : expectjob.trim();
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getLanguagelevel() {
        return languagelevel;
    }

    public void setLanguagelevel(String languagelevel) {
        this.languagelevel = languagelevel == null ? null : languagelevel.trim();
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree == null ? null : degree.trim();
    }

    public String getLivebase() {
        return livebase;
    }

    public void setLivebase(String livebase) {
        this.livebase = livebase == null ? null : livebase.trim();
    }

    public String getEdu1() {
        return edu1;
    }

    public void setEdu1(String edu1) {
        this.edu1 = edu1 == null ? null : edu1.trim();
    }

    public Date getEdu1stdate() {
        return edu1stdate;
    }

    public void setEdu1stdate(Date edu1stdate) {
        this.edu1stdate = edu1stdate;
    }

    public Date getEdu1eddate() {
        return edu1eddate;
    }

    public void setEdu1eddate(Date edu1eddate) {
        this.edu1eddate = edu1eddate;
    }

    public String getEdu2() {
        return edu2;
    }

    public void setEdu2(String edu2) {
        this.edu2 = edu2 == null ? null : edu2.trim();
    }

    public Date getEdu2stdate() {
        return edu2stdate;
    }

    public void setEdu2stdate(Date edu2stdate) {
        this.edu2stdate = edu2stdate;
    }

    public Date getEdu2eddate() {
        return edu2eddate;
    }

    public void setEdu2eddate(Date edu2eddate) {
        this.edu2eddate = edu2eddate;
    }

    public String getEdu3() {
        return edu3;
    }

    public void setEdu3(String edu3) {
        this.edu3 = edu3 == null ? null : edu3.trim();
    }

    public Date getEdu3stdate() {
        return edu3stdate;
    }

    public void setEdu3stdate(Date edu3stdate) {
        this.edu3stdate = edu3stdate;
    }

    public Date getEdu3eddate() {
        return edu3eddate;
    }

    public void setEdu3eddate(Date edu3eddate) {
        this.edu3eddate = edu3eddate;
    }

    public String getWork1() {
        return work1;
    }

    public void setWork1(String work1) {
        this.work1 = work1 == null ? null : work1.trim();
    }

    public Date getWork1stdate() {
        return work1stdate;
    }

    public void setWork1stdate(Date work1stdate) {
        this.work1stdate = work1stdate;
    }

    public Date getWork1eddate() {
        return work1eddate;
    }

    public void setWork1eddate(Date work1eddate) {
        this.work1eddate = work1eddate;
    }

    public String getWork2() {
        return work2;
    }

    public void setWork2(String work2) {
        this.work2 = work2 == null ? null : work2.trim();
    }

    public Date getWork2stdate() {
        return work2stdate;
    }

    public void setWork2stdate(Date work2stdate) {
        this.work2stdate = work2stdate;
    }

    public Date getWork2eddate() {
        return work2eddate;
    }

    public void setWork2eddate(Date work2eddate) {
        this.work2eddate = work2eddate;
    }

    public String getWork3() {
        return work3;
    }

    public void setWork3(String work3) {
        this.work3 = work3 == null ? null : work3.trim();
    }

    public Date getWork3stdate() {
        return work3stdate;
    }

    public void setWork3stdate(Date work3stdate) {
        this.work3stdate = work3stdate;
    }

    public Date getWork3eddate() {
        return work3eddate;
    }

    public void setWork3eddate(Date work3eddate) {
        this.work3eddate = work3eddate;
    }

    public String getWork4() {
        return work4;
    }

    public void setWork4(String work4) {
        this.work4 = work4 == null ? null : work4.trim();
    }

    public Date getWork4stdate() {
        return work4stdate;
    }

    public void setWork4stdate(Date work4stdate) {
        this.work4stdate = work4stdate;
    }

    public Date getWork4eddate() {
        return work4eddate;
    }

    public void setWork4eddate(Date work4eddate) {
        this.work4eddate = work4eddate;
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

    public String getPersonaliy() {
        return personaliy;
    }

    public void setPersonaliy(String personaliy) {
        this.personaliy = personaliy == null ? null : personaliy.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getMarried() {
        return married;
    }

    public void setMarried(String married) {
        this.married = married == null ? null : married.trim();
    }

    public Integer getWorkyears() {
        return workyears;
    }

    public void setWorkyears(Integer workyears) {
        this.workyears = workyears;
    }

    public String getWork2jobtitle() {
        return work2jobtitle;
    }

    public void setWork2jobtitle(String work2jobtitle) {
        this.work2jobtitle = work2jobtitle == null ? null : work2jobtitle.trim();
    }

    public String getWork3jobtitle() {
        return work3jobtitle;
    }

    public void setWork3jobtitle(String work3jobtitle) {
        this.work3jobtitle = work3jobtitle == null ? null : work3jobtitle.trim();
    }

    public String getWork4jobtitle() {
        return work4jobtitle;
    }

    public void setWork4jobtitle(String work4jobtitle) {
        this.work4jobtitle = work4jobtitle == null ? null : work4jobtitle.trim();
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

    public String getWork4desc() {
        return work4desc;
    }

    public void setWork4desc(String work4desc) {
        this.work4desc = work4desc == null ? null : work4desc.trim();
    }

    public String getWork4projs() {
        return work4projs;
    }

    public void setWork4projs(String work4projs) {
        this.work4projs = work4projs == null ? null : work4projs.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public String getCreatestaff() {
        return createstaff;
    }

    public void setCreatestaff(String createstaff) {
        this.createstaff = createstaff == null ? null : createstaff.trim();
    }

    public String getUpdatestaff() {
        return updatestaff;
    }

    public void setUpdatestaff(String updatestaff) {
        this.updatestaff = updatestaff == null ? null : updatestaff.trim();
    }
}