package org.demoqa.flow.elementspageflow;

import org.demoqa.flow.commonflow.BaseFlow;
import org.demoqa.pages.elements.CheckBoxPage;
import org.openqa.selenium.WebDriver;

public class CheckBoxFlow extends BaseFlow {
    private CheckBoxPage checkBoxPage;

    public CheckBoxFlow(WebDriver driver) {
        super(driver);
        checkBoxPage = new CheckBoxPage(driver);
    }

    public void getExpandedList() {
        checkBoxPage.getExpandAll().click();
    }

    public void getCollapseList() {
        checkBoxPage.getCollapseAll().click();
    }

    public boolean isListExpanded() {
        return checkBoxPage.getExpandAll().isDisplayed();
    }

    public boolean isListCollapsed() {
        return checkBoxPage.getCollapsedList().isDisplayed();
    }
}
