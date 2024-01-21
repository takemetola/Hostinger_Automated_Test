package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class UpdatePhoneNumberPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void clickOnAccountIcon() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdatePhoneNumberPage.buttonAccountInfo);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.buttonAccountInfo);
    }

    public static void clickonAccountInfomation() {
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.buttonClickGetAccountInfo);
    }

    public static void clickOnPhoneNumberGroup() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdatePhoneNumberPage.paragraphPhoneNumber);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.paragraphPhoneNumber);
    }

    public static void addPhoneNumber(String phoneNumber) {
        Common.waitForElementToBeVisible(5, Locator.Hostinger.UpdatePhoneNumberPage.paragraphPhoneNumber);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.textAddPhoneNumber);
        Common.ctrlAAndDelete(Locator.Hostinger.UpdatePhoneNumberPage.textAddPhoneNumber);
        Common.addText(Locator.Hostinger.UpdatePhoneNumberPage.textAddPhoneNumber, phoneNumber);
    }

    public static void clickOnContinueButton() {
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.buttonClickConfirmChanges);
    }

    public static void addTextConfirmPassword(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdatePhoneNumberPage.elementCurrentPassword);
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.elementCurrentPassword);
        Common.addText(Locator.Hostinger.UpdatePhoneNumberPage.elementCurrentPassword, password);
    }

    public static void clickOnConfirmButton() {
        Common.clickOnElement(Locator.Hostinger.UpdatePhoneNumberPage.buttonClickConfirm);
    }

    public static String readPhoneNumber() {
        return Common.getText(Locator.Hostinger.UpdatePhoneNumberPage.textReadPhoneNumber);
    }
}
