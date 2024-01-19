package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class UpdateProfileInfoPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);

    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickLogin);
    }

    public static void inputEmail(String email) {
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.loginInputEmail, email);
    }

    public static void inoutPassword(String password) {
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.loginInputPassword, password);
    }

    public static void clickOnButtonLoginAccount() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickLoginAccount);
    }

    public static void clickOnAccountIcon() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.locatorWaitAccountTab);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickAccountInfo);
    }

    public static void clickonAccountInfomation() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickGetAccountInfo);
    }

    public static void clickonNameGroup() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.locatorNameWait);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.wrapperClickName);
    }

    public static void addTextFirstName(String firstName) {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.elementWaitNameBox);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.elementNameBoxClick);
        //Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.elementWaitNameBox);
        //Common.clearText(Locator.Hostinger.UpdateProfileInfoPage.textBoxFirstNameClear);
        Common.doubleClickOnElementByActions(Locator.Hostinger.UpdateProfileInfoPage.doubleClickOnFirstNameBox);
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.textAddFirstName, firstName);
    }

    public static void addTextLastName(String lastName) {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.elementLastNameBoxClick);
        //Common.clearText(Locator.Hostinger.UpdateProfileInfoPage.textBoxLastNameClear);
        Common.doubleClickOnElementByActions(Locator.Hostinger.UpdateProfileInfoPage.doubleClickOnLastNameBox);
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.textAddLastName, lastName);
    }

    public static void clickonButtonContinue() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickContinue);
    }

    public static void addTextConfirmPassword(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.passwordBoxElementWait);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.passwordBoxElementClick);
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.textAddPassword, password);
    }

    public static void clickOnConfirmButton() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickConfirm);
    }

    public static void clickOnPhoneNumberGroup() {
        Common.waitForElementToBeVisible(5,Locator.Hostinger.UpdateProfileInfoPage.elementPhoneBox2);
        //Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.elementPhoneNumber);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.PhoneGroupElementClick);
    }

    public static void addPhoneNumber(String phoneNumber) {
        Common.waitForElementToBeVisible(4,Locator.Hostinger.UpdateProfileInfoPage.elementPhoneBox2);
        //Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.elementPhoneBox);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.phoneNumberGroupClick);
        Common.doubleClickOnElementByActions(Locator.Hostinger.UpdateProfileInfoPage.elementPhoneBoxClick);
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.textAddPhoneNumber, phoneNumber);
    }

    public static void clickOnContinueButton() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickConfirmChanges);
    }

    public static void clickOnAdditionalDetailsGroup() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileInfoPage.elementAdditionalDetailsGrup);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickOnAdditionalDetailsGroup);
    }

    public static void addTextToTextBox(String text) {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.elementTextBox);
        Common.addText(Locator.Hostinger.UpdateProfileInfoPage.textAddToTextBox, text);
    }

    public static void clickOnContinueButtonAdditionlInfoField() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileInfoPage.buttonClickContinueAtInfoField);
    }
}
