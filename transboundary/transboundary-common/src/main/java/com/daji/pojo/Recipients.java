package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class Recipients implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer isStartUsing;
    private String receivesAnEin;
    private String conCompany;
    private String conPerson;
    private String conPhone;
    private String affiliatedBranches;
    private Integer sharingMode;
    private Integer customerId;
    private String shareBranch;
    private String consigneeAddressOne;
    private String consigneeAddressTwo;
    private String consigneeAddressThree;
    private String consigneeCountry;
    private String consigneeContinent;
    private String consigneeCity;
    private String consigneeEmail;

}
