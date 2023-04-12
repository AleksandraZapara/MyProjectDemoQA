package org.demoqa.pages.bookstoreapp;

import org.demoqa.pages.AbstractPage;
import org.demoqa.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends AbstractPage {

    private static final By TITLE_HEADER = By.xpath("//div[@class='main-header']");
    private static final By USER_NAME_FIELD = By.id("userName");
    private static final By PASSWORD_FIELD = By.id("password");
    private static final By LOGIN_BUTTON = By.xpath("//button[@id='login']");
    private static final By LOG_OUT_BUTTON = By.xpath("//button[text()='Log out']");
    private static final By ERROR_TEXT = By.xpath("//div[@id='output']//p");
    private static final By PASSWORD_REQUIRED = By.xpath("//input[@class='mr-sm-2 is-invalid form-control']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getTitleHeader() {
        return Waiters.waitUntilElementIsPresent(driver, TITLE_HEADER);
    }

    public WebElement getUserNameField() {
        return driver.findElement(USER_NAME_FIELD);
    }

    public WebElement getPasswordField() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getLoginButton() {
        return driver.findElement(LOGIN_BUTTON);
    }

    public WebElement getLogOutButton() {
        return Waiters.waitUntilElementIsPresent(driver, LOG_OUT_BUTTON);
    }

    public WebElement getErrorText() {
        return Waiters.waitUntilElementIsPresent(driver, ERROR_TEXT);
    }

    public WebElement getPasswordFieldRequired() {
        return Waiters.waitUntilElementIsPresent(driver, PASSWORD_REQUIRED);
    }
}
