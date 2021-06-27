package com.shopping.cosmos.controller;

import com.shopping.cosmos.service.OrderService_hun;
import com.shopping.cosmos.vo.OrderDetailVO_hun;
import com.shopping.cosmos.vo.OrderVO_hun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/order")
public class OrderController_hun {

    @Autowired
    OrderService_hun orderService;


    // 해당 유저의 주문목록 모두 가져오기
    @GetMapping("/getuserorderlist/{user_email}")
    public List<OrderVO_hun> getUserOrderList(@PathVariable String user_email){
        System.out.println("getUserOrderList Success!");
        System.out.println("user_email : "+user_email);
        return orderService.getUserOrderList(user_email);
    }

    // 해당 주문건 취소 요청하기
    @GetMapping("/returnorder/{order_id}")
    public void returnOrder(@PathVariable String order_id){
        System.out.println("returnOrder Success!");
        System.out.println("order_id : "+order_id);
        orderService.returnOrder(order_id);
    }

    // 주문 상세내역 보기 1
    @GetMapping("/selectorderinfo/{order_id}")
    public OrderVO_hun selectOrderInfo(@PathVariable String order_id){
        System.out.println("selectOrderInfo Success!");
        System.out.println("order_id : "+order_id);
        return orderService.selectOrderInfo(order_id);
    }

    // 주문 상세내역 보기 2
    @GetMapping("/selectorderdetailinfo/{order_id}")
    public List<OrderDetailVO_hun> selectOrderDetailInfo(@PathVariable String order_id){
        System.out.println("selectOrderDetailInfo Success!");
        System.out.println("order_id : "+order_id);
        return orderService.selectOrderDetailInfo(order_id);
    }
}