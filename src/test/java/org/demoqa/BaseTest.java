package org.demoqa;

import org.demoqa.driver.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeSuite
    public static void init() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void clean() {
        driver.manage().deleteAllCookies();
    }

    @AfterSuite
    public static void closeChrome() {
        driver.quit();
    }
}
