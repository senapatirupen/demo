package com.ecom.app.repository;

import com.ecom.app.entity.UserDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserDetailRepository extends JpaRepository<UserDetail, Long> {
    UserDetail findByUserName(String userName);
    UserDetail findByEmailId(String emaiId);

    @Query("SELECT u FROM UserDetail u WHERE u.userName = :useName OR u.emailId = :emailId")
    UserDetail vlidateUserNameOrEmailId(@Param("userName") String userName, @Param("emailId") String emailId);
}
