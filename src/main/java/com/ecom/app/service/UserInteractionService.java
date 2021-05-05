package com.ecom.app.service;

import com.ecom.app.entity.Address;
import com.ecom.app.entity.Person;
import com.ecom.app.entity.UserDetail;

import java.util.Collection;

public interface UserInteractionService {
    Address updateAddress(String userName, Address address);

    Collection<Address> allAddresses(String userName);

    UserDetail singIn(UserDetail userDetail);

    UserDetail resetPassword(UserDetail userDetail);

    public UserDetail createUserDetail(UserDetail userDetail);
    public UserDetail findUserDetailByUserName(String userName);
    public UserDetail findUserDetailByPhoneNumber(String phoneNumber);
    public Person findPersonByUserName(String userName);
    public Address createAddress(String userName, Address address);
    public Collection<Address> findPersonAddressesByUserName(String userName);
}
