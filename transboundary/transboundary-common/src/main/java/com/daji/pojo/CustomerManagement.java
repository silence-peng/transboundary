package com.daji.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class CustomerManagement implements Serializable {
    @Id
    private String code;
    private String name;
    private String customerStatus;
    private String contractNo;
    private String affiliatedBranches;
    private Integer customerType;
    private String customerLevel;
    private String companyName;
    private String chineseAddress;
    private String companyEnglishName;
    private String englishAddress;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date contractDate;
    private Integer assCustomerGroup;
    private String businessLicenseNumber;
    private String idNumber;
    private Integer isStartUsing;
    private String remark;
    private String settlementInterval;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date firstTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date lastTime;
    private String paymentAccount;
}
