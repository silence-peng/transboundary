package com.daji.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class SelectOrderPatementer {
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date openTime;
    @DateTimeFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
    private Date endTime;
    private String siteId;
    private String customerType;
    private String code;
    private String serviceType;
    private String assignTypeId;
    private String assignId;
    private String bourn;
    private String shipmentTypeId;
    private String shipmentId;
    private String orderState;
    private String threeNumber;
    private String allNumber;
    private Integer typeId;
    private String packageId;
    private String cragoId;
    private String customsWay;
    private String paymentMethod;
    private String taxPayment;
}
