package com.shopping.cosmos.service;

import com.shopping.cosmos.vo.ProductVO_hun;

import java.util.List;

public interface ProductService_hun {

    // 해당 시퀀스에 맞는 상품 정보 출력
    public ProductVO_hun ProductByID(int product_id);
    
    // 옵션 조건에 맞는 상품 리스트 출력
    public List<ProductVO_hun> productCategory(ProductVO_hun productVO);
    
    // 옵션 조건에 맞는 마지막 페이지 번호 출력
    public int findPageNum(ProductVO_hun productVO);

}
