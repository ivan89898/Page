package ru.netology.org.page;

import com.codeborne.selenide.SelenideElement;
import ru.netology.org.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginField = $("[data-test-id=login] input");
    private SelenideElement passwordField = $("[data-test-id=password] input");
    private SelenideElement loginButton = $("[data-test-id=action-login]");
    private SelenideElement vercode = $("[data-test-id=code] input");

    public VerificationPage validLogin(DataHelper.AuthInfo info) {
        loginField.setValue(info.getLogin());
        passwordField.setValue(info.getPassword());
        loginButton.click();
        vercode.setValue(info.getVercode());
        return new VerificationPage();
    }
}
