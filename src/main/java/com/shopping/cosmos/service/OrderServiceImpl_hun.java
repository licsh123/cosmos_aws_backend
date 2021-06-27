package com.shopping.cosmos.service;

import com.shopping.cosmos.mapper.OrderMapper_hun;
import com.shopping.cosmos.vo.OrderDetailVO_hun;
import com.shopping.cosmos.vo.OrderVO_hun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl_hun implements OrderService_hun {

    @Autowired
    OrderMapper_hun orderMapper;

    @Override
    public List<OrderVO_hun> getUserOrderList(String user_email) {
        return orderMapper.getUserOrderList(user_email);
    }

    @Override
    public void returnOrder(String order_id) {
        orderMapper.returnOrder(order_id);
    }

    @Override
    public OrderVO_hun selectOrderInfo(String order_id) {
        return orderMapper.selectOrderInfo(order_id);
    }

    @Override
    public List<OrderDetailVO_hun> selectOrderDetailInfo(String order_id) {
        return orderMapper.selectOrderDetailInfo(order_id);
    }
}
