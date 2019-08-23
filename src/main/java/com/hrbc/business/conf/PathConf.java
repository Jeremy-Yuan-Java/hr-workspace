package com.hrbc.business.conf;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author huangyongchao
 */
@Component
public class PathConf {
    /**
     * ACCESS_PATH
     */
    public static String ACCESS_PATH = "/files/";
    /**
     * 员工照片文件名前缀
     */
    public static String SUFFIX_STAFFPIC = "st";
    public static String SUFFIX_CAPIC = "ca";
    /**
     * 候选人照片文件名前缀
     */
    public static String SUFFIX_CAPOSTCART = "ca_pc";
    /**
     * 员工简历文件名前缀
     */
    public static String SUFFIX_CARESUME = "resume";

    /**
     * 简历模板文件名前缀
     */
    public static String SUFFIX_REPORT = "report";

    public static String SAVE_PATH_ROOT;
    private static String PIC = "pic/";
    private static String RESUME = "resumes/";
    private static String POSTCARD = "postcard/";

    private static String RESUME_REPORT = "report/";
    private static String RESUME_REPORT_TEMPLATE = "reporttemplate/";

    public static String ACCESS_PATH_PIC = ACCESS_PATH + PIC;
    public static String ACCESS_PATH_RESUME = ACCESS_PATH + RESUME;
    public static String ACCESS_PATH_POSTCARD = ACCESS_PATH + POSTCARD;

    @Value("${file.rootpath}")
    public void setFilerootpath(String filerootpath) {
        SAVE_PATH_ROOT = filerootpath;
    }




    public static String getSavePathPic() {
        return SAVE_PATH_ROOT + PIC;
    }

    public static String getSavePathResume() {
        return SAVE_PATH_ROOT + RESUME;
    }

    public static String getSavePathPostcard() {
        return SAVE_PATH_ROOT + POSTCARD;
    }

    public static String getSavePathReport(){
        return SAVE_PATH_ROOT + RESUME_REPORT;
    }

    public static String getResumeReportPath () { return SAVE_PATH_ROOT + RESUME_REPORT_TEMPLATE ; }
}
