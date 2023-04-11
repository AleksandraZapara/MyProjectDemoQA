package org.demoqa.bookstoreapptests;

import org.demoqa.BaseTest;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

//    private static WebDriver driver;
//    private static LoginFlow loginFlow;

//    @BeforeSuite
//    public static void init() {
//        driver = WebDriverFactory.getDriver("chrome");
//        loginFlow = new LoginFlow(driver);
//    }
//
//    @BeforeMethod
//    public void OpenPage() {
//        driver.get("https://demoqa.com/login");
//        driver.manage().window().maximize();
//    }

    @Test(description = "Verify Error Message with incorrect UserName or Password", priority = 1)
    public void testInvalidRequiredFields() {
        loginFlow.inputCredential("Masha", "qwerty");
        Assert.assertTrue(loginFlow.isErrorTextDisplayed());
        Assert.assertEquals(loginFlow.getErrorTextMessage(), "Invalid username or password!");
        Assert.assertEquals(loginFlow.getTitleHeaderText(), "Login");
        loginFlow.clearUserNameField();
        loginFlow.clearPasswordField(); //не ранится второй тест
    }

    @Test(description = "Verify Error Message with empty Password", priority = 2)
    public void testInvalidPasswordFields() throws InterruptedException {
//        loginFlow.clearUserNameField();
//        loginFlow.clearPasswordField();
        Thread.sleep(3000);
        loginFlow.inputCredential("Sasha", "");
        Assert.assertTrue(loginFlow.isPasswordFieldRequiredDisplayed());
        Assert.assertTrue(loginFlow.isLoginButtonEnabled());
    }

    @Test(description = "Verify Login in Book Store", priority = 3)
    public void testSuccessLogIn() throws InterruptedException {
        loginFlow.inputCredential("Sasha", "Vbhjckfd090916!");
        Thread.sleep(3000);
        Assert.assertEquals(loginFlow.getTitleHeaderText(), "Profile");
        Assert.assertTrue(loginFlow.isLogOutButtonDisplayed());
    }

//    @AfterMethod
//    public void clean() {
//        driver.manage().deleteAllCookies();
//    }
//
//    @AfterSuite
//    public static void closeChrome() {
//        driver.quit();
//    }
}
