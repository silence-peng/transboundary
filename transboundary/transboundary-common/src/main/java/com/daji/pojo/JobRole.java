package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class JobRole implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer isStartUsing;
    private Integer isStandardPosition;
    private String languageId;
    private Integer positionLevelId;
    private String positionName;
    private String positionExplain;
    private Integer branchTypeId;
    private Date createDate;
    private String createPerson;
    private Date alterDate;
    private String alterPerson;
    private Integer deptId;
}
