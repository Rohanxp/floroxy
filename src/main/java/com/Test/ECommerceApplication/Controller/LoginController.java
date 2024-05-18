package com.Test.ECommerceApplication.Controller;

import com.Test.ECommerceApplication.Entity.LoginEntity;
import com.Test.ECommerceApplication.Service.ILogin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LoginController {

    @Autowired
    private ILogin iLogin;

    @RequestMapping(value ="/insertLogin" , method = RequestMethod.POST)
    public String insert_login(@RequestBody String payloadString){
         return  iLogin.insert_data_login(payloadString);
    }

    @RequestMapping(value ="/getLogin" , method = RequestMethod.GET)
    public List<LoginEntity> getAllLogin(){
        return iLogin.getAllLoginUsers();
    }

    @RequestMapping(value ="/deleteLogin/{id}" , method = RequestMethod.DELETE)
    public String delete_login(@PathVariable long id){
        return iLogin.deleteUser(id);
    }


    @RequestMapping(value ="/updateLogin" , method = RequestMethod.PUT)
    public String update_login(@RequestBody String payload){
        return  iLogin.updateUserDetails(payload);
    }

}
