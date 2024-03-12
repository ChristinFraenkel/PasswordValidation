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




}


//GIVEN
//WHEN
//THEN