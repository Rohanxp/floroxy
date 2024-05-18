package com.Test.ECommerceApplication.Service.ImPl;

import com.Test.ECommerceApplication.Entity.LoginEntity;
import com.Test.ECommerceApplication.Repository.UserLogInRepository;
import com.Test.ECommerceApplication.Service.ILogin;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class LogInService implements ILogin {

    @Autowired
    private UserLogInRepository loginrepo;

    @Override
    public String insert_data_login(String payloadString) {
        JSONObject jsonObject = new JSONObject(payloadString);
        LoginEntity loginEntity = new LoginEntity();
        //loginEntity.setId(Long.parseLong(jsonObject.get("userId").toString()));
        loginEntity.setUserName(jsonObject.get("userName").toString());
        loginEntity.setUserEmail(jsonObject.get("userEmail").toString());
        loginEntity.setUserPassword(jsonObject.get("userPassword").toString());
        loginEntity.setUserPhoneNo(jsonObject.get("userPhone").toString());
        loginEntity.setUserGender1(jsonObject.get("userGender").toString());
        loginEntity.setUserCountry(jsonObject.get("userCountry").toString());
        loginEntity.setUserAddress(jsonObject.get("userAddress").toString());
        loginEntity.setUserPincode(jsonObject.get("userPincode").toString());
        loginrepo.save(loginEntity);
        return "Inserted login table";
    }

   @Override
    public List<LoginEntity> getAllLoginUsers() {
        List<LoginEntity> loginUsers = loginrepo.findAll();
        return loginUsers;
    }

    @Override
    public String deleteUser(long id) {
        loginrepo.deleteById(id);
        return "successfully deleted..";
    }

    @Override
    public String updateUserDetails(String payloadString) {
        JSONObject jsonObject = new JSONObject(payloadString);
        LoginEntity signup = new LoginEntity();
        signup.setId(Long.parseLong(jsonObject.get("userId").toString()));
        signup.setUserName(jsonObject.get("userName").toString());
        signup.setUserEmail(jsonObject.get("userEmail").toString());
        signup.setUserPassword(jsonObject.get("userPassword").toString());
        signup.setUserPhoneNo(jsonObject.get("userPhone").toString());
        signup.setUserGender1(jsonObject.get("userGender").toString());
        signup.setUserCountry(jsonObject.get("userCountry").toString());
        signup.setUserAddress(jsonObject.get("userAddress").toString());
        signup.setUserPincode(jsonObject.get("userPincode").toString());

        loginrepo.save(signup);
        return " Update";
    }

}
