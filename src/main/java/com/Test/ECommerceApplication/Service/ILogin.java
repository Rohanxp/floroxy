package com.Test.ECommerceApplication.Service;

import com.Test.ECommerceApplication.Entity.LoginEntity;

import java.util.List;

public interface ILogin {
    public String insert_data_login(String payloadString);
    public List<LoginEntity> getAllLoginUsers();
    public  String deleteUser(long id);
    public String updateUserDetails(String payload);
//    public String insertUserData(String payloadString);
//    public List<LoginEntity> getAllUsers();

}
