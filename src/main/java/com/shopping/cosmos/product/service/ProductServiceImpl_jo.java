package com.shopping.cosmos.product.service;

import com.shopping.cosmos.product.mapper.ProductMapper_jo;
import com.shopping.cosmos.product.vo.ProductVO_jo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl_jo implements ProductService_jo {

    @Autowired
    private ProductMapper_jo mapper;

    @Override
    public void insertProduct(ProductVO_jo vo) {
        mapper.insertProduct(vo);
    }
    @Override
    public void insertProductOption(ProductVO_jo vo) {
        mapper.insertProductOption(vo);
    }

    @Override
    public void insertProductUpdate(ProductVO_jo vo) {
        mapper.insertProductUpdate(vo);
    }

    @Override
    public void insertProductOptionUpdate(ProductVO_jo vo) {
        mapper.insertProductOptionUpdate(vo);
    }

    @Override
    public List<ProductVO_jo> productIdList(ProductVO_jo vo) {
        return mapper.productIdList(vo);
    }

    @Override
    public void insertProductId(ProductVO_jo vo) {
        mapper.insertProductId(vo);
    }

    @Override
    public void insertProductIdOption(ProductVO_jo vo) {
        mapper.insertProductIdOption(vo);
    }


    @Override
    public List<ProductVO_jo> getProductList(ProductVO_jo vo) {
        return mapper.getProductList(vo);
    }

    @Override
    public List<ProductVO_jo> getProductDetail(ProductVO_jo vo) {
        return mapper.getProductDetail(vo);
    }

    @Override
    public List<ProductVO_jo> seachList(ProductVO_jo vo) {
        return mapper.seachList(vo);
    }

    @Override
    public void updateProduct(ProductVO_jo product) {
        mapper.updateProduct(product);
    }

    @Override
    public void updateProductOption(ProductVO_jo product) {
        mapper.updateProductOption(product);
    }

    @Override
    public void deleteProduct(ProductVO_jo product) {
        mapper.deleteProduct(product);
    }

    @Override
    public void deleteProductOption(ProductVO_jo product) {
        mapper.deleteProductOption(product);
    }

    @Override
    public void deleteProductSeq(ProductVO_jo product) {
        mapper.deleteProductSeq(product);
    }

    @Override
    public void deleteProductOptionSeq(ProductVO_jo product) {
        mapper.deleteProductOptionSeq(product);
    }

    @Override
    public int productCount() {
        return mapper.productCount();
    }

    @Override
    public int equalsProduct(ProductVO_jo product) {
        return mapper.equalsProduct(product);
    }

}
