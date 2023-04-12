package org.demoqa.elementstests;

import org.demoqa.BaseTest;
import org.demoqa.flow.elementspageflow.CheckBoxFlow;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBoxTest extends BaseTest {

    private static CheckBoxFlow checkBoxFlow;

    @BeforeMethod
    public void OpenPage() {
        driver.get("https://demoqa.com/checkbox");
        checkBoxFlow = new CheckBoxFlow(driver);
    }

    @Test(description = "Verify Expanded List")
    public void testExpandList() {
        checkBoxFlow.getExpandedList();
        Assert.assertTrue(checkBoxFlow.isListExpanded());
    }

    @Test(description = "Verify Collapsed List")
    public void testCollapseList() {
        checkBoxFlow.getCollapseList();
        Assert.assertTrue(checkBoxFlow.isListCollapsed());
    }
}
