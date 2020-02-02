package com.ecom.app.dto;

public class PersonTransformer {
    public com.ecom.app.web.model.Person transfer(com.ecom.app.entity.Person fromPerson){
        com.ecom.app.web.model.Person toPerson = new com.ecom.app.web.model.Person();
        toPerson.setPeId(fromPerson.getPeId());
        toPerson.setUserDetail(fromPerson.getUserDetail());
//        toPerson.setCart(fromPerson.getCart());
//        toPerson.setProducts(fromPerson.getProducts());
//        toPerson.setAddresses(fromPerson.getAddresses());
        return toPerson;
    }

    public com.ecom.app.entity.Person transfer(com.ecom.app.web.model.Person fromPerson){
        com.ecom.app.entity.Person toPerson = new com.ecom.app.entity.Person();
        toPerson.setPeId(fromPerson.getPeId());
        toPerson.setUserDetail(fromPerson.getUserDetail());
//        toPerson.setCart(fromPerson.getCart());
//        toPerson.setProducts(fromPerson.getProducts());
//        toPerson.setAddresses(fromPerson.getAddresses());
        return toPerson;
    }
}
