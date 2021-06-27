package com.shopping.cosmos.order.vo;

public class OrderVO_jo {
    private String order_id;
    private String product_id;
    private String user_email;
    private String user_name;
    private String post_code;
    private String address;
    private String detail_address;
    private Long total_price;
    private String order_status;
    private String order_date;
    private String order_product_amount;

    //페이지 몇개인지
    private int pageNum;
    //글 처음
    private int startRow;
    //글 마지막
    private int endRow;

    public String getProduct_id() {
        return product_id;
    }

    public void setProduct_id(String product_id) {
        this.product_id = product_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getStartRow() {
        return startRow;
    }

    public void setStartRow(int startRow) {
        this.startRow = startRow;
    }

    public int getEndRow() {
        return endRow;
    }

    public void setEndRow(int endRow) {
        this.endRow = endRow;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getUser_email() {
        return user_email;
    }

    public void setUser_email(String user_email) {
        this.user_email = user_email;
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

    public Long getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Long total_price) {
        this.total_price = total_price;
    }

    public String getOrder_status() {
        return order_status;
    }

    public void setOrder_status(String order_status) {
        this.order_status = order_status;
    }

    public String getOrder_date() {
        return order_date;
    }

    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }

    public String getOrder_product_amount() {
        return order_product_amount;
    }

    public void setOrder_product_amount(String order_product_amount) {
        this.order_product_amount = order_product_amount;
    }

    @Override
    public String toString() {
        return "OrderVO [order_id=" + order_id + ", user_email=" + user_email + ", user_name=" + user_name
                + ", post_code=" + post_code + ", address=" + address + ", detail_address=" + detail_address
                + ", total_price=" + total_price + ", order_status=" + order_status + ", order_date=" + order_date
                + ", order_product_amount=" + order_product_amount + ", pageNum=" + pageNum + ", startRow=" + startRow
                + ", endRow=" + endRow + "]";
    }

}
