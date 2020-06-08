package com.daji.mapper;

import com.daji.pojo.PaymentMethodInfo;
import org.springframework.stereotype.Repository;

@Repository("paymentMethodInfoMapper")
public interface PaymentMethodInfoMapper  extends tk.mybatis.mapper.common.Mapper<PaymentMethodInfo> {
}
