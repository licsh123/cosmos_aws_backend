package com.shopping.cosmos.service;


import com.shopping.cosmos.vo.OrderDetailVO_hun;
import com.shopping.cosmos.vo.OrderVO_hun;

import java.util.List;

public interface OrderService_hun {

    // 해당 유저의 주문목록 모두 가져오기
    public List<OrderVO_hun> getUserOrderList(String user_email);

    // 해당 주문내역 취소 요청
    public void returnOrder(String order_id);

    // 주문 상세내역 보기 1
    public OrderVO_hun selectOrderInfo(String order_id);

    // 주문 상세내역 보기 2
    public List<OrderDetailVO_hun> selectOrderDetailInfo(String order_id);
}
