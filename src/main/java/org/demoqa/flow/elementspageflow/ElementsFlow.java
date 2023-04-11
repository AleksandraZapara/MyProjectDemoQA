package org.demoqa.flow.elementspageflow;

import org.demoqa.flow.commonflow.BaseFlow;
import org.demoqa.pages.elements.ElementsTab;
import org.openqa.selenium.WebDriver;

public class ElementsFlow extends BaseFlow {

    private ElementsTab elementsTab;

    public ElementsFlow(WebDriver driver) {
        super(driver);
        elementsTab = new ElementsTab(driver);
    }

    public ElementsTab getElementsTab() {
        return elementsTab;
    }

    public String getTitleHeader() {
        return elementsTab.getPageTitle().getText();
    }
}
