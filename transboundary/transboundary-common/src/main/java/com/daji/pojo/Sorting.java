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
public class Sorting implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer isStartUsing;
    private Integer customer;
    private String affiliatedBranches;
    private String shipRoute;
    private String desCoding;
    private String englishDes;
    private String chineseDes;
    private String clearanceId;
    private String cargoTypeId;
    private Integer sortingMouth;
    private Integer sortingYards;

}
