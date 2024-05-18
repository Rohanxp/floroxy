package com.Test.ECommerceApplication.Controller;
import com.Test.ECommerceApplication.Entity.VendorEntity;
import com.Test.ECommerceApplication.Service.IVendor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class VendorController {

    @Autowired
    private IVendor ivendor;


    @RequestMapping(value ="/insertVendor" , method = RequestMethod.POST)
    public String insert_vendor(@RequestBody String payloadString){
        return  ivendor.insert_data_vendor(payloadString);
    }

    @RequestMapping(value ="/getVendor" , method = RequestMethod.GET)
    public List<VendorEntity> getAllVendors(){
        return ivendor.getAllVendors();
    }

    @RequestMapping(value ="/deleteVendor/{id}" , method = RequestMethod.DELETE)
    public String delete_vendor(@PathVariable long id){
        return ivendor.deleteVendor(id);
    }


    @RequestMapping(value ="/updateVendor" , method = RequestMethod.PUT)
    public String update_vendor(@RequestBody String payload){
        return  ivendor.updateVendorDetails(payload);
    }

}

