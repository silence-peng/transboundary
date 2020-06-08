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
public class TwoSidesInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer typeId;
    private String waybillNumber;
    private String company;
    private String personName;
    private String phone;
    private String addressOne;
    private String addressTwo;
    private String addressThree;
    private String state;
    private String stateProvince;
    private String city;
    private String postcode;
    private String dutyParagraph;
    private String email;
}
