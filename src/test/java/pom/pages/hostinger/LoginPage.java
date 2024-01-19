package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class LoginPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickCookiesDecline() {
        Common.waitForElementToBeVisible(Locator.Hostinger.LoginPage.waitForElementCookies);
        Common.clickOnElement(Locator.Hostinger.LoginPage.buttonCLickOnCookiesDecline);
    }

    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Hostinger.LoginPage.buttonClickLogin);
    }

    public static void clickOnButtonLoginWithGmail() {
        Common.clickOnElement(Locator.Hostinger.LoginPage.buttonClickOnLoginGmail);
    }

    public static void inputEmailTextbox(String email) {
        Common.addText(Locator.Hostinger.LoginPage.loginInputEmail, email);
    }

    public static void clickOnNext() {
        Common.clickOnElement(Locator.Hostinger.LoginPage.buttonClickNext);
    }

    public static void inputPasswordTextbox(String password) {
        Common.waitForElementToBeVisible(Locator.Hostinger.LoginPage.passwordWaitForElementBox);
        Common.addText(Locator.Hostinger.LoginPage.loginInputPassword, password);
    }

    public static void clickOnAccountIcon() {
        Common.waitForElementToBeVisible(Locator.Hostinger.LoginPage.buttonWaitForAccountBox);
        Common.clickOnElement(Locator.Hostinger.LoginPage.buttonClickonAccount);
    }

    public static String readUserEmail() {
        Common.waitForElementToBeVisible(Locator.Hostinger.LoginPage.textWaitForUserEmail);
        return Common.getText(Locator.Hostinger.LoginPage.textUserEmail);
    }
}
