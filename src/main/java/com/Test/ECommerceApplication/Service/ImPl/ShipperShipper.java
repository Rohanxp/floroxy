package com.Test.ECommerceApplication.Service.ImPl;

import com.Test.ECommerceApplication.Entity.ShipperEntity;
import com.Test.ECommerceApplication.Entity.VendorEntity;
import com.Test.ECommerceApplication.Repository.ShipperRepository;
import com.Test.ECommerceApplication.Service.IShipper;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShipperShipper implements IShipper {

    private ShipperRepository shipperRepository;
    @Override
    public String insert_data_shipper(String payloadString) {
        System.out.println(payloadString);
        JSONObject jsonObject = new JSONObject(payloadString);
        ShipperEntity shipper = new ShipperEntity();
        shipper.setShipperName(jsonObject.get("name").toString());
        shipper.setShipperEmail(jsonObject.get("email").toString());
        shipper.setShipperPassword(jsonObject.get("password").toString());
        shipper.setShipperCountry(jsonObject.get("country").toString());
        shipper.setShipperAddress(jsonObject.get("address").toString());
        shipper.setShipperAddressPincode(jsonObject.get("shipper_pincode").toString());
        shipper.setShipperPhoneno(jsonObject.get("phoneno").toString());
        shipper.setShipperShopAddress(jsonObject.get("shop_address").toString());
        shipper.setShipperShopAddressPincode(jsonObject.get("shop_pincode").toString());
        shipper.setShopGSTNo(jsonObject.get("gst_no").toString());
        shipper.setShipperAddharNo(jsonObject.get("addhar_no").toString());
       // shipper.setAvailabelProducts(ArrayList<String>(jsonObject.get("availabel_products").toString()));
        shipper.setSuppplyPercentage(Float.parseFloat(jsonObject.get("suppply_percentage").toString()));
        shipperRepository.save(shipper);
        return "inserted details";
    }

    @Override
    public List<ShipperEntity> getAllShippers() {
        List<ShipperEntity> shipperEntities =shipperRepository.findAll();
        return shipperEntities;
    }

    @Override
    public String deleteShipper(long id) {
         shipperRepository.deleteById(id);
         return "deleted";
    }

    @Override
    public String updateShipperDetails(String payload) {
        System.out.println(payload);
        JSONObject jsonObject = new JSONObject(payload);
        ShipperEntity shipper = new ShipperEntity();
        shipper.setShipperName(jsonObject.get("name").toString());
        shipper.setShipperEmail(jsonObject.get("email").toString());
        shipper.setShipperPassword(jsonObject.get("password").toString());
        shipper.setShipperCountry(jsonObject.get("country").toString());
        shipper.setShipperAddress(jsonObject.get("address").toString());
        shipper.setShipperAddressPincode(jsonObject.get("shipper_pincode").toString());
        shipper.setShipperPhoneno(jsonObject.get("phoneno").toString());
        shipper.setShipperShopAddress(jsonObject.get("shop_address").toString());
        shipper.setShipperShopAddressPincode(jsonObject.get("shop_pincode").toString());
        shipper.setShopGSTNo(jsonObject.get("gst_no").toString());
        shipper.setShipperAddharNo(jsonObject.get("addhar_no").toString());
        // shipper.setAvailabelProducts(ArrayList<String>(jsonObject.get("availabel_products").toString()));
        shipper.setSuppplyPercentage(Float.parseFloat(jsonObject.get("suppply_percentage").toString()));
        shipperRepository.save(shipper);
        return "updated details";
    }
}
