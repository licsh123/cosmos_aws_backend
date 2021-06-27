package com.shopping.cosmos.mapper;

import com.shopping.cosmos.vo.OrderDetailVO_hun;
import com.shopping.cosmos.vo.OrderVO_hun;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper_hun {

    // 해당 유저의 주문목록 모두 가져오기
    List<OrderVO_hun> getUserOrderList(String user_email);

    // 해당 주문내역 취소 요청
    void returnOrder(String order_id);

    // 주문 상세내역 보기 1
    OrderVO_hun selectOrderInfo(String order_id);

    // 주문 상세내역 보기 2
    List<OrderDetailVO_hun> selectOrderDetailInfo(String order_id);

}