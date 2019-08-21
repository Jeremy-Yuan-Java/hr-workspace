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

    private String personaliy;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String remark;

    private String married;

    private Integer workyears;

    private String work2jobtitle;

    private String work3jobtitle;

    private String work4jobtitle;

    private String work4desc;

    private String updateuser;

    private String createuser;

    private String createstaff;

    private String updatestaff;

    private String studenttype;

    private String jiguan;

    private String vocation;

    private String forwordvocation;

    private String nowsalary;

    private String aimsalary;

    private String political;

    private String startfrom;

    private String qq;

    private String encouragement;

    private String graduatetime;

    private String beginworktime;

    private String lesson;

    private String computer;

    private String english;

    private String schoolrankings;

    private String schooltype;

    private String postcode;

    private String speciality;

    private String address;

    private String notional;

    private String nationality;

    private String href;

    private String high;

    private String tizhong;

    private String advanceddegree;

    private String isjobsearch;

    private String overseaswork;

    private String jobhoppingfrequency;

    private String worktype;

    private String webchat;

    private String personalinterests;

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

    public String getWork4desc() {
        return work4desc;
    }

    public void setWork4desc(String work4desc) {
        this.work4desc = work4desc == null ? null : work4desc.trim();
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser == null ? null : updateuser.trim();
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser == null ? null : createuser.trim();
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

    public String getStudenttype() {
        return studenttype;
    }

    public void setStudenttype(String studenttype) {
        this.studenttype = studenttype == null ? null : studenttype.trim();
    }

    public String getJiguan() {
        return jiguan;
    }

    public void setJiguan(String jiguan) {
        this.jiguan = jiguan == null ? null : jiguan.trim();
    }

    public String getVocation() {
        return vocation;
    }

    public void setVocation(String vocation) {
        this.vocation = vocation == null ? null : vocation.trim();
    }

    public String getForwordvocation() {
        return forwordvocation;
    }

    public void setForwordvocation(String forwordvocation) {
        this.forwordvocation = forwordvocation == null ? null : forwordvocation.trim();
    }

    public String getNowsalary() {
        return nowsalary;
    }

    public void setNowsalary(String nowsalary) {
        this.nowsalary = nowsalary == null ? null : nowsalary.trim();
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

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getEncouragement() {
        return encouragement;
    }

    public void setEncouragement(String encouragement) {
        this.encouragement = encouragement == null ? null : encouragement.trim();
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

    public String getNotional() {
        return notional;
    }

    public void setNotional(String notional) {
        this.notional = notional == null ? null : notional.trim();
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality == null ? null : nationality.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public String getHigh() {
        return high;
    }

    public void setHigh(String high) {
        this.high = high == null ? null : high.trim();
    }

    public String getTizhong() {
        return tizhong;
    }

    public void setTizhong(String tizhong) {
        this.tizhong = tizhong == null ? null : tizhong.trim();
    }

    public String getAdvanceddegree() {
        return advanceddegree;
    }

    public void setAdvanceddegree(String advanceddegree) {
        this.advanceddegree = advanceddegree == null ? null : advanceddegree.trim();
    }

    public String getIsjobsearch() {
        return isjobsearch;
    }

    public void setIsjobsearch(String isjobsearch) {
        this.isjobsearch = isjobsearch == null ? null : isjobsearch.trim();
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

    public String getWorktype() {
        return worktype;
    }

    public void setWorktype(String worktype) {
        this.worktype = worktype == null ? null : worktype.trim();
    }

    public String getWebchat() {
        return webchat;
    }

    public void setWebchat(String webchat) {
        this.webchat = webchat == null ? null : webchat.trim();
    }

    public String getPersonalinterests() {
        return personalinterests;
    }

    public void setPersonalinterests(String personalinterests) {
        this.personalinterests = personalinterests == null ? null : personalinterests.trim();
    }
}