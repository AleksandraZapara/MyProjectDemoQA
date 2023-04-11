package org.demoqa.pages.tabsmenu;

import org.demoqa.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TabsMenu extends AbstractPage {

    private static final By ELEMENTS_TAB = By.xpath("//div[@class='card-body']//h5[text()='Elements']");
    private static final By BOOK_STORE_TAB = By.xpath("//div[@class='card-body']//h5[text()='Book Store Application']");

    public TabsMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getElementTab() {
        return driver.findElement(ELEMENTS_TAB);
    }

    public WebElement getBookStoreTab() {
        return driver.findElement(BOOK_STORE_TAB);
    }
}
