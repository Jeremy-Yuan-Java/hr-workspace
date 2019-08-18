/**
 * Copyright 2019 bejson.com
 */
package com.hrbc.business.domain.onlinecv;

/**
 * Auto-generated: 2019-08-12 21:4:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class OnlineCv {

    private String cv_name;
    private String src_site;
    private String errormessage;
    private String cv_id;
    private int errorcode;
    // 简历对象
    private Parsing_result parsing_result;
    private String resume_rawtext;
    private String version;

    public void setCv_name(String cv_name) {
        this.cv_name = cv_name;
    }

    public String getCv_name() {
        return cv_name;
    }

    public void setSrc_site(String src_site) {
        this.src_site = src_site;
    }

    public String getSrc_site() {
        return src_site;
    }

    public void setErrormessage(String errormessage) {
        this.errormessage = errormessage;
    }

    public String getErrormessage() {
        return errormessage;
    }

    public void setCv_id(String cv_id) {
        this.cv_id = cv_id;
    }

    public String getCv_id() {
        return cv_id;
    }

    public void setErrorcode(int errorcode) {
        this.errorcode = errorcode;
    }

    public int getErrorcode() {
        return errorcode;
    }

    public void setParsing_result(Parsing_result parsing_result) {
        this.parsing_result = parsing_result;
    }

    public Parsing_result getParsing_result() {
        return parsing_result;
    }

    public void setResume_rawtext(String resume_rawtext) {
        this.resume_rawtext = resume_rawtext;
    }

    public String getResume_rawtext() {
        return resume_rawtext;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}