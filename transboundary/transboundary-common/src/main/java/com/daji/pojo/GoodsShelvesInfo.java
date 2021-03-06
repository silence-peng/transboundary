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
public class GoodsShelvesInfo implements Serializable {
    @Id
    private Integer id;
    private String waybillNumber;
    private Integer goodsCoding;
    private String scanNumber;
}
