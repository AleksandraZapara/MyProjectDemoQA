package org.demoqa.pages.bookstoreapp;

import org.demoqa.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookStoreTab extends AbstractPage {

    private static final By PAGE_TITLE = By.xpath("//div[@class='main-header']");

    public BookStoreTab(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageTitle() {
        return driver.findElement(PAGE_TITLE);
    }
}
