package com.ecom.app.repository;

import com.ecom.app.entity.Address;
import com.ecom.app.entity.WishList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishListRepository extends JpaRepository<WishList, Long> {
}
