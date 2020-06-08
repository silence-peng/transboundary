package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class NumberVerification implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer isStartUsing;
    private String ruleName;
    private Integer ruleOrder;
    private Integer orderType;
    private String singleRule;
    private String effectivePosition;
    private String effectiveCharacterLength;
    private String sampleNumber;
    private String exampleValidOrderNumber;

}
