package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class TrackingNetworkClassification implements Serializable {
    @Id
    private Integer id;
    private String typeName;
    private List<TrackingNetwork> networkList;
}
