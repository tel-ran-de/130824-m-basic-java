package org.example;

public class BankAccount {
    public static boolean isValidAccountNumber(String accountNumber) {
        if (accountNumber == null || accountNumber.equalsIgnoreCase("")) {
            return false;
        }

        if (accountNumber.length() != 14) {
            return false;
        }

        int count = 0;
        for (int i = 0; i < accountNumber.length(); i++) {
            if(!Character.isDigit(accountNumber.charAt(i))) {
                return false;
            }
            if (accountNumber.charAt(i) == '0') {
                count++;
            }
        }

        if (count == 14) {
            return false;
        }

        return true;
    }
}
