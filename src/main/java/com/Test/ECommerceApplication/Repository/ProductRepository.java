package com.Test.ECommerceApplication.Repository;

import com.Test.ECommerceApplication.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface  ProductRepository extends JpaRepository<ProductEntity,Long> {
}
