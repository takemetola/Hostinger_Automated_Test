package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class LoginInfo {
    public static void login(String email, String password) {
        LoginInfo.clickOnButtonLogin();
        LoginInfo.inputEmail(email);
        LoginInfo.inoutPassword(password);
        LoginInfo.clickOnButtonLoginAccount();
    }
    public static void clickOnButtonLogin() {
        Common.clickOnElement(Locator.Hostinger.LoginInfo.buttonClickLogin);
    }

    public static void inputEmail(String email) {
        Common.addText(Locator.Hostinger.LoginInfo.loginInputEmail, email);
    }

    public static void inoutPassword(String password) {
        Common.addText(Locator.Hostinger.LoginInfo.loginInputPassword, password);
    }

    public static void clickOnButtonLoginAccount() {
        Common.clickOnElement(Locator.Hostinger.LoginInfo.buttonClickLoginAccount);
    }
}
