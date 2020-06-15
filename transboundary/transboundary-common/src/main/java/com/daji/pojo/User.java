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
public class User implements Serializable {
    @Id
    private String userCode;
    private String userName;
    private String authorizationRode;
    private String authorizedOutlets;
    private String createPerson;
    private String alterPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date lastLoginTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date alterDate;
    private Integer isStartUsing;
    private Integer isAdmin;
    private Integer deptno;
    private Integer authorizedOutletsType;
    private Integer isSpeciallyAuthorize;
    private Integer loginCount;
    private String pwd;
    private String affiliatedBranches;
}
