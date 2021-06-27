package com.shopping.cosmos.cart.controller;

import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.cart.service.CartService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@AllArgsConstructor
@RequestMapping("/cart")
public class CartController {
    CartService cartService;

    // 1. 장바구니 추가
    @PostMapping("/insert")
    public void insert(HttpSession session,@RequestBody CartVO vo){
        //@RequestBody는 submit된 form의 내용을 저장해서 전달받거나 다시 뷰로 넘겨서 출력하기 위한 오브젝트
        String userId = (String) session.getAttribute("user_email");
        if(userId==null){
            //로그인 하지 않은 상태 이면 로그인 화면으로 이동
//            return "redirect:/member/login";
            System.out.println("로그인 되지 않았습니다.");
        }
        vo.setUserId(userId);
        int count = cartService.countCart(vo);
        if(count==0){
            cartService.insert(vo);
        }
        else {
            cartService.updateCart(vo);
        }
    }
    @GetMapping("/list")
    public List<CartVO> cartList(HttpSession session){
        String userId=(String) session.getAttribute("user_email");

        System.out.println("cartList_email: "+userId);
        return cartService.listCart(userId);
    }
    @GetMapping("/summoney")
    public int cartSumMoney(HttpSession session){
        String userId = (String)session.getAttribute("user_email");
        int sumMoney = cartService.sumMoney(userId);
        return sumMoney;
    }
    @DeleteMapping("/{id}")
    public void deleteCart(@PathVariable(name="id") Integer cartId){
        cartService.deleteCart(cartId);
    }

    @PutMapping("/modify")
    public void modifyCart(@RequestBody CartVO vo){
        cartService.modifyCart(vo);
    }


}
