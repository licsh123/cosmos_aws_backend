package com.shopping.cosmos.product.mapper;

import com.shopping.cosmos.product.vo.ProductVO_jo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper_jo {

    void insertProduct(ProductVO_jo vo);

    void insertProductOption(ProductVO_jo vo);

    void insertProductUpdate(ProductVO_jo vo);

    void insertProductOptionUpdate(ProductVO_jo vo);

    void insertProductId(ProductVO_jo vo);

    void insertProductIdOption(ProductVO_jo vo);

    List<ProductVO_jo> productIdList(ProductVO_jo vo);

    List<ProductVO_jo> getProductList(ProductVO_jo vo);

    List<ProductVO_jo> getProductDetail(ProductVO_jo vo);

    List<ProductVO_jo> seachList(ProductVO_jo vo);

    void updateProduct(ProductVO_jo product);

    void updateProductOption(ProductVO_jo product);

    void deleteProduct(ProductVO_jo product);

    void deleteProductOption(ProductVO_jo product);

    void deleteProductSeq(ProductVO_jo product);

    void deleteProductOptionSeq(ProductVO_jo product);

    int productCount();

    int equalsProduct(ProductVO_jo product);
}
