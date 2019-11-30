package com.hrbc.business.mapper;

import com.hrbc.business.domain.Invoices;
import com.hrbc.business.domain.InvoicesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvoicesMapper {
    long countByExample(InvoicesExample example);

    int deleteByExample(InvoicesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Invoices record);

    int insertSelective(Invoices record);

    List<Invoices> selectByExample(InvoicesExample example);

    Invoices selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Invoices record, @Param("example") InvoicesExample example);

    int updateByExample(@Param("record") Invoices record, @Param("example") InvoicesExample example);

    int updateByPrimaryKeySelective(Invoices record);

    int updateByPrimaryKey(Invoices record);

    int batchInsert(@Param("recordList") List<Invoices> recordList);
}