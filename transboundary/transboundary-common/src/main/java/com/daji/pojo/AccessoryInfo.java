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
public class AccessoryInfo implements Serializable {
    @Id
    private String customerId;
    private String accessoryOne;
    private String accessoryTwo;
    private String accessoryThree;
    private String accessoryFour;
    private String accessoryFive;

}
