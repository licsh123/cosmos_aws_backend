package com.shopping.cosmos.service;

import com.shopping.cosmos.mapper.ProductMapper_hun;
import com.shopping.cosmos.vo.ProductVO_hun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl_hun implements ProductService_hun {

    @Autowired
    ProductMapper_hun productMapper;

    // 해당 시퀀스에 맞는 상품 정보 출력
    @Override
    public ProductVO_hun ProductByID(int product_id) { return productMapper.ProductByID(product_id); }

    // 옵션 조건에 맞는 상품 리스트 출력
    @Override
    public List<ProductVO_hun> productCategory(ProductVO_hun productVO) {
        return productMapper.productCategory(productVO);
    }

    // 옵션 조건에 맞는 마지막 페이지 번호 출력
    @Override
    public int findPageNum(ProductVO_hun productVO) {
        return productMapper.findPageNum(productVO);
    }
}
