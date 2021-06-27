package com.shopping.cosmos.cart.domain;

import lombok.Data;

@Data
public class CartVO {
    private Long cartId;
    private String userId;
    private String userName;
    private Long productId;
    private String productName;
    private String productSize;
    private Long productStock;
    private String productColor;
    private Long productPrice;
    private Long amount;
    private Long money;
    private Long sumMoney;
    private String productImagePath;
}
