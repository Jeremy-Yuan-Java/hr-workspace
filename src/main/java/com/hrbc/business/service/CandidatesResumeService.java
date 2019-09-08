package com.hrbc.business.service;

import com.hrbc.business.domain.*;
import com.hrbc.business.domain.aliylincv.ResumeInfo;
import com.hrbc.business.domain.common.CandidatesDto;
import com.hrbc.business.domain.common.ResponseDTO;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

public interface CandidatesResumeService {

    List<CandidatesResume> query(CandidatesResume resume);

    ResumeInfo getResumeInfo(Integer candidatesId);

    CandidatesResume getCandidatesResume(Integer candidatesId);

    /**
     * 解析简历
     * @param in  需要解析的文件的字节流
     * @param suffixName  简历类型的后缀名
     * @return
     *
     */
    Integer resolveResume(InputStream in ,String suffixName);

    ResponseDTO loadResumeDetail(Integer candidatesId);


    Integer saveResumeByCandidates(CandidatesDto candidates);

    Map<String,Object> resolveExportCandidatesInfo(Integer candidatesId);

    void updateCandidatesInfo();

}
