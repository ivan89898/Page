package ru.netology.org.data;

import lombok.Value;

public class DataHelper {
    private DataHelper() {
    }

    @Value
    public static class AuthInfo {
        private String login;
        private String password;
        private String email;
        private String vercode;
        private String cardNumberOne;
        private String balanceOne;
        private String cardNumberTwo;
        private String balanceTwo;

    }

    public static AuthInfo getAuthInfo() {
        return new AuthInfo("vasya", "qwerty123", "test@mail.ru", "12345", "5559 0000 0000 0001", "10 000 RUB", "5559 0000 0000 0002", "10 000 RUB");
    }

    // public static AuthInfo getOtherAuthInfo(AuthInfo original) {
    //  return new AuthInfo("petya", "123qwerty", "test-wrong@mail.ru");
    // }

    @Value
    public static class VerificationCode {
        private String code;
    }

    public static VerificationCode getVerificationCodeFor(AuthInfo authInfo) {
        return new VerificationCode("12345");
    }
}