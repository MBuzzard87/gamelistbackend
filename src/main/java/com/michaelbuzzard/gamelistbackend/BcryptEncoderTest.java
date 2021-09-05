package com.michaelbuzzard.gamelistbackend;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BcryptEncoderTest {


    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedStr = encoder.encode("buzzJawn");
        System.out.println(encodedStr);
    }

}
