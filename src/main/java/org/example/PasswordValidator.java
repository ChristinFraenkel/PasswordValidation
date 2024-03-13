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

    //Commonly used password
    public static boolean isCommonPassword(String password) {
        String[] commonPasswords = {"1234", "password", "test1234", "Password1", "Aa345678"};
        for (String common : commonPasswords) {
            if (password.equals(common)) {
                return true;
            }
        }
        return false;
    }

    //special characters
    public static boolean containsSpecialCharacters(String password) {
        if(!password.matches("[a-zA-Z0-9]*")){
            return true;
        }
        return false;
    }




    public static void main(String[] args) {
        String password = "Password@123";

        if (isPasswordLengthValid(password) && containsDigits(password) && containsUppercaseAndLowercase(password) && !isCommonPassword(password) && containsSpecialCharacters(password)) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. It should be at least 8 characters long, contains digits and include both uppercase and lowercase letters. Also, it should not be a common password and it should contain special characters.");
        }
    }

}
