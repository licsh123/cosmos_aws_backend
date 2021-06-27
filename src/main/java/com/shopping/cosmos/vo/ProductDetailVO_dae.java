package com.shopping.cosmos.vo;

import lombok.Data;

import java.util.List;

@Data
public class ProductDetailVO_dae {

    private int product_seq;
    private int product_id;
    private String product_title;
    private String product_content;
    private int product_price;
    private String product_gender;
    private String product_category;

    private String product_color;
    private String product_size;
    private String product_material;


    private int product_stock;
    private int product_saled;

    private String product_img;
    private String[] imgs;
    public void setProduct_img(String product_img){
        imgs = product_img.split(",");
    }

}