package com.shopping.cosmos.cart.domain;

import lombok.Data;

@Data
public class AddressVO {
    private String userId;
    private String userName;
    private String postCode;
    private String address;
    private String detailAddress;
}
