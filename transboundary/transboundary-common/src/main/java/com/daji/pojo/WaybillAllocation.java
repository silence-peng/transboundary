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
public class WaybillAllocation implements Serializable {
    @Id
    private String ruleCoding;
    private Integer isStartUsing;
    private Integer checkType;

    private String ruleName;
    private String oddRule;
    private String oddType;
    private Integer warningNumber;
    private Integer onceMaxCopies;
    private Integer sumCopies;
    private Integer usableCopies;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date alterDate;

    private String createPerson;
    private String alterPerson;

}
