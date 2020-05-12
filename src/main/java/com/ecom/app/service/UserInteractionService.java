package com.ecom.app.service;

import com.ecom.app.entity.Address;
import com.ecom.app.entity.Person;
import com.ecom.app.entity.UserDetail;

import java.util.Collection;

public interface UserInteractionService {
    public UserDetail createUserDetail(UserDetail userDetail);
    public UserDetail findUserDetailByUserName(String userName);
    public Person findPersonByUserName(String userName);
    public Address createAddress(String userName, Address address);
    public Collection<Address> findPersonAddressesByUserName(String userName);
}
