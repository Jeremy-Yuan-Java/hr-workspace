package com.hrbc.business.domain.aliylincv;

import java.util.ArrayList;

/**
 * @program: hr-workspace
 * @description: 简历信息的基础类
 * @author: 波波烤鸭
 * @create: 2019-08-18 22:55
 */
public class ResumeInfo {
    public int Type ;// 结果类型，0：无返回内容；
    // 1：只含中文
    // 2：只含英文
    // 3：既含中文又含英文
    public ResumeInfo ResumeInfoEN ;// 英文简历的返回值
    public String ResumeGrade ;// 简历等级（学生、初级、中级、高级）
    // 不区分行业
    public String Married ;// 共三种状态：已婚、未婚、离异
    public String FromWebSite ;// 来源网站
    public String WebSiteResumeID ;// 来源网站的简历 ID
    public String Keyword ;// 简历关键字
    public String IDNO ;// 身份证号
    public String Encouragement ;// 所受奖励（针对毕业生）
    public String Team ;// 社团活动（针对毕业生）
    public String Volunteer ;// 志愿者经历相关信息（针对毕业生）
    public String Graduatetime ;// 毕业时间（例如：2000-07）
    public String Beginworktime ;// 参加工作时间（例如：2000-09）
    public String LastUpdate ;// 最终更新时间（月），（例如：201501）
    // 找不到的情况下默认为“199001”
    public String LastUpdate2 ;// 最终更新时间（日），（例如：20150101）
    // 找不到的情况下默认为“19900101”
    public String Score ;// 简历综合评分（0-25 的整型数值）
    public String Certificate ;// 所获证书
    public String Original ;// 原始简历存档
    public String Personal ;// 自我评价
    public String Lesson ;// 所学课程
    public String Computer ;// 计算机水平
    public String English ;// 外语水平（并不特指英语）
    public String School ;// 毕业院校
    public String SchoolRankings ;// 毕业院校排名（国内 700 所）
    public String SchoolType ;// 院校类别：取值为 0，1，2，3，4，5
    // 0：普通，1：211 院校，2：985 院校，
    // 3：既是 211 又是 985 院校，4：外国
    // 院校，5：台湾大学
    public String PostCode ;// 邮编
    public String Speciality ;// 专业
    public String Address ;// 通讯地址
    public String Jiguan ;// 籍贯
    public String National ;// 民族
    public String Nationality ;// 国籍
    public String Birth ;// 出生日期（例如：1985 年 01 月 01 日）
    public String Name ;// 姓名（例如：李晓明）
    public String FamilyName ;// 姓氏（例如：李）
    public String Href ;// 个人主页
    public String Title ;// 求职意向
    public String Title2 ;// 求职意向（招聘网站发布的相应职位）
    public String TitleStandard ;// 标准职位名称
    public String AimInstitution ;// 应聘机构（招聘网站发布的公司名称）
    public String Age ;// 年龄
    public String Sex ;// 性别
    public String High ;// 身高（例如：185cm）
    public String Weight ;// 体重
    public String Mobile ;// 移动电话（手机）
    public String Phone ;// 座机（不区分单位和家庭）
    public String Fax ;// 传真
    public String Email ;// 电子邮件地址
    public String NowLocation ;// 现工作地址
    public String Forwardlocation ;// 期望工作地址
    public String Education ;// 最高学历
    public String AdvancedDegree ;// 最高学位
    public String Experience ;// 工作经验
    public String Vocation ;// 现从事行业
    public String ForwardVocation ;// 期望从事行业
    public String VocationStandard ;// 标准行业名称
    public String Salary ;// 目前薪水
    public String AimSalary ;// 期望薪水
    public String EducationDetail ;// 教育背景的全部内容
    public String ExperienceDetail ;// 工作经验的全部内容
    public String Training ;// 培训情况
    public String Project ;// 项目经验
    public String Skill ;// 个人技能
    public String Political ;// 政治面貌
    public String StartFrom ;// 到岗时间
    public String Switch ;// 是否处于找工作状态
    public String IssueDate ;// 发布日期（未启用）
    public String QQ ;// QQ 号码
    public String StudentType ;// 统招或自考
    public String PhotoUrl ;// 头像链接地址
    public String PhotoBase64String ;// 头像文件
    public String AppLetter ;// 求职信、自荐信
    public String LastCompany ;// 最近工作单位
    public String LastTitle ;// 最近职位
    public String OverseasWork ;// 海外工作经验（是/否）
    public String JobHoppingFrequency ;// 跳槽频率（1-10级逐步递增，默认为100）
    public String Integrity ;// 简历完整度（值越大，简历越完整）
    public String WorkType ;// 工作类型（全职、兼职、实习）
    public String Memo ;// 附加信息、其他信息等内容
    public String Memo0 ;// 未启用
    public String Level ;// 未启用
    public String Update ;// 未启用
    public String Local ;// 未启用
    public String Sort ;// 未启用
    public String Msn ;// 未启用
    public String[] Images ;// 简历原文截图（仅在支持的接口下有值）
    public String WebChat ;// 微信号
    public String DoNotRecommend ;// 勿投企业
    public String PersonalInterests ;// 兴趣爱好
    public GradeOfEnglish GradeOfEnglish ;// 英语等级证书，优先选择大学最高证书
    public GradeOfEnglish[] GradeOfEnglishs ;// 英语等级证书全部列表
    public LanguagesSkills[] LanguagesSkills ;// 语言能力列表（按语种划分）
    public ITSkills[] ITSkills ;// 计算机（IT）技能
    public ArrayList ArrEducationDetail ;// 细分教育情况
    public ArrayList ArrExpericeneDetail ;// 细分工作经验
    public ArrayList ArrTrainingDetail ;// 细分培训情况
    public ArrayList ArrProjectDetail ;// 细分项目经验
    public EducationInfo[] EducationInfo ;// 教育情况组成结构
    public ExperienceInfo[] ExperienceInfo ;// 工作经验组成结构
    public TrainingInfo[] TrainingInfo ;// 培训情况组成机构
    public ProjectInfo[] ProjectInfo ;// 项目经验组成结构

    public String hxys; // 核心优势
    public String qzyy; // 求职原因
    public String jtqk; // 家庭情况

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

    public int getType() {
        return Type;
    }

    public void setType(int type) {
        Type = type;
    }

    public ResumeInfo getResumeInfoEN() {
        return ResumeInfoEN;
    }

    public void setResumeInfoEN(ResumeInfo resumeInfoEN) {
        ResumeInfoEN = resumeInfoEN;
    }

    public String getResumeGrade() {
        return ResumeGrade;
    }

    public void setResumeGrade(String resumeGrade) {
        ResumeGrade = resumeGrade;
    }

    public String getMarried() {
        return Married;
    }

    public void setMarried(String married) {
        Married = married;
    }

    public String getFromWebSite() {
        return FromWebSite;
    }

    public void setFromWebSite(String fromWebSite) {
        FromWebSite = fromWebSite;
    }

    public String getWebSiteResumeID() {
        return WebSiteResumeID;
    }

    public void setWebSiteResumeID(String webSiteResumeID) {
        WebSiteResumeID = webSiteResumeID;
    }

    public String getKeyword() {
        return Keyword;
    }

    public void setKeyword(String keyword) {
        Keyword = keyword;
    }

    public String getIDNO() {
        return IDNO;
    }

    public void setIDNO(String IDNO) {
        this.IDNO = IDNO;
    }

    public String getEncouragement() {
        return Encouragement;
    }

    public void setEncouragement(String encouragement) {
        Encouragement = encouragement;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public String getVolunteer() {
        return Volunteer;
    }

    public void setVolunteer(String volunteer) {
        Volunteer = volunteer;
    }

    public String getGraduatetime() {
        return Graduatetime;
    }

    public void setGraduatetime(String graduatetime) {
        Graduatetime = graduatetime;
    }

    public String getBeginworktime() {
        return Beginworktime;
    }

    public void setBeginworktime(String beginworktime) {
        Beginworktime = beginworktime;
    }

    public String getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(String lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public String getLastUpdate2() {
        return LastUpdate2;
    }

    public void setLastUpdate2(String lastUpdate2) {
        LastUpdate2 = lastUpdate2;
    }

    public String getScore() {
        return Score;
    }

    public void setScore(String score) {
        Score = score;
    }

    public String getCertificate() {
        return Certificate;
    }

    public void setCertificate(String certificate) {
        Certificate = certificate;
    }

    public String getOriginal() {
        return Original;
    }

    public void setOriginal(String original) {
        Original = original;
    }

    public String getPersonal() {
        return Personal;
    }

    public void setPersonal(String personal) {
        Personal = personal;
    }

    public String getLesson() {
        return Lesson;
    }

    public void setLesson(String lesson) {
        Lesson = lesson;
    }

    public String getComputer() {
        return Computer;
    }

    public void setComputer(String computer) {
        Computer = computer;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }

    public String getSchool() {
        return School;
    }

    public void setSchool(String school) {
        School = school;
    }

    public String getSchoolRankings() {
        return SchoolRankings;
    }

    public void setSchoolRankings(String schoolRankings) {
        SchoolRankings = schoolRankings;
    }

    public String getSchoolType() {
        return SchoolType;
    }

    public void setSchoolType(String schoolType) {
        SchoolType = schoolType;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getSpeciality() {
        return Speciality;
    }

    public void setSpeciality(String speciality) {
        Speciality = speciality;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getJiguan() {
        return Jiguan;
    }

    public void setJiguan(String jiguan) {
        Jiguan = jiguan;
    }

    public String getNational() {
        return National;
    }

    public void setNational(String national) {
        National = national;
    }

    public String getNationality() {
        return Nationality;
    }

    public void setNationality(String nationality) {
        Nationality = nationality;
    }

    public String getBirth() {
        return Birth;
    }

    public void setBirth(String birth) {
        Birth = birth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getFamilyName() {
        return FamilyName;
    }

    public void setFamilyName(String familyName) {
        FamilyName = familyName;
    }

    public String getHref() {
        return Href;
    }

    public void setHref(String href) {
        Href = href;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getTitle2() {
        return Title2;
    }

    public void setTitle2(String title2) {
        Title2 = title2;
    }

    public String getTitleStandard() {
        return TitleStandard;
    }

    public void setTitleStandard(String titleStandard) {
        TitleStandard = titleStandard;
    }

    public String getAimInstitution() {
        return AimInstitution;
    }

    public void setAimInstitution(String aimInstitution) {
        AimInstitution = aimInstitution;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public String getHigh() {
        return High;
    }

    public void setHigh(String high) {
        High = high;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String mobile) {
        Mobile = mobile;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNowLocation() {
        return NowLocation;
    }

    public void setNowLocation(String nowLocation) {
        NowLocation = nowLocation;
    }

    public String getForwardlocation() {
        return Forwardlocation;
    }

    public void setForwardlocation(String forwardlocation) {
        Forwardlocation = forwardlocation;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String education) {
        Education = education;
    }

    public String getAdvancedDegree() {
        return AdvancedDegree;
    }

    public void setAdvancedDegree(String advancedDegree) {
        AdvancedDegree = advancedDegree;
    }

    public String getExperience() {
        return Experience;
    }

    public void setExperience(String experience) {
        Experience = experience;
    }

    public String getVocation() {
        return Vocation;
    }

    public void setVocation(String vocation) {
        Vocation = vocation;
    }

    public String getForwardVocation() {
        return ForwardVocation;
    }

    public void setForwardVocation(String forwardVocation) {
        ForwardVocation = forwardVocation;
    }

    public String getVocationStandard() {
        return VocationStandard;
    }

    public void setVocationStandard(String vocationStandard) {
        VocationStandard = vocationStandard;
    }

    public String getSalary() {
        return Salary;
    }

    public void setSalary(String salary) {
        Salary = salary;
    }

    public String getAimSalary() {
        return AimSalary;
    }

    public void setAimSalary(String aimSalary) {
        AimSalary = aimSalary;
    }

    public String getEducationDetail() {
        return EducationDetail;
    }

    public void setEducationDetail(String educationDetail) {
        EducationDetail = educationDetail;
    }

    public String getExperienceDetail() {
        return ExperienceDetail;
    }

    public void setExperienceDetail(String experienceDetail) {
        ExperienceDetail = experienceDetail;
    }

    public String getTraining() {
        return Training;
    }

    public void setTraining(String training) {
        Training = training;
    }

    public String getProject() {
        return Project;
    }

    public void setProject(String project) {
        Project = project;
    }

    public String getSkill() {
        return Skill;
    }

    public void setSkill(String skill) {
        Skill = skill;
    }

    public String getPolitical() {
        return Political;
    }

    public void setPolitical(String political) {
        Political = political;
    }

    public String getStartFrom() {
        return StartFrom;
    }

    public void setStartFrom(String startFrom) {
        StartFrom = startFrom;
    }

    public String getSwitch() {
        return Switch;
    }

    public void setSwitch(String aSwitch) {
        Switch = aSwitch;
    }

    public String getIssueDate() {
        return IssueDate;
    }

    public void setIssueDate(String issueDate) {
        IssueDate = issueDate;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getStudentType() {
        return StudentType;
    }

    public void setStudentType(String studentType) {
        StudentType = studentType;
    }

    public String getPhotoUrl() {
        return PhotoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        PhotoUrl = photoUrl;
    }

    public String getPhotoBase64String() {
        return PhotoBase64String;
    }

    public void setPhotoBase64String(String photoBase64String) {
        PhotoBase64String = photoBase64String;
    }

    public String getAppLetter() {
        return AppLetter;
    }

    public void setAppLetter(String appLetter) {
        AppLetter = appLetter;
    }

    public String getLastCompany() {
        return LastCompany;
    }

    public void setLastCompany(String lastCompany) {
        LastCompany = lastCompany;
    }

    public String getLastTitle() {
        return LastTitle;
    }

    public void setLastTitle(String lastTitle) {
        LastTitle = lastTitle;
    }

    public String getOverseasWork() {
        return OverseasWork;
    }

    public void setOverseasWork(String overseasWork) {
        OverseasWork = overseasWork;
    }

    public String getJobHoppingFrequency() {
        return JobHoppingFrequency;
    }

    public void setJobHoppingFrequency(String jobHoppingFrequency) {
        JobHoppingFrequency = jobHoppingFrequency;
    }

    public String getIntegrity() {
        return Integrity;
    }

    public void setIntegrity(String integrity) {
        Integrity = integrity;
    }

    public String getWorkType() {
        return WorkType;
    }

    public void setWorkType(String workType) {
        WorkType = workType;
    }

    public String getMemo() {
        return Memo;
    }

    public void setMemo(String memo) {
        Memo = memo;
    }

    public String getMemo0() {
        return Memo0;
    }

    public void setMemo0(String memo0) {
        Memo0 = memo0;
    }

    public String getLevel() {
        return Level;
    }

    public void setLevel(String level) {
        Level = level;
    }

    public String getUpdate() {
        return Update;
    }

    public void setUpdate(String update) {
        Update = update;
    }

    public String getLocal() {
        return Local;
    }

    public void setLocal(String local) {
        Local = local;
    }

    public String getSort() {
        return Sort;
    }

    public void setSort(String sort) {
        Sort = sort;
    }

    public String getMsn() {
        return Msn;
    }

    public void setMsn(String msn) {
        Msn = msn;
    }

    public String[] getImages() {
        return Images;
    }

    public void setImages(String[] images) {
        Images = images;
    }

    public String getWebChat() {
        return WebChat;
    }

    public void setWebChat(String webChat) {
        WebChat = webChat;
    }

    public String getDoNotRecommend() {
        return DoNotRecommend;
    }

    public void setDoNotRecommend(String doNotRecommend) {
        DoNotRecommend = doNotRecommend;
    }

    public String getPersonalInterests() {
        return PersonalInterests;
    }

    public void setPersonalInterests(String personalInterests) {
        PersonalInterests = personalInterests;
    }

    public com.hrbc.business.domain.aliylincv.GradeOfEnglish getGradeOfEnglish() {
        return GradeOfEnglish;
    }

    public void setGradeOfEnglish(com.hrbc.business.domain.aliylincv.GradeOfEnglish gradeOfEnglish) {
        GradeOfEnglish = gradeOfEnglish;
    }

    public com.hrbc.business.domain.aliylincv.GradeOfEnglish[] getGradeOfEnglishs() {
        return GradeOfEnglishs;
    }

    public void setGradeOfEnglishs(com.hrbc.business.domain.aliylincv.GradeOfEnglish[] gradeOfEnglishs) {
        GradeOfEnglishs = gradeOfEnglishs;
    }

    public com.hrbc.business.domain.aliylincv.LanguagesSkills[] getLanguagesSkills() {
        return LanguagesSkills;
    }

    public void setLanguagesSkills(com.hrbc.business.domain.aliylincv.LanguagesSkills[] languagesSkills) {
        LanguagesSkills = languagesSkills;
    }

    public com.hrbc.business.domain.aliylincv.ITSkills[] getITSkills() {
        return ITSkills;
    }

    public void setITSkills(com.hrbc.business.domain.aliylincv.ITSkills[] ITSkills) {
        this.ITSkills = ITSkills;
    }

    public ArrayList getArrEducationDetail() {
        return ArrEducationDetail;
    }

    public void setArrEducationDetail(ArrayList arrEducationDetail) {
        ArrEducationDetail = arrEducationDetail;
    }

    public ArrayList getArrExpericeneDetail() {
        return ArrExpericeneDetail;
    }

    public void setArrExpericeneDetail(ArrayList arrExpericeneDetail) {
        ArrExpericeneDetail = arrExpericeneDetail;
    }

    public ArrayList getArrTrainingDetail() {
        return ArrTrainingDetail;
    }

    public void setArrTrainingDetail(ArrayList arrTrainingDetail) {
        ArrTrainingDetail = arrTrainingDetail;
    }

    public ArrayList getArrProjectDetail() {
        return ArrProjectDetail;
    }

    public void setArrProjectDetail(ArrayList arrProjectDetail) {
        ArrProjectDetail = arrProjectDetail;
    }

    public com.hrbc.business.domain.aliylincv.EducationInfo[] getEducationInfo() {
        return EducationInfo;
    }

    public void setEducationInfo(com.hrbc.business.domain.aliylincv.EducationInfo[] educationInfo) {
        EducationInfo = educationInfo;
    }

    public com.hrbc.business.domain.aliylincv.ExperienceInfo[] getExperienceInfo() {
        return ExperienceInfo;
    }

    public void setExperienceInfo(com.hrbc.business.domain.aliylincv.ExperienceInfo[] experienceInfo) {
        ExperienceInfo = experienceInfo;
    }

    public com.hrbc.business.domain.aliylincv.TrainingInfo[] getTrainingInfo() {
        return TrainingInfo;
    }

    public void setTrainingInfo(com.hrbc.business.domain.aliylincv.TrainingInfo[] trainingInfo) {
        TrainingInfo = trainingInfo;
    }

    public com.hrbc.business.domain.aliylincv.ProjectInfo[] getProjectInfo() {
        return ProjectInfo;
    }

    public void setProjectInfo(com.hrbc.business.domain.aliylincv.ProjectInfo[] projectInfo) {
        ProjectInfo = projectInfo;
    }
}
