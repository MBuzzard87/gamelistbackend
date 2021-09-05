package com.michaelbuzzard.gamelistbackend.jwtauth.resource;

public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}
