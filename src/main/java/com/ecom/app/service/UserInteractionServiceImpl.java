package com.ecom.app.service;

import com.ecom.app.entity.Address;
import com.ecom.app.entity.Person;
import com.ecom.app.entity.UserDetail;
import com.ecom.app.repository.AddressRepository;
import com.ecom.app.repository.PersonRepository;
import com.ecom.app.repository.UserDetailRepository;
import com.ecom.app.util.DateUtil;
import io.micrometer.core.instrument.util.StringUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.inject.Inject;
import java.util.*;

@Slf4j
@Service
public class UserInteractionServiceImpl implements UserInteractionService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    UserDetailRepository userDetailRepository;

    @Autowired
    AddressRepository addressRepository;

    @Inject
    DateUtil dateUtil;

    private Optional<UserDetail> userDetailOptional;

    private PersonRepository getPersonRepository() {
        return personRepository;
    }

    private void setPersonRepository(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public UserDetailRepository getUserDetailRepository() {
        return userDetailRepository;
    }

    public void setUserDetailRepository(UserDetailRepository userDetailRepository) {
        this.userDetailRepository = userDetailRepository;
    }

    @Override
    public Person findPersonByUserName(String userName) {
        Person person = personRepository.findByUserName(userName);
        return person;
    }

    @Override
    public Collection<Address> findPersonAddressesByUserName(String userName) {
        Person person = personRepository.findByUserName(userName);
        return person.getAddresses();
    }

    @Override
    public UserDetail findUserDetailByUserName(String userName) {
        UserDetail userDetail = userDetailRepository.findByUserName(userName);
        return userDetail;
    }

    public UserDetail findUserDetailByEmailId(String emailId) {
        UserDetail userDetail = userDetailRepository.findByEmailId(emailId);
        return userDetail;
    }

    public Optional<UserDetail> isPresentUserDetailByUserName(String userName) {
        userDetailOptional = Optional.of(userDetailRepository.findByUserName(userName));
        return userDetailOptional;
    }

    public Optional<UserDetail> isPresentUserDetailByEmailId(String emailId) {
        userDetailOptional = Optional.of(userDetailRepository.findByEmailId(emailId));
        return userDetailOptional;
    }

    public UserDetail findByUserNameOrEmailId(String userNameEmailId) {
        String emailId = "";
        String userName = "";
        if (userNameEmailId.contains(".com"))
            emailId = userNameEmailId;
        else
            userName = userNameEmailId;
        UserDetail userDetail = userDetailRepository.validateUserNameOrEmailId(userName, emailId);
        return userDetail;
    }

    @Override
    public Address createAddress(String userName, Address address) {
        Person person = findPersonByUserName(userName);
        Address newAddress = addressRepository.save(address);
        if(CollectionUtils.isEmpty(person.getAddresses())){
            Set<Address> addressSet = new HashSet<Address>();
            addressSet.add(newAddress);
            person.setAddresses(addressSet);
        }
        person.getAddresses().add(newAddress);
        personRepository.save(person);
        log.info("Existing Person >>>>> {}", person.toString());
        log.info("New Address >>>>> {}", newAddress.toString());
        return newAddress;
    }


    @Override
    public UserDetail createUserDetail(UserDetail userDetail) {
        Boolean valid = validateUserDetail(userDetail);
        UserDetail newUserDetail = null;
        if (!valid) {
            userDetail.setCreatedBy(userDetail.getUserName());
            userDetail.setCreatedDate(new Date());
            userDetail.setLastModifiedBy(userDetail.getUserName());
            userDetail.setLastModifiedDate(new Date());
            userDetail.setIsActive(true);
            userDetail.setDesc("new user entry");
            userDetail.setStatus("Active");
            userDetail.setDob(dateUtil.dateToDate(userDetail.getDob()));
            newUserDetail = userDetailRepository.save(userDetail);
            Person person = new Person();
            person.setUserDetail(newUserDetail);
            personRepository.save(person);
            log.info("New Person >>>>> {}", person.toString());
            log.info("New User Detail >>>>> {}", newUserDetail.toString());
        }
        return newUserDetail;
    }

    public Boolean validateUserDetail(UserDetail userDetail) {
        UserDetail validUserDetail = null;
        Boolean flag = false;
        if (StringUtils.isNotBlank(userDetail.getUserName())) {
            validUserDetail = findUserDetailByUserName(userDetail.getUserName());
            if (!Objects.isNull(validUserDetail) && StringUtils.isNotBlank(validUserDetail.getUserName())) {
                flag = true;
            }
        }
        if (StringUtils.isNotBlank(userDetail.getEmailId())) {
            validUserDetail = userDetailRepository.findByEmailId(userDetail.getEmailId());
            if (!Objects.isNull(validUserDetail) && StringUtils.isNotBlank(validUserDetail.getEmailId())) {
                flag = true;
            }
        }
        return flag;
    }
}
