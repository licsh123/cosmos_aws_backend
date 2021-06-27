package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.AddressVO;
import com.shopping.cosmos.cart.domain.KaKaoPayApprovalVO;
import com.shopping.cosmos.cart.domain.UserVO;

import java.util.List;

public interface KakaoPayService {
    //카카오페이 준비
    public String kakaoPayReady(String userId);

    //카카오페이 승인
    public KaKaoPayApprovalVO kakaoPayInfo(String pg_token, String userId);

    //배송지 가져오기
    public List<AddressVO> listAddress(String userId);

    //주문고객 정보 가져오기
    public UserVO userOrderData(String userId);



}
