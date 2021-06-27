package com.shopping.cosmos.product.controller;

import com.shopping.cosmos.product.service.ProductService_jo;
import com.shopping.cosmos.product.vo.ProductSearchVO_jo;
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
public class ProductListController_jo {

    @Autowired
    private ProductService_jo service;

    // 프론트에서 get방식으로
    @GetMapping("/manager/productList/{pageNum}")
    //전달받은 pageNum를 vo에 넣음
    List<ProductVO_jo> getProductList(ProductVO_jo vo) {
        System.out.println("getProductList 접근");
        // 상품 몇번쨰부터 보여줄건지 계산
        int startRow = (vo.getPageNum() - 1) * 10;
        if (startRow < 0) {
            startRow = 0;
        }
        //10개씩 보여줌
        int endRow = 10;
        vo.setStartRow(startRow);
        vo.setEndRow(endRow);
        System.out.println(startRow);
        System.out.println(endRow);

        return service.getProductList(vo);
    }

    @GetMapping("/manager/productCount")
    int getProductCount(ProductVO_jo vo) {
        //전체상품개수
        int productCount = service.productCount();
        //상품페이지를 보여주기위해 10으로 나눈값을 하나더함 상품개수가 33개라면 3페이지가 아닌 4페이지를 보여주기위해
        System.out.println("productCount1 =" + productCount);
        if (productCount > 10 && productCount % 10 != 0) {
            productCount = productCount / 10 + 1;
            System.out.println("productCount1 =" + productCount);
        } else {
            productCount = productCount / 10;
        }
        if (productCount == 0) {
            productCount = 1;
        }
        System.out.println("productCount2 =" + productCount);
        return productCount;
    }

    @GetMapping("/manager/seach/{product_title}")
    List<ProductVO_jo> seachList(ProductSearchVO_jo product) {
        System.out.println("seachList 접근");
        System.out.println(product);
        List<ProductVO_jo> search2 = service.seachList(product);
        System.out.println(search2);
        return service.seachList(product);
    }

}