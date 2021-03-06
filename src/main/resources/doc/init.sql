CREATE DATABASE `ibms` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci
CREATE TABLE `candidates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '如果存在系统账号,此处为系统账号',
  `phoneno` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `phonenobak` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号2',
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `emailbak` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱2',
  `idcard` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证',
  `picpath` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '照片路径',
  `postcard` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '明信片路径',
  `jobtitle` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职务',
  `age` int(11) DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `major` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `majorsub` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `salarymin` int(11) DEFAULT NULL,
  `salarymax` int(11) DEFAULT NULL,
  `hometown` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `workbase` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `expectworkbase` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tags` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `worksate` int(11) DEFAULT '1' COMMENT '0 在职 1 休假 2 离职 ',
  `resumestate` int(11) DEFAULT '1' COMMENT '0 存在简历 1 不存在简历 ',
  `resumefile` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `dresume` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `state` int(11) DEFAULT '0' COMMENT '0 在职 1 休假 2 离职 ',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `resumedetail` mediumblob COMMENT '简历内容JSON格式',
  `resumedetail1` mediumblob COMMENT '简历内容JSON格式',
  `resumedetail2` mediumblob COMMENT '简历内容JSON格式',
  `expectjob` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `weight` int(11) DEFAULT NULL,
  `languagelevel` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '外语水平',
  `degree` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '学位\n1 本科\n2 研究生\n3 博士\n4 博士后\n5 大专\n6 高中\n7 自学成才',
  `livebase` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `edu1` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '教育信息1',
  `edu1stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `edu1eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `edu2` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '教育信息2',
  `edu2stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `edu2eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `edu3` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '教育信息3',
  `edu3stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `edu3eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `work1` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '履历信息1',
  `work1stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `work1eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `work2` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '履历信息2',
  `work2stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `work2eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `work3` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '履历信息3',
  `work3stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `work3eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `work4` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '履历信息4',
  `work4stdate` datetime DEFAULT NULL COMMENT '开始时间',
  `work4eddate` datetime DEFAULT NULL COMMENT '结束时间',
  `certifications` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '证书 比如四六级 会计 CIA',
  `educations` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '教育经历备注',
  `workexperiences` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '工作经历备注',
  `perprofile` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '简介',
  `personaliy` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '性格等',
  `birthday` datetime DEFAULT NULL,
  `remark` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `married` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '未婚',
  `workyears` int(11) DEFAULT NULL COMMENT '工作年限',
  `work2jobtitle` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '主要职务',
  `work3jobtitle` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '主要职务',
  `work4jobtitle` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '主要职务',
  `work1desc` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work1projs` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work2desc` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work2projs` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work3desc` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work3projs` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work4desc` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `work4projs` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fulltexts` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='候选人信息表'

CREATE TABLE `candidatetags` (
  `tag` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `state` int(11) DEFAULT '0' COMMENT '0 有效 1 无效 ',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`tag`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='候选人标签表'

CREATE TABLE `customers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cno` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '客户编号及拼音简写',
  `cname` varchar(150) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '客户名称',
  `opsstaffname` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证',
  `opsstaffno` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '负责人',
  `contactuser` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '对接人名称',
  `phoneno` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `phonenobak` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号2',
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `emailbak` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱2',
  `wechat` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '微信号',
  `jobtitle` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职务',
  `businessstate` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '商务合作状态',
  `verify` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT '未验证' COMMENT '是否验证 已验证,未验证',
  `followrec` mediumblob COMMENT '客户跟进状态',
  `state` int(11) DEFAULT '0' COMMENT '0 在职 1 休假 2 离职 ',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `major` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `majorsub` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remark` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `customerdesc` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fulltexts` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `opsstaffid` int(11) DEFAULT NULL COMMENT '负责人id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `customers_cname_uindex` (`cname`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='客户信息表'

CREATE TABLE `customers_jobs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jobno` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职位编号',
  `jobdesc` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职位描述',
  `jobresource` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '替补、业务新增、离职补缺',
  `jobstate` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '紧急、放缓、暂停,完成,关闭',
  `opsteam` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '负责团队',
  `opuser` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '主要负责人',
  `opusername` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '主要负责人姓名',
  `hardkpi` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职位要求描述',
  `dept` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '所在部门',
  `leader` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '汇报上级',
  `cno` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '客户编号及拼音简写',
  `cname` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '客户名称',
  `contactuser` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '对接人名称',
  `phoneno` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `jobtitle` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职务',
  `education` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `major` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `majorsub` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `salarymin` int(11) DEFAULT NULL,
  `salarymax` int(11) DEFAULT NULL,
  `workbase` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `tags` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `state` int(11) DEFAULT '0',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `publishtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remark` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fulltexts` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `cid` int(11) DEFAULT NULL COMMENT '客户ID',
  `targetcompany` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `interviewer` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `interviewqs` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `interviewflow` varchar(1000) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '面试流程',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='客户职位表'

CREATE TABLE `customers_jobs_team` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jobid` int(11) DEFAULT NULL,
  `staffid` int(11) DEFAULT NULL,
  `createtime` datetime DEFAULT CURRENT_TIMESTAMP,
  `username` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci

CREATE TABLE `jobs_candidates` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `candidateid` int(11) DEFAULT NULL,
  `candidatename` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `optime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `opuser` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `opusername` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `communicaterecs` mediumblob COMMENT '沟通记录',
  `remark` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `state` int(11) DEFAULT '0' COMMENT '状态机',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fulltexts` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `jobtitle` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `lastcompany` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phoneno` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `jobid` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='候选人加入职位跟进表'

CREATE TABLE `jobs_candidates_state` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `jcid` int(11) NOT NULL,
  `flowstate` int(11) DEFAULT NULL COMMENT '流程状态',
  `flowstatedesc` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `optime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `opuser` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `opusername` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `communicaterecs` mediumblob COMMENT '沟通记录',
  `remark` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '备注',
  `state` int(11) DEFAULT '0' COMMENT '状态机',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fulltexts` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `text1` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述1',
  `text2` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述2',
  `text3` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述3',
  `text4` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述4',
  `text5` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '描述5',
  `date1` datetime DEFAULT NULL,
  `date2` datetime DEFAULT NULL,
  `date3` datetime DEFAULT NULL,
  `date4` datetime DEFAULT NULL,
  `ischeck` int(11) DEFAULT '0' COMMENT '绩效考核',
  `isapprove` int(11) DEFAULT '0' COMMENT '绩效批准',
  PRIMARY KEY (`id`),
  UNIQUE KEY `jobs_candidates_state_jcid_flowstate_uindex` (`jcid`,`flowstate`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='候选人加入职位跟进表'

CREATE TABLE `majors` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `marorsdesc` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `parentid` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `state` int(11) DEFAULT '0' COMMENT '0 有效 1 无效 ',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=79 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='行业表'

CREATE TABLE `op_log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `opuser` varchar(50) DEFAULT NULL,
  `opcontent` varchar(2000) DEFAULT NULL,
  `optime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `dataid` varchar(100) DEFAULT NULL COMMENT '数据ID',
  `datakey1` varchar(200) DEFAULT NULL,
  `datakey2` varchar(200) DEFAULT NULL COMMENT '数据key',
  `opcontent1` varchar(2000) DEFAULT NULL,
  `business` varchar(200) DEFAULT NULL COMMENT '业务模块',
  `func` varchar(200) DEFAULT NULL COMMENT '功能',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=249 DEFAULT CHARSET=utf8

CREATE TABLE `staffs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '如果存在系统账号,此处为系统账号',
  `staffno` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `staffname` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `phonenobak` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号2',
  `phoneno` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '手机号',
  `emailbak` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱2',
  `idcard` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '身份证',
  `stafftime` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入职时间',
  `email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '邮箱',
  `picpath` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '员工照片路径',
  `jobtitle` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '职务',
  `superior` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL COMMENT '上级',
  `age` int(11) DEFAULT NULL,
  `gender` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `education` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `constellation` varchar(20) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `hometown` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `state` int(11) DEFAULT '0' COMMENT '0 在职 1 休假 2 离职 ',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `region` varchar(10) COLLATE utf8mb4_unicode_ci DEFAULT 'bj' COMMENT '如 bj 北京  yj 燕郊 ……',
  `birthday` datetime DEFAULT NULL,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `remark` varchar(300) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `fulltexts` varchar(3000) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='员工信息表'

CREATE TABLE `sys_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `cnname` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `pwd` varchar(200) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `accounttype` int(11) DEFAULT '1' COMMENT '1 员工\n2 候选人\n3 ……',
  `enname` varchar(100) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `state` int(11) DEFAULT '0' COMMENT '0 可用\n1 冻结',
  `delflag` int(11) DEFAULT '0' COMMENT '0 未删除\n1 已删除',
  `createtime` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `updatetime` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  `createuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updateuser` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `createstaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `updatestaff` varchar(30) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sys_user_username_uindex` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci COMMENT='系统账号表'



INSERT INTO ibms.staffs (id, username, staffno, staffname, phonenobak, phoneno, emailbak, idcard, stafftime, email, picpath, jobtitle, superior, age, gender, education, salary, constellation, hometown, state, delflag, createtime, updatetime, region, birthday, createuser, updateuser, createstaff, updatestaff, remark, fulltexts) VALUES (2, 'admin', '000002', '超级管理员', null, '18888888', null, null, '2019-08-02 19:00:00', '888@qq.com', null, '总经理', null, null, '男', null, 8888, null, null, 0, 0, '2019-08-04 10:12:38', '2019-08-04 10:13:13', '北京-北关', null, null, null, null, null, null, null);
INSERT INTO ibms.staffs (id, username, staffno, staffname, phonenobak, phoneno, emailbak, idcard, stafftime, email, picpath, jobtitle, superior, age, gender, education, salary, constellation, hometown, state, delflag, createtime, updatetime, region, birthday, createuser, updateuser, createstaff, updatestaff, remark, fulltexts) VALUES (1, 'guocq', '000001', '郭成强', null, '1888', null, null, '2019-08-18 19:00:00', '1888@qq.com', null, '总经理', null, null, '男', null, 888, null, null, 0, 0, '2019-08-04 11:38:15', '2019-08-04 11:38:23', '北京-北关', null, null, null, null, null, null, null);
INSERT INTO ibms.sys_user (id, username, cnname, pwd, accounttype, enname, state, delflag, createtime, updatetime, createuser, updateuser, createstaff, updatestaff) VALUES (2, 'admin', '超级管理员', 'a66abb5684c45962d887564f08346e8d', 1, null, 0, 0, '2019-08-04 10:12:38', '2019-08-04 10:12:38', null, null, null, null);
INSERT INTO ibms.sys_user (id, username, cnname, pwd, accounttype, enname, state, delflag, createtime, updatetime, createuser, updateuser, createstaff, updatestaff) VALUES (1, 'guocq', '郭成强', '936c597d82f2de1fe713732a8021b7a8', 1, null, 0, 0, '2019-08-04 11:38:14', '2019-08-04 11:38:14', null, null, null, null);



create table candidates_jobs_report
(
    id               int auto_increment
        primary key,
    customer_id      int          not null comment '客户编号',
    candidates_id    int          not null comment '候选人编号',
    reportPath       varchar(100) null comment '简历报告文件名',
    upload_userid    int          null comment '简历报告上传用户编号',
    upload_username  varchar(30)  null comment '简历报告上传用户账户',
    upload_usercname varchar(30)  null comment '简历报告上传人姓名',
    state            int          null comment '状态',
    create_time      timestamp    null comment '记录创建的时间',
    backup1          varchar(100) null,
    backup2          varchar(100) null,
    update_time      timestamp    null comment '更新时间'
)
    comment '候选人简历报告' engine = InnoDB
                      collate = utf8mb4_unicode_ci;

