package com.hillel.homework15.demo;

import java.util.Scanner;
import static com.hillel.homework15.credentials.СredentialsUtils.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter login: ");
        String login = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        System.out.print("Confirm password: ");
        String confirmPassword = scanner.nextLine();

        boolean isValid = validateUserСredentials(login, password, confirmPassword);
        if (isValid) {
            System.out.println("User registration successful!");
           } else {
            System.out.println("User registration failed.");
           }
        scanner.close();
    }
}