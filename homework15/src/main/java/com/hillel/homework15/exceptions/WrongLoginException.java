package com.hillel.homework15.exceptions;

import java.io.IOException;

public class WrongLoginException extends IOException{
    public WrongLoginException() {
        super("Wrong login format.");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
