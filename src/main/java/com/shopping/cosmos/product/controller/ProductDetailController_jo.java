package com.shopping.cosmos.product.controller;

import com.shopping.cosmos.product.service.ProductService_jo;
import com.shopping.cosmos.product.vo.ProductVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class ProductDetailController_jo {

    @Autowired
    private ProductService_jo service;

    @GetMapping("/manager/productDetail/{seq}")
    List<ProductVO_jo> getProductDetail(@PathVariable int seq, ProductVO_jo vo) {
        System.out.println("returnProductDetail 접근");
        vo.setProduct_id(seq);
        System.out.println(vo);
        return service.getProductDetail(vo);
    }
}
