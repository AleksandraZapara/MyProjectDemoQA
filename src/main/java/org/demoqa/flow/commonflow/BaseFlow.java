package org.demoqa.flow.commonflow;

import org.openqa.selenium.WebDriver;

public abstract class BaseFlow {

    private TabsMenuFlow tabsMenuFlow;

    public BaseFlow(WebDriver driver) {
        tabsMenuFlow = new TabsMenuFlow(driver);
    }

    public TabsMenuFlow getTabsMenuFlow() {
        return tabsMenuFlow;
    }
}
