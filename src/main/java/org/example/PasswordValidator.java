package org.example;

public class PasswordValidator {

    public static boolean isPasswordLengthValid(String password) {
        // Check if password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        return true;
    }



    public static void main(String[] args) {
        String password = "testpassword";

        if (isPasswordLengthValid(password)){
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. It should be at least 8 characters long.");
        }
    }

}
