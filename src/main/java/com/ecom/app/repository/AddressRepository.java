package com.ecom.app.repository;

import com.ecom.app.entity.Address;
import com.ecom.app.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    @Query("SELECT a FROM Address a WHERE a.peId = :peId AND a.type = :type")
    Address findByType(@Param("peId") Long peId, @Param("type") String type);
}
