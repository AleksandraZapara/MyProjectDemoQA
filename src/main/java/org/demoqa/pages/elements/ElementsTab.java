package org.demoqa.pages.elements;

import org.demoqa.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementsTab extends AbstractPage {

    private static final By PAGE_TITLE = By.xpath("//div[@class='main-header']");

    public ElementsTab(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageTitle() {
        return driver.findElement(PAGE_TITLE);
    }
}
