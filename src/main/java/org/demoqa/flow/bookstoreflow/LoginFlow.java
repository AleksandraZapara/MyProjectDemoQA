package org.demoqa.flow.bookstoreflow;

import org.demoqa.flow.commonflow.BaseFlow;
import org.demoqa.pages.bookstoreapp.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow extends BaseFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setUserNameField(String userName) {
        loginPage.getUserNameField().sendKeys(userName);
    }

    public void setPasswordField(String password) {
        loginPage.getPasswordField().sendKeys(password);
    }

    public void clickLoginButton() {
        loginPage.getLoginButton().click();
    }

    public String getErrorTextMessage() {
        return loginPage.getErrorText().getText();
    }

    public String getTitleHeaderText() {
        return loginPage.getTitleHeader().getText();
    }

    public boolean isErrorTextDisplayed() {
        return loginPage.getErrorText().isDisplayed();
    }

    public boolean isPasswordFieldRequiredDisplayed() {
        return loginPage.getPasswordFieldRequired().isDisplayed();
    }

    public boolean isLoginButtonEnabled() {
        return loginPage.getLoginButton().isEnabled();
    }

    public boolean isLogOutButtonDisplayed() {
        return loginPage.getLogOutButton().isDisplayed();
    }

    public void inputCredential(String userName, String password) {
        setUserNameField(userName);
        setPasswordField(password);
        clickLoginButton();
    }

    public void clearUserNameField() {
        loginPage.getUserNameField().clear();
    }

    public void clearPasswordField() {
        loginPage.getPasswordField().clear();
    }
}
