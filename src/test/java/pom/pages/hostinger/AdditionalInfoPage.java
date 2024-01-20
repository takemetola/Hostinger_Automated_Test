package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class AdditionalInfoPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void clickOnAdditionalDetailsGroup() {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.elementAdditionalDetailsGroup);
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonClickOnAdditionalDetailsGroup);
    }

    public static void addTextToTextBox(String text) {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.elementTextBoxWait);
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.elementTextBox);
        Common.ctrlAAndDelete(Locator.Hostinger.AdditionalInfoPage.elementTextBox);
        Common.addText(Locator.Hostinger.AdditionalInfoPage.textAddToTextBox, text);
    }

    public static void clickOnContinueButtonAdditionlInfoField() {
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonClickContinueAtInfoField);
    }

    public static void addTextConfirmPassword(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.passwordBoxElementWait);
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.passwordBoxElementClick);
        Common.addText(Locator.Hostinger.AdditionalInfoPage.textAddPassword, password);
    }

    public static void clickOnConfirmButton() {
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonConfirmClick);
    }

    public static String readTextMessage() {
        return Common.getText(Locator.Hostinger.AdditionalInfoPage.textReadMessage);

    }
}
