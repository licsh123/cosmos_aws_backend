package com.shopping.cosmos.cart.mapper;

import com.shopping.cosmos.cart.domain.OrderDetailVO;
import com.shopping.cosmos.cart.domain.OrderVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper {
    void insertOrder(OrderVO vo);
    void insertOrderDetail(OrderDetailVO orderDetailVO);
}
