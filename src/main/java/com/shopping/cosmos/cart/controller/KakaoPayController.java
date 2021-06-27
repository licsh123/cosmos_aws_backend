package com.shopping.cosmos.cart.controller;

import com.shopping.cosmos.cart.domain.*;
import com.shopping.cosmos.cart.service.KakaoPayService;
import com.shopping.cosmos.cart.service.OrderSerivce;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpSession;
import java.text.DecimalFormat;
import java.util.Calendar;
import java.util.List;

@Log
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RequestMapping("/order")
public class KakaoPayController {
    private KakaoPayService kakaopayService;

    private OrderSerivce orderSerivce;

    @GetMapping("/address")
    public List<AddressVO> addressList(HttpSession session){
        String userId=(String)session.getAttribute("user_email");
        return kakaopayService.listAddress(userId);
    }
    @GetMapping("/user")
    public UserVO userData(HttpSession session){
        //String userId = "licsh12@gmail.com";
        String userId=(String)session.getAttribute("user_email");
        return kakaopayService.userOrderData(userId);
    }

    @GetMapping("/kakaoPay2")
    public void kakaoPayGet(){
    }

    @PostMapping("/kakaoPay")
    public String kakaoPay(HttpSession session){
        log.info("kakaoPay post.....");

        String userId = (String) session.getAttribute("user_email");

        return kakaopayService.kakaoPayReady(userId);
    }

    @PostMapping("/insert")
    public void orderInsert(HttpSession session,@RequestBody OrderVO orderVO){
        String userId=(String) session.getAttribute("user_email");
        OrderDetailVO orderDetailVO = new OrderDetailVO();
        orderVO.setUserId(userId);

        //주문번호(orderId) 생성을 위한 로직
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        String ym = year + new DecimalFormat("00").format(cal.get(Calendar.MONTH) + 1);
        String ymd = ym +  new DecimalFormat("00").format(cal.get(Calendar.DATE));
        String subNum = "";

        for(int i = 1; i <= 6; i ++) {
            subNum += (int)(Math.random() * 10);
        }

        try{
            session.removeAttribute("orderVO");
            session.removeAttribute("orderDetailVO");
        }
        catch(Exception e){
            System.out.println("order 정보가 session에 존재하지 않습니다");
        }

        String orderId = ymd + "_" + subNum; //ex) 20200508_373063
        orderVO.setOrderId(orderId);
        orderDetailVO.setOrderId(orderId);

        session.setAttribute("orderVO",orderVO);
        session.setAttribute("orderDetailVO",orderDetailVO);


//        orderSerivce.insertOrder(orderVO);
//        orderSerivce.insertOrderDetail(orderDetailVO,userId);
//
//
//        System.out.println(orderVO);



    }

    @GetMapping("/kakaoPaySuccess{id}")
    public KaKaoPayApprovalVO kakaoPaySuccess(HttpSession session,@PathVariable(name="id") String pg_token){
        String userId=(String)session.getAttribute("user_email");
        System.out.println(session.getAttribute("orderVO"));
        orderSerivce.insertOrder((OrderVO)session.getAttribute("orderVO"));
        orderSerivce.insertOrderDetail((OrderDetailVO) session.getAttribute("orderDetailVO"),userId);

        try{
            session.removeAttribute("orderVO");
            session.removeAttribute("orderDetailVO");
        }
        catch(Exception e){
            System.out.println("order 정보가 session에 존재하지 않습니다");
        }

        log.info(pg_token);
        log.info("kakaoPay Success get.......");
        log.info("kakaoPaySuccess pg_token:   "+pg_token);


        return kakaopayService.kakaoPayInfo(pg_token,userId);
    }

}