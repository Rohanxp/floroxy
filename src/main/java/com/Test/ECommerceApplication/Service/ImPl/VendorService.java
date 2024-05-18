package com.Test.ECommerceApplication.Service.ImPl;

import com.Test.ECommerceApplication.Entity.VendorEntity;
import com.Test.ECommerceApplication.Repository.VendorRepo;
import com.Test.ECommerceApplication.Service.IVendor;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VendorService implements IVendor {
    @Autowired
    private VendorRepo vendorRepo;
    @Override
    public String insert_data_vendor(String payloadString) {
        System.out.println(payloadString);
        JSONObject jsonObject = new JSONObject(payloadString);
        VendorEntity vendor = new VendorEntity();
        vendor.setVendorName(jsonObject.get("name").toString());
        vendor.setVendorEmail(jsonObject.get("email").toString());
        vendor.setVendorPassword(jsonObject.get("password").toString());
        vendor.setVendorPhoneNo(jsonObject.get("phoneno").toString());
        vendor.setVendorCountry(jsonObject.get("country").toString());
        vendor.setVendorAddress(jsonObject.get("address").toString());
        vendor.setVendorPincode(jsonObject.get("pincode").toString());
        vendor.setVendorTotalSupply(Integer.parseInt(jsonObject.get("totalsupply").toString()));
        vendor.setVendorSupplyPercentage(Float.parseFloat(jsonObject.get("supplypercentage").toString()));
        vendorRepo.save(vendor);
        return "Inserted";
    }

    @Override
    public List<VendorEntity> getAllVendors() {
        List<VendorEntity> vendor = vendorRepo.findAll();
        return vendor;
    }

    @Override
    public String deleteVendor(long id) {
       vendorRepo.deleteById(id);
       return "Deleted";
    }

    @Override
    public String updateVendorDetails(String payload) {
        System.out.println(payload);
        JSONObject jsonObject = new JSONObject(payload);
        VendorEntity vendor = new VendorEntity();
        vendor.setVendorId(Integer.parseInt(jsonObject.get("id").toString()));
        vendor.setVendorName(jsonObject.get("name").toString());
        vendor.setVendorEmail(jsonObject.get("email").toString());
        vendor.setVendorPassword(jsonObject.get("password").toString());
        vendor.setVendorPhoneNo(jsonObject.get("phoneno").toString());
        vendor.setVendorCountry(jsonObject.get("country").toString());
        vendor.setVendorAddress(jsonObject.get("address").toString());
        vendor.setVendorPincode(jsonObject.get("pincode").toString());
        vendor.setVendorTotalSupply(Integer.parseInt(jsonObject.get("totalsupply").toString()));
        vendor.setVendorSupplyPercentage(Float.parseFloat(jsonObject.get("supplypercentage").toString()));
        vendorRepo.save(vendor);
        return "Updated";
    }
}
