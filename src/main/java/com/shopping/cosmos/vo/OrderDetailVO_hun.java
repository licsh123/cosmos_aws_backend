package com.shopping.cosmos.vo;

import lombok.Data;

@Data
public class OrderDetailVO_hun {
        int product_seq;
        int product_id;
        String product_title;
        int product_price;
        String product_img;
        String product_size;
        String product_color;
        String product_gender;
        String product_content;
        String product_material;
        String product_category;
        String product_date;
        String order_id;
        int money;
        int amount;
        String[] imgs;

        public void setProduct_img(String product_img) { imgs = product_img.split(","); }

}
