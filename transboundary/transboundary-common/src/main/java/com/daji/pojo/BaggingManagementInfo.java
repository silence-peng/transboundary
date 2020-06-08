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
public class BaggingManagementInfo implements Serializable {
    @Id
    private String orderNumberBag;
    private String customsClearance;
    private String baggingStrategy;
    private String sendSite;
    private String shipmentRace;
    private String destinationCode;
    private String englishDestination;
    private String simplifiedDestination;
    private Integer baggingState;
    private String allWeight;
    private String oneWeight;
    private String customsWay;
    private String cargoType;
    private String airportCode;
    private String parcel;
    private String remark;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date finshTime;
    private String finshPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date shippingTime;
    private String shippingPerson;
    private String createPerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date createTime;
    private String updatePerson;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date updateTime;
    private Integer dateSource;
    private String baggingOutlets;
}
