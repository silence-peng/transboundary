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
public class CargoInfo implements Serializable {
    @Id
    private String cargoId;
    private String customsWay;
    private String cargoType;
    private String packagingType;
    private Integer numberCases;
    private Integer quantity;
    private String waybillNumber;
    private float declaredValue;
    private String declaredCurrency;
    private float trueWeight;
    private float weight;
    private float chargeWeight;
    private float shipmentWeight;
    private float shippingWeight;
    private float exampleWeight;
    private String deliveryNote;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date shippingTime;
    private String receiptNote;
    private String bulk;
    private String englishName;
    private String chineseName;


}
