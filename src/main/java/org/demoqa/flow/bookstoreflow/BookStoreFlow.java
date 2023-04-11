package org.demoqa.flow.bookstoreflow;

import org.demoqa.flow.commonflow.BaseFlow;
import org.demoqa.pages.bookstoreapp.BookStoreTab;
import org.openqa.selenium.WebDriver;

public class BookStoreFlow extends BaseFlow {

    private BookStoreTab bookStoreTab;

    public BookStoreFlow(WebDriver driver) {
        super(driver);
        bookStoreTab = new BookStoreTab(driver);
    }

    public BookStoreTab getBookStoreTab() {
        return bookStoreTab;
    }

    public String getTitleHeader() {
        return bookStoreTab.getPageTitle().getText();
    }
}
