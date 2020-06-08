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
public class WaybillTracking implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String lineCoding;
    private String lineName;
    private String routeInEnglish;
    private String routeInChinese;

    private Integer trackingNetworkId;
    private Integer businessType;
    private Integer routeType;
    private String affiliatedBranches;
    private String openFileType;
    private String contactPerson;
    private String companyName;
    private String telephone;
    private String email;

    private String remark;

}
