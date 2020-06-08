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
public class AgencyContactInfo implements Serializable {
    @Id
    private Integer agencyId;
    private String linkman;
    private String post;
    private String phone;
    private String fax;
    private String email;
    private String remark;
}
