package com.Test.ECommerceApplication.Repository;

import com.Test.ECommerceApplication.Entity.VendorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepo  extends JpaRepository<VendorEntity,Long> {
}
