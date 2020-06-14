package com.daji.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Accessors(chain = true)//链式写法
public class SelectOrder {
    private String waybillNumber;
    private String participationNumber;
    private String productNumber;
        private String orderDate;
        private float declaredValue;
        private float payment;
        private String bulk;
        private Integer quantity;
        private float shipmentWeight;
        private float shippingWeight;
        private String deliveryNote;
        private String receiptNote;
    private String shipmentId;
    private String trackingNumber;
    private String sendDate;
    private String branchName;
    private String clientCode;
    private String clientName;
    private String serviceType;
    private String assignCode;
    private String assignName;
    private String destCode;
    private String destName;
    private String destEnglishName;
    private String orderState;
    private String shihpName;
    private String customsWay;//报关方式
    private String cargoType;//货物类型
    private String packagingName;//包装类型
    private String numberCases;//件数
    private String trueWeight;//收费实重
    private String weight;//收费材重'
    private String chargeWeight;//收费重'
    private String chineseName;//中文品名'
    private String englishName;//英文品名'
    private String exampleWeight;//出货重'
    private String payType;//付款方式'

    private float taxPayment;//税金付款'
    private float agencyPayment;//代收款'
    private float agencyCurrency;//代收币别'
}
