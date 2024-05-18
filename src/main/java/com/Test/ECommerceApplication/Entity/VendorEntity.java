package com.Test.ECommerceApplication.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="vendorDB")
public class VendorEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",columnDefinition = "bigseries")
    private long vendorId;

    @Column(length=2000)
    private String vendorName;
    @Column(length=2000)
    private String vendorEmail;
    @Column(length=2000)
    private String vendorPassword;
    @Column(length=2000)
    private String vendorPhoneNo;
    @Column(length=2000)
    private String vendorCountry;
    @Column(length=2000)
    private String vendorAddress;
    @Column(length=2000)
    private String vendorPincode;
    @Column(length=2000)
    private int  vendorTotalSupply;
    @Column(length=2000)
    private float vendorSupplyPercentage;


    public long getVendorId() {
        return vendorId;
    }

    public void setVendorId(long vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorEmail() {
        return vendorEmail;
    }

    public void setVendorEmail(String vendorEmail) {
        this.vendorEmail = vendorEmail;
    }

    public String getVendorPassword() {
        return vendorPassword;
    }

    public void setVendorPassword(String vendorPassword) {
        this.vendorPassword = vendorPassword;
    }

    public String getVendorPhoneNo() {
        return vendorPhoneNo;
    }

    public void setVendorPhoneNo(String vendorPhoneNo) {
        this.vendorPhoneNo = vendorPhoneNo;
    }

    public String getVendorCountry() {
        return vendorCountry;
    }

    public void setVendorCountry(String vendorCountry) {
        this.vendorCountry = vendorCountry;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPincode() {
        return vendorPincode;
    }

    public void setVendorPincode(String vendorPincode) {
        this.vendorPincode = vendorPincode;
    }

    public int getVendorTotalSupply() {
        return vendorTotalSupply;
    }

    public void setVendorTotalSupply(int vendorTotalSupply) {
        this.vendorTotalSupply = vendorTotalSupply;
    }

    public float getVendorSupplyPercentage() {
        return vendorSupplyPercentage;
    }

    public void setVendorSupplyPercentage(float vendorSupplyPercentage) {
        this.vendorSupplyPercentage = vendorSupplyPercentage;
    }
}
