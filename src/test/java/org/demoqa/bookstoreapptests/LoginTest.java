package org.demoqa.bookstoreapptests;

import org.demoqa.BaseTest;
import org.demoqa.flow.bookstoreflow.LoginFlow;
import org.testng.Assert;
import org.testng.annotations.*;

public class LoginTest extends BaseTest {

    private static LoginFlow loginFlow;

    @BeforeMethod
    public void OpenPage() {
        driver.get("https://demoqa.com/login");
        loginFlow = new LoginFlow(driver);
    }

    @Test(description = "Verify Error Message with incorrect UserName or Password", priority = 1)
    public void testInvalidRequiredFields() {
        loginFlow.inputCredential("Masha", "qwerty");
        Assert.assertTrue(loginFlow.isErrorTextDisplayed());
        Assert.assertEquals(loginFlow.getErrorTextMessage(), "Invalid username or password!");
        Assert.assertEquals(loginFlow.getTitleHeaderText(), "Login");
        loginFlow.clearUserNameField();
        loginFlow.clearPasswordField();
    }

    @Test(description = "Verify Error Message with empty Password", priority = 2)
    public void testInvalidPasswordFields() {
        loginFlow.inputCredential("Sasha", "");
        Assert.assertTrue(loginFlow.isPasswordFieldRequiredDisplayed());
        Assert.assertTrue(loginFlow.isLoginButtonEnabled());
    }

    @Test(description = "Verify Login in Book Store", priority = 3)
    public void testSuccessLogIn() {
        loginFlow.inputCredential("Sasha", "Vbhjckfd090916!");
        Assert.assertTrue(loginFlow.isLogOutButtonDisplayed());
        Assert.assertEquals(loginFlow.getTitleHeaderText(), "Profile");
    }
}
