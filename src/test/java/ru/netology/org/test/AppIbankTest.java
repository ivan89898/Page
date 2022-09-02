package ru.netology.org.test;

import org.junit.jupiter.api.Test;
import ru.netology.org.data.DataHelper;
import ru.netology.org.page.LoginPage;

import static com.codeborne.selenide.Selenide.open;

public class AppIbankTest {
    @Test
    void v2() {
        open("http://localhost:9999");
        var loginPage = new LoginPage();
        var authInfo = DataHelper.getAuthInfo();
        var verificationPage = loginPage.validLogin(authInfo);
        var verificationCode = DataHelper.getVerificationCodeFor(authInfo);
        verificationPage.validVerify(verificationCode);
    }
}
