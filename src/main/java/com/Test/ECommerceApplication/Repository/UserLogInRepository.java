package com.Test.ECommerceApplication.Repository;

import com.Test.ECommerceApplication.Entity.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLogInRepository  extends JpaRepository<LoginEntity,Long> {
}
