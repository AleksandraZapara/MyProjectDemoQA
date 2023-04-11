package org.demoqa.pages.elements;

import org.demoqa.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckBoxPage extends AbstractPage {

    private static final By EXPAND_ALL_BUTTON = By.xpath("//button[@title='Expand all']");
    private static final By COLLAPSE_ALL_BUTTON = By.xpath("//button[@title='Collapse all']");
    private static final By EXPANDED_LIST = By.xpath("//li[@class='rct-node rct-node-parent rct-node-expanded']");
    private static final By COLLAPSED_LIST = By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']");


    public CheckBoxPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getExpandAll() {
        return driver.findElement(EXPAND_ALL_BUTTON);
    }

    public WebElement getCollapseAll() {
        return driver.findElement(COLLAPSE_ALL_BUTTON);
    }

    public WebElement getExpandedList() {
        return driver.findElement(EXPANDED_LIST);
    }

    public WebElement getCollapsedList() {
        return driver.findElement(COLLAPSED_LIST);
    }

}
