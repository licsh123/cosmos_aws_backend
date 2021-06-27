package com.shopping.cosmos.order.vo;

public class OrderDetailVO_jo extends OrderVO_jo {

    private String product_title;
    private String product_size;
    private String product_color;
    private Long order_detail_num;
    private String order_id;
    private Long product_seq;
    private String product_id;
    private Long money;
    private Long amount;
    private String product_img;
    private String post_code;
    private String address;
    private String detail_address;
    //money = productPirce*amount

    @Override
    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public Long getOrder_detail_num() {
        return order_detail_num;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getPost_code() {
        return post_code;
    }

    public void setPost_code(String post_code) {
        this.post_code = post_code;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDetail_address() {
        return detail_address;
    }

    public void setDetail_address(String detail_address) {
        this.detail_address = detail_address;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public void setOrder_detail_num(Long order_detail_num) {
        this.order_detail_num = order_detail_num;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public Long getProduct_seq() {
        return product_seq;
    }

    public void setProduct_seq(Long product_seq) {
        this.product_seq = product_seq;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDetailVO [product_title=" + product_title + ", product_size=" + product_size
                + ", product_color=" + product_color + ", order_detail_num=" + order_detail_num + ", order_id="
                + order_id + ", product_seq=" + product_seq + ", money=" + money + ", amount=" + amount + "]";
    }


}
