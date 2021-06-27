package com.shopping.cosmos.service;

import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.mapper.ProductDetailMapper_dae;
import com.shopping.cosmos.vo.CartVO_hun;
import com.shopping.cosmos.vo.ProductDetailVO_dae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailServiceImpl_dae implements ProductDetailService_dae {

    @Autowired
    ProductDetailMapper_dae productMapper;

    //상품 정보 모두 출력
    @Override
    public List<ProductDetailVO_dae> productDetail(int id) {
        return productMapper.productDetail(id);
    }

    //장바구니 저장
    @Override
    public void insertCart(CartVO vo) {
        productMapper.insertCart(vo);
    }


}
