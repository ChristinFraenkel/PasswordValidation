package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class PasswordValidatorTest {

    // Test for 8 Characters
    @Test
    void isPasswordLengthValid_shouldReturnTrue_WhenGiven8Characters(){
        //GIVEN
        String inputPassword = "abcdefgh";
        //WHEN
        boolean isValid = PasswordValidator.isPasswordLengthValid(inputPassword);
        //THEN
        Assertions.assertTrue(isValid);
    }

    @Test
    void isPasswordLengthValid_shouldReturnFalse_WhenGivenLessThan8Characters(){
        //GIVEN
        String inputPassword = "abcdefg";
        //WHEN
        boolean isValid = PasswordValidator.isPasswordLengthValid(inputPassword);
        //THEN
        Assertions.assertFalse(isValid);
    }

    @Test
    void isPasswordLengthValid_shouldReturnFalse_WhenGiven0Characters(){
        //GIVEN
        String inputPassword = "";
        //WHEN
        boolean isValid = PasswordValidator.isPasswordLengthValid(inputPassword);
        //THEN
        Assertions.assertFalse(isValid);
    }

    // Test for digits
    @Test
    void containsDigits_shouldReturnTrue_WhenGivenDigits(){
        //GIVEN
        String inputPassword = "password123";
        //WHEN
        boolean result = PasswordValidator.containsDigits(inputPassword);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsDigits_shouldReturnFalse_WhenGivenNoDigits(){
        //GIVEN
        String inputPassword = "password";
        //WHEN
        boolean result = PasswordValidator.containsDigits(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsDigits_shouldReturnFalse_WhenEmpty(){
        //GIVEN
        String inputPassword = "";
        //WHEN
        boolean result = PasswordValidator.containsDigits(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    // Test for lowercase and uppercase
    @Test
    void containsUppercaseAndLowercase_shouldReturnTrue_WhenContainsUppercaseAndLowercase(){
        //GIVEN
        String inputPassword = "Password";
        //WHEN
        boolean result = PasswordValidator.containsUppercaseAndLowercase(inputPassword);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containsUppercaseAndLowercase_shouldReturnFalse_WhenContainsOnlyUppercase(){
        //GIVEN
        String inputPassword = "PASSWORD";
        //WHEN
        boolean result = PasswordValidator.containsUppercaseAndLowercase(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsUppercaseAndLowercase_shouldReturnFalse_WhenContainsOnlyLowercase(){
        //GIVEN
        String inputPassword = "password";
        //WHEN
        boolean result = PasswordValidator.containsUppercaseAndLowercase(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containsUppercaseAndLowercase_shouldReturnFalse_WhenEmpty(){
        //GIVEN
        String inputPassword = "";
        //WHEN
        boolean result = PasswordValidator.containsUppercaseAndLowercase(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    //Test for commonly used password
    @Test
    void isCommonPassword_shouldReturnTrue_WhenCommonlyPasswordIsUsed(){
        //GIVEN
        String inputPassword = "password";
        //WHEN
        boolean result = PasswordValidator.isCommonPassword(inputPassword);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void isCommonPassword_shouldReturnFalse_WhenNonCommonlyPasswordIsUsed(){
        //GIVEN
        String inputPassword = "AJRcjaiFJSsf";
        //WHEN
        boolean result = PasswordValidator.isCommonPassword(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void isCommonPassword_shouldReturnFalse_WhenEmptyPasswordIsUsed(){
        //GIVEN
        String inputPassword = "";
        //WHEN
        boolean result = PasswordValidator.isCommonPassword(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    //Test for special chars
    @Test
    void containSpecialCharacters_shouldReturnTrue_WhenSpecialCharactersUsed(){
        //GIVEN
        String inputPassword = "password@123";
        //WHEN
        boolean result = PasswordValidator.containsSpecialCharacters(inputPassword);
        //THEN
        Assertions.assertTrue(result);
    }

    @Test
    void containSpecialCharacters_shouldReturnFalse_WhenNoSpecialCharactersUsed(){
        //GIVEN
        String inputPassword = "password123";
        //WHEN
        boolean result = PasswordValidator.containsSpecialCharacters(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

    @Test
    void containSpecialCharacters_shouldReturnFalse_WhenEmptyPasswordUsed(){
        //GIVEN
        String inputPassword = "";
        //WHEN
        boolean result = PasswordValidator.containsSpecialCharacters(inputPassword);
        //THEN
        Assertions.assertFalse(result);
    }

}


