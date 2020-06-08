package com.daji.mapper;

import com.daji.pojo.InvoiceCashPledge;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;


@Repository("invoiceCashPledgeMapper")
public interface InvoiceCashPledgeMapper extends tk.mybatis.mapper.common.Mapper<InvoiceCashPledge> {
}
