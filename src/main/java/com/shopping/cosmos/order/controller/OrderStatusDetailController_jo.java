package com.shopping.cosmos.order.controller;

import com.shopping.cosmos.order.service.OrderService_jo;
import com.shopping.cosmos.order.vo.OrderDetailVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class OrderStatusDetailController_jo {

    @Autowired
    private OrderService_jo service;

    @GetMapping("/manager/orderDetail/{order_detail_num}/{user_email}")
    OrderDetailVO_jo getOrderDetail(OrderDetailVO_jo vo) {
        System.out.println("getOrderDetail 접근");
        return service.orderDetail(vo);
    }

    @PutMapping("/manager/stateChange/{order_status}/{order_id}")
    void orderStateChange(OrderDetailVO_jo vo) {
        System.out.println("orderStateChange 접근");
        System.out.println(vo);
        service.stateChange(vo);

        System.out.println("변경성공");
    }

}