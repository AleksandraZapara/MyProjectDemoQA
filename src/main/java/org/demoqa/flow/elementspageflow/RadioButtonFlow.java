package org.demoqa.flow.elementspageflow;

import org.demoqa.flow.commonflow.BaseFlow;
import org.demoqa.pages.elements.RadioButtonPage;
import org.openqa.selenium.WebDriver;

public class RadioButtonFlow extends BaseFlow {

    private RadioButtonPage radioButtonPage;

    public RadioButtonFlow(WebDriver driver) {
        super(driver);
        this.radioButtonPage = new RadioButtonPage(driver);
    }

    public RadioButtonPage getRadioButtonPage() {
        return radioButtonPage;
    }

    public String getTitleText() {
        return radioButtonPage.getPageTitle().getText();
    }

    public String getQuestionText() {
        return radioButtonPage.getQuestionText().getText();
    }

    public void clickYesRadioButton() {
        radioButtonPage.getYesRadioButtonLabel().click();
    }

    public boolean isYesRadioButtonSelected() {
        return radioButtonPage.getYesRadioButton().isSelected();
    }

    public boolean isNoRadioButtonEnabled() {
        return radioButtonPage.getNoRadioButton().isEnabled();
    }
}
