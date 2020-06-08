package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class InvoiceCashPledge implements Serializable {
    @Id
    private String customerId;
    private Integer billName;
    private String financialLiaison;
    private String financialLiaisonPhone;
    private String sendBillEmail;
    private String acceptBillEmail;
    private String tfn;
    private String invoiceCompany;
    private String invoiceAddress;
    private Integer freightDeposit;
    private Integer freightCurrency;
    private Integer taxesDeposit;
    private Integer taxesCurrency;
}
