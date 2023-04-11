package org.demoqa.elementstests;

import org.demoqa.BaseTest;
import org.demoqa.driver.WebDriverFactory;
import org.demoqa.flow.elementspageflow.CheckBoxFlow;
import org.demoqa.flow.elementspageflow.RadioButtonFlow;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

//    private static WebDriver driver;
    private static CheckBoxFlow checkBoxFlow;

//    @BeforeSuite
//
//    public static void init() {
//        driver = WebDriverFactory.getDriver("chrome");
//        checkBoxFlow = new CheckBoxFlow(driver);
//    }

    @BeforeMethod
    public void OpenPage() {
        driver.get("https://demoqa.com/checkbox");
        checkBoxFlow = new CheckBoxFlow(driver);
    }

    @Test
    public void testExpandList() {
        checkBoxFlow.getExpandedList();
        Assert.assertTrue(checkBoxFlow.isListExpanded()); //check it
    }

    @Test
    public void testCollapseList() {
        checkBoxFlow.getCollapseList();
        Assert.assertTrue(checkBoxFlow.isListCollapsed()); //check it
    }
}
