package com.shopping.cosmos.mapper;

import com.shopping.cosmos.vo.ProductVO_hun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper_hun {

    // 해당 시퀀스에 맞는 상품 정보 출력
    ProductVO_hun ProductByID(int product_id);

    // 옵션 조건에 맞는 상품 리스트 출력
    List<ProductVO_hun> productCategory(ProductVO_hun productVO);

    // 옵션 조건에 맞는 마지막 페이지 번호 출력
    int findPageNum(ProductVO_hun productVO);
}