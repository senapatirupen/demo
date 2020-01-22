package com.ecom.app.repository;

import com.ecom.app.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface PersonRepository extends JpaRepository<Person, Long> {
    @Query("SELECT p FROM Person p WHERE p.userDetail.userName = :userName")
    Person findByUserName(@Param("userName")String userName);
}
