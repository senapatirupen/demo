package com.ecom.app.repository;

import com.ecom.app.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("SELECT o FROM Order o WHERE o.peId = :peId")
    Order findOrderByPersonId(@Param("peId") Long peId);
}
