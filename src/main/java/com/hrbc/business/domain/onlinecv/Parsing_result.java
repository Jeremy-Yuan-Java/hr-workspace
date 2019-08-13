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
public class Parsing_result {

    private Basic_info basic_info;
    private Contact_info contact_info;
    private List<Education_experience> education_experience;
    private List<Work_experience> work_experience;
    private List<Social_experience> social_experience;
    private List<Project_experience> project_experience;
    private List<Training_experience> training_experience;
    private Others others;
    public void setBasic_info(Basic_info basic_info) {
         this.basic_info = basic_info;
     }
     public Basic_info getBasic_info() {
         return basic_info;
     }

    public void setContact_info(Contact_info contact_info) {
         this.contact_info = contact_info;
     }
     public Contact_info getContact_info() {
         return contact_info;
     }

    public void setEducation_experience(List<Education_experience> education_experience) {
         this.education_experience = education_experience;
     }
     public List<Education_experience> getEducation_experience() {
         return education_experience;
     }

    public void setWork_experience(List<Work_experience> work_experience) {
         this.work_experience = work_experience;
     }
     public List<Work_experience> getWork_experience() {
         return work_experience;
     }

    public void setSocial_experience(List<Social_experience> social_experience) {
         this.social_experience = social_experience;
     }
     public List<Social_experience> getSocial_experience() {
         return social_experience;
     }

    public void setProject_experience(List<Project_experience> project_experience) {
         this.project_experience = project_experience;
     }
     public List<Project_experience> getProject_experience() {
         return project_experience;
     }

    public void setTraining_experience(List<Training_experience> training_experience) {
         this.training_experience = training_experience;
     }
     public List<Training_experience> getTraining_experience() {
         return training_experience;
     }

    public void setOthers(Others others) {
         this.others = others;
     }
     public Others getOthers() {
         return others;
     }

}