package com.Test.ECommerceApplication.Service;

import com.Test.ECommerceApplication.Entity.ShipperEntity;
import com.Test.ECommerceApplication.Entity.VendorEntity;

import java.util.List;

public interface IShipper {
    public String insert_data_shipper(String payloadString);
    public List<ShipperEntity> getAllShippers();
    public  String deleteShipper(long id);
    public String updateShipperDetails(String payload);
}
