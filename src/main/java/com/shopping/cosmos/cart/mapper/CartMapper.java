package com.shopping.cosmos.cart.mapper;

import com.shopping.cosmos.cart.domain.AddressVO;
import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.cart.domain.UserVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CartMapper {

    //장바구니 상품
    void insertCart(CartVO vo);
    //장바구니 목록
    List<CartVO> listCart(String userId);
    //장바구니 수량 수정
    void modifyCart(CartVO vo);
    //장바구니 동일한 상품 레코드 확인
    int countCart(CartVO vo);
    //장바구니에 동일한 상품 존재하면 상품갯수를 한개 증가
    void updateCart(CartVO vo);
    //장바구니 개별 삭제
    void deleteCart(int cartId);
    //장바구니 전체 비우기
    void deleteCartAll(String userId);
    //장바구니 금액 합계
    int sumMoney(String userId);


    //배송지 리스트 가져오기
    List<AddressVO> listAddress(String userId);

    //주문 고객 정보 가져오기
    UserVO userOrderData(String userId);

}
