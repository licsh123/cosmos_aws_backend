package com.shopping.cosmos.product.controller;

import com.shopping.cosmos.product.service.ProductService_jo;
import com.shopping.cosmos.product.vo.ProductVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class ProductDeleteController_jo {

    @Autowired
    private ProductService_jo service;

    @DeleteMapping("/manager/productDelect/{seq}")
    void deleteProduct(@PathVariable int seq, ProductVO_jo product) {
        System.out.println("deleteProduct 접근");
        product.setProduct_id(seq);
        System.out.println(product);
        service.deleteProductOption(product);
        service.deleteProduct(product);
        System.out.println("삭제 성공");
    }
}