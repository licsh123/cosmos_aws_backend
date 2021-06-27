package com.shopping.cosmos.order.service;

import com.shopping.cosmos.order.vo.OrderDetailVO_jo;
import com.shopping.cosmos.order.vo.OrderSearchVO_jo;

import java.util.List;

public interface OrderService_jo {
    //주문상태리스트
    List<OrderDetailVO_jo> orderStatus(OrderDetailVO_jo vo);

    //주문상세보기
    OrderDetailVO_jo orderDetail(OrderDetailVO_jo vo);

    //주문상태변경
    void stateChange(OrderDetailVO_jo vo);

    //주문요청개수
    int orderCount();

    //취소요청리스트
    List<OrderDetailVO_jo> cancleOrder(OrderDetailVO_jo vo);

    //취소요청
    int cancleOrderCount();

    //주문 검색
    List<OrderSearchVO_jo> orderStatusSearch(OrderSearchVO_jo vo);
}
