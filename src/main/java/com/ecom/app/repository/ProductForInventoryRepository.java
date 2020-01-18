package com.ecom.app.repository;

import com.ecom.app.entity.Address;
import com.ecom.app.entity.ProductForInventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductForInventoryRepository extends JpaRepository<ProductForInventory, Long> {
}
