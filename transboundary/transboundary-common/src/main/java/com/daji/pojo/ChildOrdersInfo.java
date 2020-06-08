package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class ChildOrdersInfo implements Serializable {
    @Id
    private String id;
    private String childOrderNumber;
    private String waybillNumber;
    private String englishName;
    private String chineseName;
    private Integer childCount;
    private float unitPrice;
    private float childSum;
    private String customsCode;
    private float suttle;
    private float roughWeight;
    private String sourceArea;
    private String remark;
}
