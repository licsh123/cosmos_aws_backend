package com.shopping.cosmos.cart.domain;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO {
        private String user_email;
        private String user_password;
        private String user_name;
        private String user_birthday;
        private String user_phone;
        private Date user_regdate;
        private int postcode;
        private String address;
        private String detailaddress;
}
