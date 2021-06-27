package com.shopping.cosmos.cart.domain;

import lombok.Data;

@Data
public class OrderDetailVO {
    private Long orderDetailsNum;
    private String orderId;
    private Long productId;
    private String productImagePath;
    private Long amount;
    //money = productPirce*amount
    private Long money;
    private Long productPrice;
    private String productName;

}
