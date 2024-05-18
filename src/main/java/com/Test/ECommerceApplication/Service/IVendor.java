package com.Test.ECommerceApplication.Service;
import com.Test.ECommerceApplication.Entity.VendorEntity;

import java.util.List;
public interface IVendor {
    public String insert_data_vendor(String payloadString);
    public List<VendorEntity> getAllVendors();
    public  String deleteVendor(long id);
    public String updateVendorDetails(String payload);
}
