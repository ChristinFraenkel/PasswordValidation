package org.example;

public class PasswordValidator {

    //Password Length
    public static boolean isPasswordLengthValid(String password) {
        // Check if password length is at least 8 characters
        if (password.length() < 8) {
            return false;
        }
        return true;
    }

    //Password Digits
    public static boolean containsDigits(String password) {
        return password.matches(".*\\d.*");
    }

    //Lowercase and uppercase
    public static boolean containsUppercaseAndLowercase(String password) {
        boolean hasUppercase = false;
        boolean hasLowercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            }

            if (hasUppercase && hasLowercase) {
                return true;
            }
        }

        return false;
    }



    public static void main(String[] args) {
        String password = "testpassworD2";

        if (isPasswordLengthValid(password) && containsDigits(password) && containsUppercaseAndLowercase(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. It should be at least 8 characters long, contains digits and include both uppercase and lowercase letters.");
        }
    }

}
