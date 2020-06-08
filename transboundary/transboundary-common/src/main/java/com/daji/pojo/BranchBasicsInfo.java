package com.daji.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class BranchBasicsInfo implements Serializable {
    @Id
    private String branchCoding;
    private String branchName;
    private Integer isStartUsing;
    private Integer branchTypeId;
    private String branchBrevity_code;
    private String branchFamiliar_style;
    private String branchEnglish;
    private String country;
    private String continent;
    private String city;
    private Integer branchCoinId;
    private String principal;
    private String principalPhone;
    private String manager;
    private String managerPhone;
    private String complaintsHotline;
    private String internalCall;
    private String service;
    private String servicePhone;
    private Integer arClerk;
    private String remark;
    private String chineseAddress;
    private String englishAddress;
    private String companyPhone;
    private String companyFax;
    private String companyMail;
    private String headOffice_log;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createDate;
    private String createPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date alterDate;
    private String alterPerson;
    private String superiorBranch;

    public BranchBasicsInfo() {
    }
}
