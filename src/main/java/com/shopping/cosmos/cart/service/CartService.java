package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.CartVO;

import java.util.List;

public interface CartService {
    //장바구니 추가
    public void insert(CartVO vo);

    //장바구니 목록
    public List<CartVO> listCart(String userId);

    //장바구니 삭제
    public void deleteCart(int cartId);

    //장바구니 전체 비우기
    public void deleteCartAll(String userId);

    //장바구니 상품수량 수정
    public void modifyCart(CartVO vo);

    //장바구니 금액 합계
    public int sumMoney(String userId);

    // 장바구니 동일한 상품 레코드 확인
    public int countCart(CartVO vo);

    //장바구니 상품 수량 변경
    public void updateCart(CartVO vo);




}
