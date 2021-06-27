package com.shopping.cosmos.vo;

import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
public class ProductVO_hun {

    int rnum;
    int product_id;
    int product_seq;
    String product_title;
    String product_content;
    int product_price;

    String product_img;
    String[] imgs;

    String product_gender;
    String product_category;

    String product_color;
    String[] colors;
    Set<String> colorSet = new HashSet<String>();

    String product_size;
    String[] sizes;
    Set<String> sizeSet = new HashSet<String>();

    int product_pageNum;

    String select_color;
    String select_size;

    String search_keyword;
    String select_option;


//    public void setProduct_color(String product_color) { colors=product_color.split(","); }
//
//    public void setProduct_size(String product_size) { sizes=product_size.split(","); }


    public void setProduct_img(String product_img){
        imgs = product_img.split(",");
    }

    public void setProduct_color(String product_color) {
        colors=product_color.split(",");
        for(String i : colors){
            colorSet.add(i);
        }
        this.product_color = product_color;
    }

    public void setProduct_size(String product_size) {
        sizes=product_size.split(",");
        for(String i : sizes){
            sizeSet.add(i);
        }
    }

}