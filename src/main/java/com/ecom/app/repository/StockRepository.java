package com.ecom.app.repository;

import com.ecom.app.entity.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockRepository extends JpaRepository<Stock, Long> {
}
