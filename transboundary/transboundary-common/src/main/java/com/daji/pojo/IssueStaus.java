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
public class IssueStaus implements Serializable {
    @Id
    private String issueCoding;
    private String issueName;
    private Integer isStartUsing;
    private Integer issueTypeId;
    private String chineseRemark;
    private String englishRemark;
    private String consigneeIssue;
    private String playSingleIssue;
    private Integer sortOrder;
    private Integer visual;
    private Integer processLimited;
    private String informPost;
    private String roleList;
    private Integer problemTypes;
    private Integer needReply;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createDate;
    private String createPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date alterDate;
    private String alterPerson;
}
