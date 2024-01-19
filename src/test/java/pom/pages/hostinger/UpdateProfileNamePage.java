package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class UpdateProfileNamePage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.buttonClickLogin);
    }

    public static void inputEmail(String email) {
        Common.addText(Locator.Hostinger.UpdateProfileNamePage.loginInputEmail, email);
    }

    public static void inoutPassword(String password) {
        Common.addText(Locator.Hostinger.UpdateProfileNamePage.loginInputPassword, password);
    }

    public static void clickOnButtonLoginAccount() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.buttonClickLoginAccount);
    }

    public static void clickOnAccountIcon() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileNamePage.locatorWaitAccountTab);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.buttonClickAccountInfo);
    }

    public static void clickonAccountInfomation() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.buttonClickGetAccountInfo);
    }

    public static void clickonNameGroup() {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileNamePage.locatorNameWait);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.wrapperClickName);
    }

    public static void addTextFirstName(String firstName) {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileNamePage.elementWaitNameBox);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.elementNameBoxClick);
        Common.doubleClickOnElementByActions(Locator.Hostinger.UpdateProfileNamePage.doubleClickOnFirstNameBox);
        Common.addText(Locator.Hostinger.UpdateProfileNamePage.textAddFirstName, firstName);
    }

    public static void addTextLastName(String lastName) {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.elementLastNameBoxClick);
        Common.doubleClickOnElementByActions(Locator.Hostinger.UpdateProfileNamePage.doubleClickOnLastNameBox);
        Common.addText(Locator.Hostinger.UpdateProfileNamePage.textAddLastName, lastName);
    }

    public static void clickOnButtonContinue() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.buttonClickContinue);
    }

    public static void addTextConfirmPassword(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.UpdateProfileNamePage.passwordBoxElementWait);
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.passwordBoxElementClick);
        Common.addText(Locator.Hostinger.UpdateProfileNamePage.textAddPassword, password);
    }

    public static void clickOnConfirmButton() {
        Common.clickOnElement(Locator.Hostinger.UpdateProfileNamePage.buttonClickConfirm);
    }

    public static String readTextFullName() {
        return Common.getText(Locator.Hostinger.UpdateProfileNamePage.readTextFullName);
    }
}
