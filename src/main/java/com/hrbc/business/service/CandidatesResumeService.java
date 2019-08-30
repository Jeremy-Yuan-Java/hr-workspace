package com.hrbc.business.service;

import com.hrbc.business.domain.*;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.domain.common.ResponseDTO;

import java.io.InputStream;
import java.util.List;

public interface CandidatesResumeService {

    /**
     * 解析简历
     * @param in  需要解析的文件的字节流
     * @param suffixName  简历类型的后缀名
     * @return
     *
     */
    Integer resolveResume(InputStream in ,String suffixName);

    ResponseDTO loadResumeDetail(Integer candidatesId);

    CandidatesResumeDetail queryResumeDetail(Integer candidatesId);

    List<CandidatesResumeEducationinfo> queryResumeEdus(Integer resumeId);

    List<CandidatesResumeExperienceinfoWithBLOBs> queryResumeExprs(Integer resumeId);

    List<CandidatesResumeProjectinfoWithBLOBs> queryResumePros(Integer resumeId);

    List<CandidatesResumeTraininginfo> queryResumeTrans(Integer resumeId);

    Integer saveCandidatesResumeDetail(CandidatesResumeDetailWithBLOBs detail);

    Integer saveCandidatesResumeEdus(List<CandidatesResumeEducationinfo> edus ,Integer resumeId);

    Integer saveCandidatesResumeExpr(List<CandidatesResumeExperienceinfoWithBLOBs> expr,Integer resumeId);

    Integer saveCandidatesResumeProjs(List<CandidatesResumeProjectinfoWithBLOBs> pros,Integer resumeId);

    Integer saveCandidatesResumeTrans(List<CandidatesResumeTraininginfo> trans,Integer resumeId);

    Integer saveResumeByCandidates(CandidatesDto candidates);

    void updateSynchronizationCandidatesInfo();

}
