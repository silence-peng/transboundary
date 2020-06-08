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
public class Bejob implements Serializable {
    @Id
    private String employeeCode;
    private String personnelName;
    private Integer start;
    private String postCode;
    private String sex;
    private String networkTypeId;
    private Integer deptId;
    private Integer positionId;
    private Integer jobstatus;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date entry_date;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date contractExpirationDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date dimissionDate;
    private String cell_phone;
    private String phone;
    private String email;
    private String work_qq;
    private String work_address;
    private String address;
    private String remark;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createtime;
    private String creator;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date amendtime;
    private String modifierName;
}
