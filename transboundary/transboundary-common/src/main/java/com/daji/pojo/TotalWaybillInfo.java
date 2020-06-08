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
public class TotalWaybillInfo implements Serializable {
    @Id
    private String totalWaybillNumber;
    private Integer waybillState;
    private String outboundRouting;
    private String sendSite;
    private String nextSite;
    private String takingHoods;
    private String portDeparture;
    private Integer trunkLine;
    private String customsWay;
    private String remark;
    private Integer repair;
    private Integer beforehand;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date totalWaybillTime;
    private Integer numberCases;
    private float trueWeight;
    private float weight;
    private float ladingWeight;
    private Integer abnorma;
    private String createPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createTime;
    private String updatePerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date updateTime;
}
