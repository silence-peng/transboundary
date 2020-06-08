package com.daji.service.impl;

import com.daji.mapper.InvoiceCashPledgeMapper;
import com.daji.pojo.InvoiceCashPledge;
import com.daji.service.InvoiceCashPledgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.base.update.UpdateByPrimaryKeyMapper;

import java.util.List;

@Service
public class InvoiceCashPledgeServiceImpl implements InvoiceCashPledgeService {
    @Autowired
    private InvoiceCashPledgeMapper invoiceCashPledgeMapper;
    @Override
    public List<InvoiceCashPledge> getAll() {
        return invoiceCashPledgeMapper.selectAll();
    }

    @Override
    public List<InvoiceCashPledge> getData(InvoiceCashPledge invoiceCashPledge) {
        return invoiceCashPledgeMapper.select(invoiceCashPledge);
    }

    @Override
    public InvoiceCashPledge getOne(InvoiceCashPledge invoiceCashPledge) {
        return invoiceCashPledgeMapper.selectByPrimaryKey(invoiceCashPledge);
    }

    @Override
    public Integer add(InvoiceCashPledge invoiceCashPledge) {
        return invoiceCashPledgeMapper.insert(invoiceCashPledge);
    }

    @Override
    public Integer del(InvoiceCashPledge invoiceCashPledge) {
        return invoiceCashPledgeMapper.delete(invoiceCashPledge);
    }

    @Override
    public Integer upd(InvoiceCashPledge invoiceCashPledge) {
        return invoiceCashPledgeMapper.updateByPrimaryKey(invoiceCashPledge);
    }
}
