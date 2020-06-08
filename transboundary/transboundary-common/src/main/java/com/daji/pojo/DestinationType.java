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
public class DestinationType implements Serializable {
    @Id
    private String typeCoding;
    private String typeName;
    private Integer sortOrder;
    private Integer isStartUsing;

}
