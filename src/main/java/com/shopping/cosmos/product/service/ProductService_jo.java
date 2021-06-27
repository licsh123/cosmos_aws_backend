package com.shopping.cosmos.product.service;

import com.shopping.cosmos.product.vo.ProductVO_jo;

import java.util.List;

public interface ProductService_jo {
    //상품등록
    void insertProduct(ProductVO_jo vo);
    void insertProductOption(ProductVO_jo vo);
    void insertProductId(ProductVO_jo vo);
    void insertProductIdOption(ProductVO_jo vo);
    //상품수정 페이지에서 사용자가 추가시킨 옵션을 업데이트
    void insertProductUpdate(ProductVO_jo vo);

    void insertProductOptionUpdate(ProductVO_jo vo);
    //productId가 같은 것을 가져옴
    List<ProductVO_jo> productIdList(ProductVO_jo vo);

    //product 리스트를 가져옴
    List<ProductVO_jo> getProductList(ProductVO_jo vo);

    //product의 product_id가 같은걸 가져옴
    List<ProductVO_jo> getProductDetail(ProductVO_jo vo);

    //상품제목이 같은걸 가져옴
    List<ProductVO_jo> seachList(ProductVO_jo vo);

    //들어온 객체를 맞는 seq를 업테이트
    void updateProduct(ProductVO_jo product);

    void updateProductOption(ProductVO_jo product);

    //들어온 id를 삭제
    void deleteProduct(ProductVO_jo product);

    void deleteProductOption(ProductVO_jo product);

    //들어온 seq가 같은것을 삭제
    void deleteProductSeq(ProductVO_jo product);

    void deleteProductOptionSeq(ProductVO_jo product);

    //총 상품개수 (페이징처리)
    int productCount();

    //들어온 seq가 같은것을 비교
    int equalsProduct(ProductVO_jo product);
}
