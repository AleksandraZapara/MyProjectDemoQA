package org.demoqa.pages.elements;

import org.demoqa.pages.AbstractPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonPage extends AbstractPage {

    private static final By PAGE_TITLE = By.xpath("//div[@class='main-header']");
    private static final By QUESTION_TEXT = By.xpath("//div[@class='mb-3']");
    private static final By YES_RADIO_BUTTON = By.xpath("//input[@id='yesRadio']");
    private static final By YES_RADIO_BUTTON_LABEL = By.xpath("//label[@for='yesRadio']");
    private static final By NO_RADIO_BUTTON = By.xpath("//input[@id='noRadio']");

    public RadioButtonPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageTitle() {
        return driver.findElement(PAGE_TITLE);
    }

    public WebElement getQuestionText() {
        return driver.findElement(QUESTION_TEXT);
    }

    public WebElement getYesRadioButton() {
        return driver.findElement(YES_RADIO_BUTTON);
    }

    public WebElement getYesRadioButtonLabel() {
        return driver.findElement(YES_RADIO_BUTTON_LABEL);
    }

    public WebElement getNoRadioButton() {
        return driver.findElement(NO_RADIO_BUTTON);
    }
}
