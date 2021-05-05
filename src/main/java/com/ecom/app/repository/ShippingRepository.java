package com.ecom.app.repository;

import com.ecom.app.entity.Shipping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShippingRepository extends JpaRepository<Shipping, Long> {

    Shipping findByOdId(Long odId);

}
