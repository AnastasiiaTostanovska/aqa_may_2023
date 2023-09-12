package com.hillel.homework15.credentials;

import com.hillel.homework15.exceptions.WrongLoginException;
import com.hillel.homework15.exceptions.WrongPasswordException;

public class СredentialsUtils {

    public static boolean validateUserСredentials(String login, String password, String confirmPassword) {
        boolean isValid = true;
        try {
            validateLogin(login);
        } catch (WrongLoginException e) {
            System.err.println("WrongLoginException: " + e.getMessage());
            isValid = false;
        }
        try {
            validatePassword(password, confirmPassword);
        } catch (WrongPasswordException e) {
            System.err.println("WrongPasswordException: " + e.getMessage());
            isValid = false;
        }
        return isValid;
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (!login.contains("_") || login.length() >= 20) {
            throw new WrongLoginException("Invalid login format");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (!password.contains("_") || !password.contains("!") || password.length() >= 20 ){
            throw new WrongPasswordException("Invalid password format");
        }
        if (!password.equals(confirmPassword)){
            throw new WrongPasswordException("Passwords do not match");
        }
    }


}











