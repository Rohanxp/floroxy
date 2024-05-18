package com.Test.ECommerceApplication.Service;

import com.Test.ECommerceApplication.Entity.ProductEntity;

import java.util.List;

public interface IProduct {

    public String insert_data_product(String payloadString);
    public  String deleteProduct(long id);
    public String updateProductDetails(String payload);
    public List<ProductEntity> getAllProducts();
}
