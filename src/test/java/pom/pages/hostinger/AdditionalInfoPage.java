package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class AdditionalInfoPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }
    public static void clickOnAccountIcon() {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.buttonAccountInfo);
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonAccountInfo);
    }

    public static void clickonAccountInfomation() {
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonClickGetAccountInfo);
    }

    public static void clickOnAdditionalDetailsGroup() {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.paragraphAdditionalDetails);
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.paragraphAdditionalDetails);
    }

    public static void addTextToTextBox(String text) {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.divisionInputPersonalDetails);
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.divisionInputPersonalDetails);
        Common.ctrlAAndDelete(Locator.Hostinger.AdditionalInfoPage.divisionInputPersonalDetails);
        Common.addText(Locator.Hostinger.AdditionalInfoPage.divisionInputPersonalDetails, text);
    }

    public static void clickOnContinueButtonAdditionlInfoField() {
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonClickContinueAtInfoField);
    }

    public static void addTextConfirmPassword(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.AdditionalInfoPage.fieldCurrentPassword );
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.fieldCurrentPassword);
        Common.addText(Locator.Hostinger.AdditionalInfoPage.fieldCurrentPassword, password);
    }

    public static void clickOnConfirmButton() {
        Common.clickOnElement(Locator.Hostinger.AdditionalInfoPage.buttonConfirmClick);
    }

    public static String readTextMessage() {
        return Common.getText(Locator.Hostinger.AdditionalInfoPage.textReadMessage);
    }
}
