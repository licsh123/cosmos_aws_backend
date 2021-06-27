package com.shopping.cosmos.product.vo;


import org.springframework.web.multipart.MultipartFile;

public class ProductVO_jo {

    //private List<ProductVO> products;
    private int product_seq;    //상품번호
    private int product_id;    //상품번호
    private String product_title; //상품제목
    private String product_gender;        //상품성별
    private String product_category;//상품카테고리
    private int product_price;    //상품가격
    private String product_content;    //상품내용
    private String product_color;    //상품컬러  배열로 선언하면 mybatis에서 foreach로 받아야함
    private String product_size;    //상품사이즈
    private String product_material;    //상품재질
    private int product_stock;        //상품재고
    private int product_saled;        //상품판매량
    private MultipartFile uploadFile; //받는 파일
    private String product_img;        //상품이미지
    private String product_date;        //상품등록일
    //페이지 몇개인지
    private int pageNum;
    //글 처음
    private int startRow;
    //글 마지막
    private int endRow;

    public int getProduct_seq() {
        return product_seq;
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

    public void setProduct_seq(int product_seq) {
        this.product_seq = product_seq;
    }

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public String getProduct_title() {
        return product_title;
    }

    public void setProduct_title(String product_title) {
        this.product_title = product_title;
    }

    public String getProduct_gender() {
        return product_gender;
    }

    public void setProduct_gender(String product_gender) {
        this.product_gender = product_gender;
    }

    public String getProduct_category() {
        return product_category;
    }

    public void setProduct_category(String product_category) {
        this.product_category = product_category;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_content() {
        return product_content;
    }

    public void setProduct_content(String product_content) {
        this.product_content = product_content;
    }

    public String getProduct_color() {
        return product_color;
    }

    public void setProduct_color(String product_color) {
        this.product_color = product_color;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }

    public String getProduct_material() {
        return product_material;
    }

    public void setProduct_material(String product_material) {
        this.product_material = product_material;
    }

    public int getProduct_stock() {
        return product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

    public int getProduct_saled() {
        return product_saled;
    }

    public void setProduct_saled(int product_saled) {
        this.product_saled = product_saled;
    }

    public MultipartFile getUploadFile() {
        return uploadFile;
    }

    public void setUploadFile(MultipartFile uploadFile) {
        this.uploadFile = uploadFile;
    }

    public String getProduct_img() {
        return product_img;
    }

    public void setProduct_img(String product_img) {
        this.product_img = product_img;
    }

    public String getProduct_date() {
        return product_date;
    }

    public void setProduct_date(String product_date) {
        this.product_date = product_date;
    }

    /*
    public String[] getImgs() {
        return imgs;
    }
    public void setImgs(String[] imgs) {
        this.imgs = imgs;
    }*/
    @Override
    public String toString() {
        return "ProductVO [product_seq=" + product_seq + ", product_id=" + product_id + ", product_title="
                + product_title + ", product_gender=" + product_gender + ", product_category=" + product_category
                + ", product_price=" + product_price + ", product_content=" + product_content + ", product_color="
                + product_color + ", product_size=" + product_size + ", product_material=" + product_material
                + ", product_stock=" + product_stock + ", product_saled=" + product_saled + ", uploadFile=" + uploadFile
                + ", product_img=" + product_img + ", product_date=" + product_date + ", imgs="
                + "]";
    }


}
