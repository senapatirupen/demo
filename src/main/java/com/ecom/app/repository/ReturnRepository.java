package com.ecom.app.repository;

import com.ecom.app.entity.ReturnProduct;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReturnRepository extends JpaRepository<ReturnProduct, Long> {
}
