package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class UpdatePhoneNumberPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnPhoneNumberGroup() {
        Common.waitForElementToBeVisible(5, Locator.Hostinger.UpdatePhoneNumberPage.elementPhoneBox2);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.PhoneGroupElementClick);
    }

    public static void addPhoneNumber(String phoneNumber) {
        Common.waitForElementToBeVisible(4, Locator.Hostinger.UpdatePhoneNumberPage.elementPhoneBox2);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.phoneNumberGroupClick);
        Common.doubleClickOnElementByActions(Locator.Hostinger.UpdatePhoneNumberPage.elementPhoneBoxClick);
        Common.addText(Locator.Hostinger.UpdatePhoneNumberPage.textAddPhoneNumber, phoneNumber);
    }

    public static void clickOnContinueButton() {
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.buttonClickConfirmChanges);
    }

    public static void addTextConfirmPassword(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdatePhoneNumberPage.passwordBoxElementWait);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.passwordBoxElementClick);
        Common.addText(Locator.Hostinger.UpdatePhoneNumberPage.textAddPassword, password);
    }

    public static void clickOnConfirmButton() {
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.buttonClickConfirm);
    }

    public static String readPhoneNumber() {
        return Common.getText(Locator.Hostinger.UpdatePhoneNumberPage.textReadPhoneNumber);
    }
}
