package com.shopping.cosmos.mapper;

import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.vo.CartVO_hun;
import com.shopping.cosmos.vo.ProductDetailVO_dae;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductDetailMapper_dae {

    //상품 정보 모두 출력
    public List<ProductDetailVO_dae> productDetail(int id);

    //장바구니 저장
    public void insertCart(CartVO vo);
}
