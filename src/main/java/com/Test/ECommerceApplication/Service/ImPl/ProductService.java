package com.Test.ECommerceApplication.Service.ImPl;


import com.Test.ECommerceApplication.Entity.ProductEntity;
import com.Test.ECommerceApplication.Repository.ProductRepository;
import com.Test.ECommerceApplication.Service.IProduct;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProduct {

    @Autowired
    private ProductRepository productrepo;
    @Override
    public String insert_data_product(String payloadString) {
        JSONObject jsonObject = new JSONObject(payloadString);
        ProductEntity productEntity = new ProductEntity();
//        productEntity.setId(Long.parseLong(jsonObject.get("productId").toString()));
        productEntity.setProductCatagory(jsonObject.get("catagory").toString());
        productEntity.setProductSubCatagory(jsonObject.get("subcatagory").toString());
        productEntity.setProductName(jsonObject.get("name").toString());
        productEntity.setProductBrand(jsonObject.get("brand").toString());
        productEntity.setProductDetails(jsonObject.get("details").toString());
        productEntity.setProductQuantity(Integer.parseInt(jsonObject.get("quantity").toString()));
        productEntity.setProductPrice(Float.parseFloat(jsonObject.get("price").toString()));
        productEntity.setProductDiscount(Integer.parseInt(jsonObject.get("discount").toString()));
        productrepo.save(productEntity);
        return "Inserted product table";
    }

    @Override
    public String deleteProduct(long id) {
        productrepo.deleteById(id);
        return "successfully deleted..";
    }

    @Override
    public String updateProductDetails(String payload) {
        JSONObject jsonObject = new JSONObject(payload);
        ProductEntity productEntity = new ProductEntity();
        productEntity.setId(Long.parseLong(jsonObject.get("productId").toString()));
        productEntity.setProductCatagory(jsonObject.get("catagory").toString());
//        productEntity.setProductCatagory(jsonObject.get("subcatagory").toString());
        productEntity.setProductSubCatagory(jsonObject.get("subcatagory").toString());
        productEntity.setProductName(jsonObject.get("name").toString());
        productEntity.setProductBrand(jsonObject.get("brand").toString());
        productEntity.setProductDetails(jsonObject.get("details").toString());
        productEntity.setProductQuantity(Integer.parseInt(jsonObject.get("quantity").toString()));
        productEntity.setProductPrice(Float.parseFloat(jsonObject.get("price").toString()));
        productEntity.setProductDiscount(Integer.parseInt(jsonObject.get("discount").toString()));
        productrepo.save(productEntity);
        return "update";
    }

    @Override
    public List<ProductEntity> getAllProducts() {
        List<ProductEntity> productData = productrepo.findAll();
        return productData;
    }
}
