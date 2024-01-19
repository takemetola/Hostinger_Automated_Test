package pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Hostinger {

        public class LoginPage {
            public static By buttonCLickOnCookiesDecline =
                    By.xpath("//button[@data-click-id='hgr-cookie_consent-decline_btn']");
            public static By waitForElementCookies =
                    By.xpath("//button[@data-click-id='hgr-cookie_consent-decline_btn']");
            public static By buttonClickLogin = By.xpath("//a[@id='hgr-topmenu-login']");
            public static By buttonClickOnLoginGmail = By.xpath("//a[@data-qa='google-login-button']");
            public static By loginInputEmail = By.xpath("//input[@type='email']");
            public static By buttonClickNext =
                    By.xpath("//button[contains(@class, 'VfPpkd-LgbsSe') and .//span[text()='Next']]");
            public static By loginInputPassword = By.xpath("//input[@type='password']");
            public static By passwordWaitForElementBox = By.xpath("//input[@type='password']");
            public static By buttonWaitForAccountBox =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By buttonClickonAccount =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By textUserEmail =
                    By.xpath("(//div[@class='client-card__subtitle' " +
                            "and text()='desire2work4hostinger@gmail.com'])[2]");
            public static By textWaitForUserEmail = By.xpath("(//div[@class='client-card__subtitle' " +
                    "and text()='desire2work4hostinger@gmail.com'])[2]");
        }
    }
}
