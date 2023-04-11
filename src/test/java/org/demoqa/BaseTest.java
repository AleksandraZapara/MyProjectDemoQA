package org.demoqa;

import org.demoqa.driver.WebDriverFactory;
import org.demoqa.flow.bookstoreflow.LoginFlow;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class BaseTest {

    protected static WebDriver driver;
    protected static LoginFlow loginFlow;

    @BeforeSuite
    public static void init() {
        driver = WebDriverFactory.getDriver("chrome");
        loginFlow = new LoginFlow(driver);
    }

    @BeforeMethod
    public void OpenPage() {
        driver.get("https://demoqa.com/login");
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
