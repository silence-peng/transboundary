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
public class CustomerContactPerson implements Serializable {
    @Id
    private String customerId;
    private String linkman;
    private Integer deptId;
    private String businessPhone;
    private String businessCellphone;
    private String fax;
    private String emailAddress;
    private String qq;
    private String remark;
    private Integer salesman;
    private Integer merchandiser;
    private Integer customerServiceBefore;
    private Integer customerServiceAfter;
    private Integer arClerk;

}
