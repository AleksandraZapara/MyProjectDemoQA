package org.demoqa.navigation;

import org.demoqa.BaseTest;
import org.demoqa.flow.bookstoreflow.BookStoreFlow;
import org.demoqa.flow.elementspageflow.ElementsFlow;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

    private static BookStoreFlow bookStoreFlow;
    private static ElementsFlow elementsFlow;

    @BeforeMethod
    public void OpenPage() {
        driver.get("https://demoqa.com/");
        elementsFlow = new ElementsFlow(driver);
        bookStoreFlow = new BookStoreFlow(driver);
    }

    @Test(description = "Verify Navigation to Elements Page")
    public void testNavigateToElements() {
        elementsFlow.getTabsMenuFlow().navigateElementPage();
        String expected = "Elements";
        Assert.assertEquals(expected, elementsFlow.getTitleHeader());
    }

    @Test(description = "Verify Navigation to Book Store Page")
    public void testNavigateToBookStorePAge() {
        Actions action= new Actions(driver);
        action.scrollByAmount(0,900).build().perform();
        bookStoreFlow.getTabsMenuFlow().navigateBookStorePage();
        String expected = "Book Store";
        Assert.assertEquals(expected, bookStoreFlow.getTitleHeader());
    }
}
