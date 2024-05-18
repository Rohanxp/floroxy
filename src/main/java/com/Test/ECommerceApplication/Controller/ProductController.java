package com.Test.ECommerceApplication.Controller;

import com.Test.ECommerceApplication.Entity.ProductEntity;
import com.Test.ECommerceApplication.Entity.VendorEntity;
import com.Test.ECommerceApplication.Service.IProduct;
import com.Test.ECommerceApplication.Service.IVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private IProduct iProduct;


    @RequestMapping(value ="/insertProduct" , method = RequestMethod.POST)
    public String insert_product(@RequestBody String payloadString){
        System.out.println(payloadString);
        return  iProduct.insert_data_product(payloadString);
    }

    @RequestMapping(value ="/getProduct" , method = RequestMethod.GET)
    public List<ProductEntity> getAllProducts(){
        return iProduct.getAllProducts();
    }

    @RequestMapping(value ="/deleteProduct/{id}" , method = RequestMethod.DELETE)
    public String delete_product(@PathVariable long id){
        return iProduct.deleteProduct(id);
    }


    @RequestMapping(value ="/updateProduct" , method = RequestMethod.PUT)
    public String update_product(@RequestBody String payload){
        System.out.println(payload);
        return  iProduct.updateProductDetails(payload);
    }
}
