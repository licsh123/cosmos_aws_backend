package com.shopping.cosmos.product.controller;

import com.shopping.cosmos.product.service.ProductService_jo;
import com.shopping.cosmos.product.vo.ProductVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600, allowCredentials = "true")
@RestController
@RequestMapping("/cos")
public class ProductUpdateController_jo {
    @Autowired
    private ProductService_jo service;

    //프론트에서 post방식으로 '
    @PutMapping("/manager/productUpdate")
    void updateProduct(@RequestBody List<ProductVO_jo> product) {
        System.out.println("updateProduct 접근");
        ProductVO_jo vo = product.get(0);

        //현제 들어온 id가 같은것을 모두 가져옴
        List<ProductVO_jo> productIdList = service.productIdList(vo);

        for (ProductVO_jo list : productIdList) {
            System.out.println("productIdList" + list);
        }

        for (ProductVO_jo list : product) {
            System.out.println("들어온 product는" + list);
        }
        try{
            for (int i = 0; i < productIdList.size(); i++) {
                for (int j = 0; j < product.size(); j++) {
                    if (productIdList.get(i).getProduct_seq() == product.get(j).getProduct_seq()) {
                        System.out.println("같은 PRODUCT는" + productIdList.get(i).getProduct_seq());
                        //id가 모두 같은 것의 seq와 들어온 seq를 비교 해서 같은것을 삭제
                        productIdList.remove(productIdList.get(i));
                    }
                }
            }
        }catch (Exception e){

        }
        //상품업데이트
        for (ProductVO_jo list : product) {
            //가져온 객체중에 seq가 있는것은 update시키고 없는것은 insert시켜라
            if (service.equalsProduct(list) > 0) {
                System.out.println("업데이트될 product는" + list);
                service.updateProduct(list);
                service.updateProductOption(list);
                System.out.println("업데이트 성공");
            } else {
                System.out.println("insert될 product는" + list);
                service.insertProductUpdate(list);
                service.insertProductOptionUpdate(list);
                System.out.println("인서트 성공");
            }
        }
        //상품삭제
        for (ProductVO_jo productvo : productIdList) {
            System.out.println("삭제될 product는" + productvo);
            service.deleteProductOptionSeq(productvo);
            service.deleteProductSeq(productvo);
            System.out.println("삭제성공");
        }
        System.out.println("update 성공");
        /*    if (productIdList.size() > product.size()) {
                for (int i = 0; i < productIdList.size(); i++) {
                    for (int j = 0; j < product.size(); j++) {
                        if (productIdList.get(i).getProduct_seq() == product.get(j).getProduct_seq()) {
                            System.out.println("같은 PRODUCT는"+productIdList.get(i).getProduct_seq());
                            //id가 모두 같은 것의 seq와 들어온 seq를 비교 해서 같은것을 삭제
                            productIdList.remove(productIdList.get(i));
                        }
                    }
                }

                //상품삭제
                for (ProductVO_jo productvo : productIdList) {
                    System.out.println("들어온 product2는" + productvo);
                    service.deleteProductOptionSeq(productvo);
                    service.deleteProductSeq(productvo);
                    System.out.println("삭제성공");
                }
            } else {
                for (ProductVO_jo list : product) {
                    System.out.println(service.equalsProduct(list));
                    //가져온 객체중에 seq가 있는것은 update시키고 없는것은 insert시켜라
                    if (service.equalsProduct(list) > 0) {
                        service.updateProduct(list);
                        service.updateProductOption(list);
                        System.out.println("업데이트 성공");
                    } else {
                        service.insertProductUpdate(list);
                        service.insertProductOptionUpdate(list);
                        System.out.println("인서트 성공");
                    }
                }
            }*/

    }
}