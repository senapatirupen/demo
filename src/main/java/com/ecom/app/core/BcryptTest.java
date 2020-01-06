package com.ecom.app.core;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptTest {
    public static void main(String[] args) {
        BCryptPasswordEncoder bc = new BCryptPasswordEncoder();
        String bct = bc.encode("123");
        System.out.println(bct);
        System.out.println(bc.matches("123", bct));
    }
}
