package com.ecom.app.service;

import com.ecom.app.entity.Person;
import com.ecom.app.entity.UserDetail;
import com.ecom.app.repository.PersonRepository;
import com.ecom.app.repository.UserDetailRepository;
import io.micrometer.core.instrument.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserInteractionServiceImpl implements UserInteractionService {

    @Autowired
    PersonRepository personRepository;

    @Autowired
    UserDetailRepository userDetailRepository;

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

    public Person findPersonByUserName(String userName){
        Person person = personRepository.findByUserName(userName);
        return person;
    }

    public UserDetail findUserDetailByUserName(String userName){
        UserDetail userDetail = userDetailRepository.findByUserName(userName);
        return userDetail;
    }

    public UserDetail findByUserNameOrEmailId(String userNameEmailId){
        String emailId="";
        String userName="";
        if(userNameEmailId.contains(".com"))
            emailId=userNameEmailId;
        else
            userName=userNameEmailId;
        UserDetail userDetail = userDetailRepository.validateUserNameOrEmailId(userName, emailId);
        return userDetail;
    }

    public UserDetail createUserDetail(UserDetail userDetail){
        Boolean valid = validateUserDetail(userDetail);
        UserDetail newUserDetail = null;
        if(!valid){
            newUserDetail = userDetailRepository.save(userDetail);
            Person person = new Person();
            person.setUserDetail(newUserDetail);
            personRepository.save(person);
        }
        return newUserDetail;
    }

    public Boolean validateUserDetail(UserDetail userDetail){
        UserDetail validUserDetail = null;
        Boolean flag = false;
        if(StringUtils.isNotBlank(userDetail.getUserName())){
            validUserDetail = findUserDetailByUserName(userDetail.getUserName());
            if(!Objects.isNull(validUserDetail) && StringUtils.isNotBlank(validUserDetail.getUserName())){
                flag = true;
            }
        }
        if(StringUtils.isNotBlank(userDetail.getEmailId())){
            validUserDetail = userDetailRepository.findByEmailId(userDetail.getEmailId());
            if(!Objects.isNull(validUserDetail)&& StringUtils.isNotBlank(validUserDetail.getEmailId())){
                flag = true;
            }
        }
        return flag;
    }
}
