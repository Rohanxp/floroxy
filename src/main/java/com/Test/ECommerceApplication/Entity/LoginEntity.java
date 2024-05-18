package com.Test.ECommerceApplication.Entity;

import javax.persistence.*;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name="users")
public class LoginEntity {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id",columnDefinition = "bigseries")
    private long id;

    @Column(length=2000)
    private String userName;
    @Column(length=2000)
    private String userEmail;
    @Column(length=2000)
    private String userPassword;
    @Column(length=2000)
    private String userPhoneNo;
    @Column(length=2000)
    private String userGender1;
    @Column(length=2000)
    private String userCountry;
    @Column(length=2000)
    private String userAddress;
    @Column(length=2000)
    private String userPincode;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhoneNo() {
        return userPhoneNo;
    }

    public void setUserPhoneNo(String userPhoneNo) {
        this.userPhoneNo = userPhoneNo;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserPincode() {
        return userPincode;
    }

    public void setUserPincode(String userPincode) {
        this.userPincode = userPincode;
    }


    public String getUserGender1() {
        return userGender1;
    }

    public void setUserGender1(String userGender1) {
        this.userGender1 = userGender1;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public void setUserCountry(String userCountry) {
        this.userCountry = userCountry;
    }
}
