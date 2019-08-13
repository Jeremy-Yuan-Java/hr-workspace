package com.hrbc.business.mapper;

import com.hrbc.business.domain.Candidatetags;
import com.hrbc.business.domain.CandidatetagsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CandidatetagsMapper {
    long countByExample(CandidatetagsExample example);

    int deleteByExample(CandidatetagsExample example);

    int deleteByPrimaryKey(String tag);

    int insert(Candidatetags record);

    int insertSelective(Candidatetags record);

    List<Candidatetags> selectByExample(CandidatetagsExample example);

    Candidatetags selectByPrimaryKey(String tag);

    int updateByExampleSelective(@Param("record") Candidatetags record, @Param("example") CandidatetagsExample example);

    int updateByExample(@Param("record") Candidatetags record, @Param("example") CandidatetagsExample example);

    int updateByPrimaryKeySelective(Candidatetags record);

    int updateByPrimaryKey(Candidatetags record);

    int batchInsert(@Param("recordList") List<Candidatetags> recordList);
}