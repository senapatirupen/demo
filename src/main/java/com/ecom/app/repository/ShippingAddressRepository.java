package com.ecom.app.repository;

import com.ecom.app.entity.DeliveryAddress;
import com.ecom.app.entity.ShippingAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingAddressRepository extends JpaRepository<ShippingAddress, Long> {
}
