package com.DigitalVisionProject.service.exceptions;

public class AuthenticationFailException extends IllegalArgumentException{
    public AuthenticationFailException(String message){
        super(message);
    }
}
