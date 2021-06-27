package com.shopping.cosmos.order.mapper;

import com.shopping.cosmos.order.vo.OrderDetailVO_jo;
import com.shopping.cosmos.order.vo.OrderSearchVO_jo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper_jo {

    List<OrderDetailVO_jo> orderStatus(OrderDetailVO_jo vo);

    OrderDetailVO_jo orderDetail(OrderDetailVO_jo vo);

    void stateChange(OrderDetailVO_jo vo);

    int orderCount();

    List<OrderDetailVO_jo> cancleOrder(OrderDetailVO_jo vo);

    int cancleOrderCount();

    List<OrderSearchVO_jo> orderStatusSearch(OrderSearchVO_jo vo);
}
