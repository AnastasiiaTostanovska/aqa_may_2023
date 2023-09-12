package com.hillel.homework15.exceptions;

import java.io.IOException;

public class WrongPasswordException extends IOException{
    public WrongPasswordException() {
        super("Wrong password format.");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}

