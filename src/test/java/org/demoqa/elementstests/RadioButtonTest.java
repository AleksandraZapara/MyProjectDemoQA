package org.demoqa.elementstests;

import org.demoqa.BaseTest;
import org.demoqa.driver.WebDriverFactory;
import org.demoqa.flow.elementspageflow.RadioButtonFlow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    private RadioButtonFlow radioButtonFlow;

//    @BeforeSuite
//
//    public static void init() {
//        driver = WebDriverFactory.getDriver("chrome");
////        radioButtonFlow = new RadioButtonFlow(driver);
//    }

    @BeforeMethod
    public void GoToPage() {
        driver.get("https://demoqa.com/radio-button");
        radioButtonFlow = new RadioButtonFlow(driver);
    }

    @Test
    public void testPageTitle() {
        String expected = "Radio Button";
        Assert.assertEquals(expected,radioButtonFlow.getTitleText(),"Wrong Title: ");
    }

    @Test
    public void testDefaultState() {
        String expected = "Do you like the site?";
        Assert.assertEquals(expected,radioButtonFlow.getQuestionText(),"Wrong Text: ");
        Assert.assertFalse(radioButtonFlow.isNoRadioButtonEnabled());

    }

    @Test
    public void testSelectYes() {
        radioButtonFlow.clickYesRadioButton();
        Assert.assertTrue(radioButtonFlow.isYesRadioButtonSelected());
    }
}
