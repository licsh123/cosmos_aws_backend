package com.shopping.cosmos.login.vo;

import lombok.Data;

import java.util.Date;

@Data
public class UserVO_DI {
    private String user_email;
    private String user_password;
    private String user_name;
    private String user_birthday;
    private String user_phone;
    private String user_gender;
    private String user_regdate;
    private String user_role;
    private String user_bank;
    private String user_account;
}
