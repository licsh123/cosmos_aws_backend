package com.shopping.cosmos.vo;

import lombok.Data;

import java.sql.Date;

@Data
public class OrderVO_hun {
        private String order_id;
        private String user_email;
        private String post_code;
        private String address;
        private String detail_address;
        private Long order_product_amount;
        private Long total_price;
        private String order_status;
        private String order_date;
        private String user_name;
        private String pay_info;
}
