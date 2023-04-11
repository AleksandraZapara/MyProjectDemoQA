package org.demoqa.navigation;

import org.demoqa.BaseTest;
import org.demoqa.flow.bookstoreflow.BookStoreFlow;
import org.demoqa.flow.elementspageflow.ElementsFlow;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NavigationTest extends BaseTest {

//    private static WebDriver driver;
    private static BookStoreFlow bookStoreFlow;
    private static ElementsFlow elementsFlow;

//    @BeforeSuite
//
//    public static void init() {
//        driver = WebDriverFactory.getDriver("chrome");
//        elementsFlow = new ElementsFlow(driver);
//        bookStoreFlow = new BookStoreFlow(driver);
//    }

    @BeforeMethod
    public void OpenPage() {
        driver.get("https://demoqa.com/");
        elementsFlow = new ElementsFlow(driver);
        bookStoreFlow = new BookStoreFlow(driver);
    }

    @Test
    public void testNavigateToElements() {
        elementsFlow.getTabsMenuFlow().navigateElementPage();
        String expected = "Elements";
        Assert.assertEquals(expected, elementsFlow.getTitleHeader());
    }

    @Test
    public void testNavigateToBookStorePAge() {
//        Actions action= new Actions(driver);
//        action.moveToElement(driver.findElement(By.xpath("//div[@class='card-body']//h5[text()='Book Store Application']"))).build().perform();
        bookStoreFlow.getTabsMenuFlow().navigateBookStorePage();
        String expected = "Book Store";
        Assert.assertEquals(expected, bookStoreFlow.getTitleHeader());
    }
}
