package com.Test.ECommerceApplication.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="productDB")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id",columnDefinition = "bigseries")
    private long id;

    @Column(length=2000)
    private String productCatagory;

    private String productSubCatagory;
    @Column(length=2000)
    private String productName;

    @Column(length=2000)
    private String productBrand;


    @Column(length=2000)
    private String productDetails;

    @Column(length=2000)
    private int productQuantity;

    @Column(length=2000)
    private float productPrice;

    @Column(length=2000)
    private int productDiscount;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductCatagory() {
        return productCatagory;
    }

    public void setProductCatagory(String productCatagory) {
        this.productCatagory = productCatagory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(String productDetails) {
        this.productDetails = productDetails;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public float getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(float productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductDiscount() {
        return productDiscount;
    }

    public void setProductDiscount(int productDiscount) {
        this.productDiscount = productDiscount;
    }

    public String getProductSubCatagory() {
        return productSubCatagory;
    }

    public void setProductSubCatagory(String productSubCatagory) {
        this.productSubCatagory = productSubCatagory;
    }
}
