package com.daji.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class SingleRecordInfo implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String playId;
    private String courseRace;
    private String shipmentRace;
    private String sendAccount;
    private String paymentAccNo;
    private Integer numberCases;
    private float chargeWeight;
    private float exampleWeight;
    private String packagingType;
    private String cargoType;
    private String englishNameOne;
    private String englishNameTwo;
    private String englishNameThree;
    private String paymentAccount;
    private String sender;
    private String sendMail;
    private String sendCity;
    private String mailingAddressOne;
    private String mailingAddressTwo;
    private String mailingAddressThree;
    private String sendTelephone;
    private String recipientAccount;
    private String recipients;
    private String receiveCall;
    private String receivesEmail;
    private String receiptCity;
    private String consigneeAddressOne;
    private String consigneeAddressTwo;
    private String consigneeAddressThree;
    private String shipmentId;
    private String customerCode;
    private String customerName;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date entryTime;
    private String edi;
    private String countriesCode;
    private String paymentMethod;
    private String taxWay;


}
