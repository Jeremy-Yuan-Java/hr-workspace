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
    public static String ACCESS_PATH = "files";
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
    @Value("${file.subpath.pic}")
    private String filesubpathpic;
    @Value("${file.subpath.resume}")
    private String filesubpathresume;

    public String getFilerootpath() {
        return filerootpath;
    }

    public void setFilerootpath(String filerootpath) {
        this.filerootpath = filerootpath;
    }

    public String getFilesubpathpic() {
        return filesubpathpic;
    }

    public void setFilesubpathpic(String filesubpathpic) {
        this.filesubpathpic = filesubpathpic;
    }

    public String getFilesubpathresume() {
        return filesubpathresume;
    }

    public void setFilesubpathresume(String filesubpathresume) {
        this.filesubpathresume = filesubpathresume;
    }
}
