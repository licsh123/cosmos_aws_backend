package com.shopping.cosmos.cart.domain;

import lombok.Data;

import java.util.Date;

@Data
public class OrderVO {
    private String orderId;
    private String userName;
    private String userId;
    private String address;
    private String detailAddress;
    private Long totalPrice;
    private String orderStatus;
    private String postCode;
    private Date orderDate;
    private String orderProductAmount;

}
