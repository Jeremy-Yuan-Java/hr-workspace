package com.hrbc.business.domain.aliylincv;

/**
 * @program: hr-workspace
 * @description: 简历技能信息
 * @author: 波波烤鸭
 * @create: 2019-08-18 22:42
 */
public class ITSkills {

    public String SkillType; // 技能类别

    public String TimeOfUse ;// 使用时间

    public String CompetencyLevel; // 掌握程度

    public String getSkillType() {
        return SkillType;
    }

    public void setSkillType(String skillType) {
        SkillType = skillType;
    }

    public String getTimeOfUse() {
        return TimeOfUse;
    }

    public void setTimeOfUse(String timeOfUse) {
        TimeOfUse = timeOfUse;
    }

    public String getCompetencyLevel() {
        return CompetencyLevel;
    }

    public void setCompetencyLevel(String competencyLevel) {
        CompetencyLevel = competencyLevel;
    }
}
