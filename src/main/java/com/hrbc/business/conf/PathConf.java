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
    /**
     * 候选人照片文件名前缀
     */
    public static String SUFFIX_CAPIC = "ca";
    /**
     * 员工简历文件名前缀
     */
    public static String SUFFIX_CARESUME = "resume";

    @Value("${file.rootpath}")
    private String filerootpath;
    private static String PIC = "pic/";
    private static String RESUME = "resumes/";

    public static String ACCESS_PATH_PIC = ACCESS_PATH+PIC;
    public static String ACCESS_PATH_RESUME = ACCESS_PATH+RESUME;


    public String getFilerootpath() {
        return filerootpath;
    }

    public void setFilerootpath(String filerootpath) {
        this.filerootpath = filerootpath;
    }


    public String getWholePathPic() {
        return filerootpath + PIC;
    }

    public String getWholePathResumes() {
        return filerootpath + RESUME;
    }


}
