package com.ecom.app.repository;

import com.ecom.app.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
    Payment findByOdId(Long odId);

}
