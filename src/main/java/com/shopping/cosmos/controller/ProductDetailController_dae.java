package com.shopping.cosmos.controller;


import com.shopping.cosmos.cart.domain.CartVO;
import com.shopping.cosmos.cart.service.CartService;
import com.shopping.cosmos.service.ProductDetailService_dae;
import com.shopping.cosmos.vo.CartVO_hun;
import com.shopping.cosmos.vo.ProductDetailVO_dae;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/products")
public class ProductDetailController_dae {

    @Autowired
    CartService cartService ;

    @Autowired
    ProductDetailService_dae productService;

    //상품 정보 모두 출력
    @GetMapping("/{id}")
    public List<ProductDetailVO_dae> productDetail(@PathVariable int id){
        System.out.println(productService.productDetail(id));
        System.out.println(id + "상품 출력 성공");
        return productService.productDetail(id);
    }

    //장바구니 저장
    @PostMapping
    public void insertCart(@RequestBody CartVO vo){
        int count = cartService.countCart(vo);
        if(count==0){
            productService.insertCart(vo);
        }
        else{
            cartService.updateCart(vo);
        }
        System.out.println("카트 DB 저장 성공");
    }


}
