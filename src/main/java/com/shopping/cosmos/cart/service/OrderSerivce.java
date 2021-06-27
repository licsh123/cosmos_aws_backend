package com.shopping.cosmos.cart.service;

import com.shopping.cosmos.cart.domain.OrderDetailVO;
import com.shopping.cosmos.cart.domain.OrderVO;

public interface OrderSerivce {

    public void insertOrder(OrderVO vo);

    //오더디테일을 넣기
    public void insertOrderDetail(OrderDetailVO orderDetailVO, String userId);
}
