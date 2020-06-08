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
public class CustomerGroup implements Serializable {
    @Id
    private Integer clientCode;
    private String clientName;
    private Integer isStartUsing;
    private String affiliatedBranches;
    private Integer sharingModeId;
    private String shareBranch;
    private String remark;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createDate;
    private String createPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date alterDate;
    private String alterPerson;
}
