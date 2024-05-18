package com.Test.ECommerceApplication.Controller;

import com.Test.ECommerceApplication.Entity.ShipperEntity;
import com.Test.ECommerceApplication.Entity.VendorEntity;
import com.Test.ECommerceApplication.Service.IShipper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShipperController {
    @Autowired
    private IShipper iShipper;


    @RequestMapping(value ="/insertShipper" , method = RequestMethod.POST)
    public String insert_shipper(@RequestBody String payloadString){
        return  iShipper.insert_data_shipper(payloadString);
    }

    @RequestMapping(value ="/getShipper" , method = RequestMethod.GET)
    public List<ShipperEntity> getAllShipper(){
        return iShipper.getAllShippers();
    }

    @RequestMapping(value ="/deleteShipper/{id}" , method = RequestMethod.DELETE)
    public String delete_shipper(@PathVariable long id){
        return iShipper.deleteShipper(id);
    }


    @RequestMapping(value ="/updateShipper" , method = RequestMethod.PUT)
    public String update_shipper(@RequestBody String payload){
        return  iShipper.updateShipperDetails(payload);

    }
}
