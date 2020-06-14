package com.daji.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class UpdateLogInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date operationTime;
    private String waybillNumber;
    private String functionality;
    private String updateType;
    @Column(name = "`describe`")
    private String describe;
    private String operator;
    private String branch;
}
