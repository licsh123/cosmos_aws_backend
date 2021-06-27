package com.shopping.cosmos.cart.domain;

import lombok.Data;

@Data
public class ChatVO {
    private int chatId;
    private String fromEmail;
    private String toEmail;
    private String chatContent;
    private String chatTime;
}
