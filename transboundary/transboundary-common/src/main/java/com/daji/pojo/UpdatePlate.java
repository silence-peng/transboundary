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
public class UpdatePlate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer isStartUsing;
    private Integer deliveryBranch;
    private String affiliatedBranches;
    private Integer sharingMode;
    private String strategyCoding;
    private String strategyBame;
    private String sendASite;
    private Integer cargoType;
    private Integer shipRoute;
    private Integer clearanceId;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date alterDate;

    private String remark;
    private String shareBranch;
    private String createPerson;
    private String alterPerson;

    private float singleBagWeight;
    private String parcelExchangeOffice;
}
