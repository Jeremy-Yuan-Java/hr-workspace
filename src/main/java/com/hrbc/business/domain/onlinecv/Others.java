/**
  * Copyright 2019 bejson.com 
  */
package com.hrbc.business.domain.onlinecv;
import java.util.List;

/**
 * Auto-generated: 2019-08-12 21:4:25
 *
 * @author bejson.com (i@bejson.com)
 * @website http://www.bejson.com/java2pojo/
 */
public class Others {

    private List<String> skills;
    private List<String> it_skills;
    private List<String> business_skills;
    private List<String> language;
    private List<String> certificate;
    private List<String> awards;
    private String self_evaluation;
    public void setSkills(List<String> skills) {
         this.skills = skills;
     }
     public List<String> getSkills() {
         return skills;
     }

    public void setIt_skills(List<String> it_skills) {
         this.it_skills = it_skills;
     }
     public List<String> getIt_skills() {
         return it_skills;
     }

    public void setBusiness_skills(List<String> business_skills) {
         this.business_skills = business_skills;
     }
     public List<String> getBusiness_skills() {
         return business_skills;
     }

    public void setLanguage(List<String> language) {
         this.language = language;
     }
     public List<String> getLanguage() {
         return language;
     }

    public void setCertificate(List<String> certificate) {
         this.certificate = certificate;
     }
     public List<String> getCertificate() {
         return certificate;
     }

    public void setAwards(List<String> awards) {
         this.awards = awards;
     }
     public List<String> getAwards() {
         return awards;
     }

    public void setSelf_evaluation(String self_evaluation) {
         this.self_evaluation = self_evaluation;
     }
     public String getSelf_evaluation() {
         return self_evaluation;
     }

}