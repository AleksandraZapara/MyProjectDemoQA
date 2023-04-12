package org.demoqa.elementstests;

import org.demoqa.BaseTest;
import org.demoqa.flow.elementspageflow.RadioButtonFlow;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RadioButtonTest extends BaseTest {

    private RadioButtonFlow radioButtonFlow;

    @BeforeMethod
    public void GoToPage() {
        driver.get("https://demoqa.com/radio-button");
        radioButtonFlow = new RadioButtonFlow(driver);
    }

    @Test(description = "Verify Page Header")
    public void testPageTitle() {
        String expected = "Radio Button";
        Assert.assertEquals(expected,radioButtonFlow.getTitleText(),"Wrong Title: ");
    }

    @Test(description = "Verify Default State")
    public void testDefaultState() {
        String expected = "Do you like the site?";
        Assert.assertEquals(expected,radioButtonFlow.getQuestionText(),"Wrong Text: ");
        Assert.assertFalse(radioButtonFlow.isYesRadioButtonSelected());
        Assert.assertFalse(radioButtonFlow.isNoRadioButtonEnabled());
    }

    @Test
    public void testSelectYes() {
        radioButtonFlow.clickYesRadioButton();
        Assert.assertTrue(radioButtonFlow.isYesRadioButtonSelected());
    }
}
