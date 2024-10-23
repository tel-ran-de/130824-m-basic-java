package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    String accountCorrect;
    String accountZero;
    String accountIncorrect;
    String accountNoDigits;

    @BeforeEach
    void init() {
        accountCorrect = "12345678901234";
        accountZero = "00000000000000";
        accountIncorrect = "1234567890qw";
        accountNoDigits = "qwerasdasdqwer";
    }

    @Test
    void isValidAccountNumberInInputNullTest() {
        assertFalse(BankAccount.isValidAccountNumber(null));
    }

    @Test
    void isValidAccountNumberInInputEmptyTest() {
        assertFalse(BankAccount.isValidAccountNumber(""));
    }

    @Test
    void isValidAccountNumberIsCorrectLengthTest() {
        assertTrue(BankAccount.isValidAccountNumber(accountCorrect));
    }

    @Test
    void isValidAccountNumberAllZeroTest() {
        assertFalse(BankAccount.isValidAccountNumber(accountZero));
    }

    @Test
    void isValidAccountNumberIncorrectAccount() {
        assertFalse(BankAccount.isValidAccountNumber(accountIncorrect));
    }

    @Test
    void isValidAccountNumberNotDigits() {
        assertFalse(BankAccount.isValidAccountNumber(accountNoDigits));
    }
}