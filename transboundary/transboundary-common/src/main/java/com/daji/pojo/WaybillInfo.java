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
public class WaybillInfo implements Serializable {
    @Id
    private String wayId;
    private String waybillNumber;
    private String trackingNumber;
    private String participationNumber;
    private String productNumber;
    private String shipmentId;
    private String siteId;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date sendDate;
    private String clientId;
    private String courseRace;
    private String bourn;
    private String shipmentRace;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date orderDate;
    private Serializable takePart;
    private Integer orderStatus;
    private Integer dataSources;
    private String createName;
    @DateTimeFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    @JsonFormat(pattern = "yyyy-MM-dd mm:hh:ss")
    private Date cretedate;
    private Integer faraway;
    private String countriesCode;
}
