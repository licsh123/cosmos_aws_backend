package com.shopping.cosmos.order.service;

import com.shopping.cosmos.order.mapper.OrderMapper_jo;
import com.shopping.cosmos.order.vo.OrderDetailVO_jo;
import com.shopping.cosmos.order.vo.OrderSearchVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl_jo implements OrderService_jo {

    @Autowired
    private OrderMapper_jo mapper;

    @Override
    public List<OrderDetailVO_jo> orderStatus(OrderDetailVO_jo vo) {
        return mapper.orderStatus(vo);
    }

    @Override
    public OrderDetailVO_jo orderDetail(OrderDetailVO_jo vo) {
        return mapper.orderDetail(vo);
    }

    @Override
    public void stateChange(OrderDetailVO_jo vo) {
        mapper.stateChange(vo);
    }

    @Override
    public int orderCount() {
        return mapper.orderCount();
    }

    @Override
    public List<OrderDetailVO_jo> cancleOrder(OrderDetailVO_jo vo) {
        return mapper.cancleOrder(vo);
    }

    @Override
    public int cancleOrderCount() {
        return mapper.cancleOrderCount();
    }

    @Override
    public List<OrderSearchVO_jo> orderStatusSearch(OrderSearchVO_jo vo) {
        return mapper.orderStatusSearch(vo);
    }

}
