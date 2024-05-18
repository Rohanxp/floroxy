package com.Test.ECommerceApplication.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="shipperDB")
public class ShipperEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",columnDefinition = "bigseries")
    private long id;

    @Column(length =2000)
    private String shipperName;

    @Column(length=2000)
    private String shipperEmail;

    @Column(length=2000)
    private String shipperPassword;

    @Column(length = 2000)
    private String shipperCountry;
    @Column(length=2000)
    private String shipperAddress;

    @Column(length=2000)
    private String shipperAddressPincode;

    @Column(length=2000)
    private String shipperPhoneno;

    @Column(length=2000)
    private String shipperShopAddress;

    @Column(length=2000)
    private String shipperShopAddressPincode;

    @Column(length=2000)
    private String ShopGSTNo;

     @Column(length=2000)
    private String shipperAddharNo;

//     @Column(length=2000)
//    private ArrayList<String> availabelProducts;

     @Column(length=2000)
    private float suppplyPercentage;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShipperName() {
        return shipperName;
    }

    public void setShipperName(String shipperName) {
        this.shipperName = shipperName;
    }

    public String getShipperEmail() {
        return shipperEmail;
    }

    public void setShipperEmail(String shipperEmail) {
        this.shipperEmail = shipperEmail;
    }

    public String getShipperPassword() {
        return shipperPassword;
    }

    public void setShipperPassword(String shipperPassword) {
        this.shipperPassword = shipperPassword;
    }

    public String getShipperAddress() {
        return shipperAddress;
    }

    public void setShipperAddress(String shipperAddress) {
        this.shipperAddress = shipperAddress;
    }

    public String getShipperPhoneno() {
        return shipperPhoneno;
    }

    public void setShipperPhoneno(String shipperPhoneno) {
        this.shipperPhoneno = shipperPhoneno;
    }

    public String getShipperShopAddress() {
        return shipperShopAddress;
    }

    public void setShipperShopAddress(String shipperShopAddress) {
        this.shipperShopAddress = shipperShopAddress;
    }

    public String getShopGSTNo() {
        return ShopGSTNo;
    }

    public void setShopGSTNo(String shopGSTNo) {
        ShopGSTNo = shopGSTNo;
    }

    public String getShipperAddharNo() {
        return shipperAddharNo;
    }

    public void setShipperAddharNo(String shipperAddharNo) {
        this.shipperAddharNo = shipperAddharNo;
    }

//    public ArrayList<String> getAvailabelProducts() {
//        return availabelProducts;
//    }
//
//    public void setAvailabelProducts(ArrayList<String> availabelProducts) {
//        this.availabelProducts = availabelProducts;
//    }



    public String getShipperCountry() {
        return shipperCountry;
    }

    public void setShipperCountry(String shipperCountry) {
        this.shipperCountry = shipperCountry;
    }

    public String getShipperAddressPincode() {
        return shipperAddressPincode;
    }

    public void setShipperAddressPincode(String shipperAddressPincode) {
        this.shipperAddressPincode = shipperAddressPincode;
    }

    public String getShipperShopAddressPincode() {
        return shipperShopAddressPincode;
    }

    public void setShipperShopAddressPincode(String shipperShopAddressPincode) {
        this.shipperShopAddressPincode = shipperShopAddressPincode;
    }

    public float getSuppplyPercentage() {
        return suppplyPercentage;
    }

    public void setSuppplyPercentage(float suppplyPercentage) {
        this.suppplyPercentage = suppplyPercentage;
    }
}
