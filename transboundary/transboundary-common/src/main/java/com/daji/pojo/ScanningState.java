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
public class ScanningState implements Serializable {
    @Id
    private String scanNumber;
    private String scanName;
    private Integer sortOrder;
    private Integer subsectionId;
    private Integer statusAfterId;
    private String chineseRemark;
    private String englishRemark;
    private Integer abnormal;
    private Integer haveTake;
    private Integer settleALawsuit;
    private Integer standardState;
    private Integer visual;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date alterDate;
    private String createPerson;
    private String alterPerson;


}
