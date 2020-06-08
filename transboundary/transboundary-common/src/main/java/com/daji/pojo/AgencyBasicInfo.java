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
public class AgencyBasicInfo implements Serializable {
    @Id
    private Integer id;
    private Integer isStartUsing;
    private String agencyCode;
    private String agencyName;
    private String agencyInCode;
    private Integer agencyTypeId;
    private String state;
    private String continent;
    private String city;
    private String affiliatedBranches;
    private String postcode;
    private Integer arClerk;
    private String remark;
    private String address;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createDate;
    private String createPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date alterDate;
    private String alterPerson;

}
