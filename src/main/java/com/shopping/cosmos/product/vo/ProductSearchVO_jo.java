package com.shopping.cosmos.product.vo;


public class ProductSearchVO_jo extends ProductVO_jo {

    private String searchType;
    private String keyword;


    public String getSearchType() {
        return searchType;
    }

    public void setSearchType(String searchType) {
        this.searchType = searchType;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    @Override
    public String toString() {
        return "ProductSearchVO [searchType=" + searchType + ", keyword=" + keyword + "]";
    }

}
