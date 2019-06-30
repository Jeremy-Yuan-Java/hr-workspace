package com.hrbc.business.mapper;

import com.hrbc.business.domain.Candidatetags;
import com.hrbc.business.domain.CandidatetagsExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CandidatetagsMapper {
    int countByExample(CandidatetagsExample example);

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
}