package org.demoqa.flow.commonflow;

import org.demoqa.pages.tabsmenu.TabsMenu;
import org.openqa.selenium.WebDriver;

public class TabsMenuFlow {

    private TabsMenu tabsMenu;

    public TabsMenuFlow(WebDriver driver) {
        tabsMenu = new TabsMenu(driver);
    }

    public TabsMenu getTabsMenu() {
        return tabsMenu;
    }

    public void navigateElementPage() {
        tabsMenu.getElementTab().click();
    }

    public void navigateBookStorePage() {
        tabsMenu.getBookStoreTab().click();
    }
}
