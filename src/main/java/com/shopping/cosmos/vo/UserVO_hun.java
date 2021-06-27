package com.shopping.cosmos.vo;

import lombok.Data;

import java.sql.Date;

@Data
public class UserVO_hun {
        // 유저 기본 정보 출력
        private String user_email;
        private String user_password;
        private String user_name;
        private String user_birthday;
        private String user_phone;
        private String user_gender;
        private String user_regdate;

        // 유저 주소 리스트 출력
        private int address_seq;
        private String address_name;
        private String post_code;
        private String address;
        private String detail_address;
        private String address_phone;
        private String address_phone2;

        // 변경할 유저 정보
        private String change_email;
        private String change_phone;
        private String change_password;

        // 환불 계좌 등록
        private String user_bank;
        private String user_account;
        private String user_repay;

}
