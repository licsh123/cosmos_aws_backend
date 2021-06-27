package com.shopping.cosmos.order.controller;

import com.shopping.cosmos.order.service.OrderService_jo;
import com.shopping.cosmos.order.vo.OrderDetailVO_jo;
import com.shopping.cosmos.order.vo.OrderSearchVO_jo;
import com.shopping.cosmos.product.vo.ProductVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class OrderStatusController_jo {

    @Autowired
    private OrderService_jo service;

    @GetMapping("/manager/orderStatus/{pageNum}")
    List<OrderDetailVO_jo> getOrderStatus(OrderDetailVO_jo vo) {
        System.out.println("getOrderStatus 접근");
        System.out.println("pageNum=" + vo.getPageNum());

        // 상품 몇번쨰부터 보여줄건지 계산
        int startRow = (vo.getPageNum() - 1) * 10;
        if(startRow<0){
            startRow=0;
        }
        //10개씩 보여줌
        int endRow = 10;
        vo.setStartRow(startRow);
        vo.setEndRow(endRow);
        System.out.println(startRow);
        System.out.println(endRow);
        return service.orderStatus(vo);
    }

    @GetMapping("/manager/orderCount")
    int getOrderCount(ProductVO_jo vo) {
        //전체상품개수
        int orderCount = service.orderCount();
        System.out.println("전체 상품개수=" + orderCount);
        //상품페이지를 보여주기위해 10으로 나눈값을 하나더함 상품개수가 33개라면 3페이지가 아닌 4페이지를 보여주기위해
        if (orderCount > 10 && orderCount % 10 != 0) {
            orderCount = (orderCount / 10) + 1;
            System.out.println("orderCount1=" + orderCount);
        } else {
            orderCount = orderCount / 10;
            System.out.println("orderCount2=" + orderCount);
        }
        if (orderCount == 0) {
            orderCount = 1;
        }
        System.out.println("orderCount2=" + orderCount);
        return orderCount;
    }

    @GetMapping("/manager/orderStatusSearch/{keyword}/{searchType}")
    List<OrderSearchVO_jo> orderStatusSearch(OrderSearchVO_jo user) {
        System.out.println("userStateSearch접근");
        System.out.println(user);
        return service.orderStatusSearch(user);
    }
}