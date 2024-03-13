package org.example;

import java.util.Random;

public class PasswordGenerator {

    // Method to generate a random secure password
    public static String generateSecurePassword() {
        // Define criteria for the password
        int length = 12; // You can adjust the length as needed
        String uppercaseChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowercaseChars = "abcdefghijklmnopqrstuvwxyz";
        String digitChars = "0123456789";
        String specialChars = "!@#$%^&*()_+-=[]{}|;:,.<>?";

        // Combine all possible characters
        String allChars = uppercaseChars + lowercaseChars + digitChars + specialChars;

        // Create a random number generator
        Random random = new Random();

        // Generate the password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            // Get a random index to select a character from allChars
            int randomIndex = random.nextInt(allChars.length());

            // Append the selected character to the password
            password.append(allChars.charAt(randomIndex));
        }

        return password.toString();
    }

    public static void main(String[] args) {
        // Generate a random secure password
        String password = generateSecurePassword();

        // Validate the generated password
        if (PasswordValidator.isPasswordLengthValid(password) &&
                PasswordValidator.containsDigits(password) &&
                PasswordValidator.containsUppercaseAndLowercase(password) &&
                PasswordValidator.containsSpecialCharacters(password) &&
                !PasswordValidator.isCommonPassword(password)) {
            System.out.println("Generated Password: " + password);
        } else {
            System.out.println("Error: Generated password does not meet the criteria.");
        }
    }
}