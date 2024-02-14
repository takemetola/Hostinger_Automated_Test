package pom.pages;

import org.openqa.selenium.By;

public class Locator {
    public static class Hostinger {
        public class LoginInfo {
            public static By buttonClickLogin = By.xpath("//a[@id='hgr-topmenu-login']");
            public static By loginInputEmail = By.xpath("//input[@id='email-input']");
            public static By loginInputPassword = By.xpath("//input[@id='password-input']");
            public static By buttonClickLoginAccount = By.xpath("//button[@data-qa='login-button']");
        }

        public class LoginPage {
            public static By buttonCookiesDecline =
                    By.xpath("//button[@data-click-id='hgr-cookie_consent-decline_btn']");
            public static By buttonClickLogin = By.xpath("//a[@id='hgr-topmenu-login']");
            public static By buttonClickOnLoginGmail = By.xpath("//a[@data-qa='google-login-button']");
            public static By loginInputEmail = By.xpath("//input[@type='email']");
            public static By buttonClickNext =
                    By.xpath("//button[contains(@class, 'VfPpkd-LgbsSe') and .//span[text()='Next']]");
            public static By inputLoginPassword = By.xpath("//input[@type='password']");
            public static By buttonAccount =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By textUserEmail =
                    By.xpath("(//div[@class='client-card__subtitle' " +
                            "and text()='desire2work4hostinger@gmail.com'])[2]");
        }

        public class UpdateProfileNamePage {
            public static By buttonAccountInfo =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By buttonClickGetAccountInfo = By.xpath("(//span[@class='h-nav__link-text' " +
                    "and text()='Account Information'])[2]");
            public static By divNameGroup =
                    By.xpath("//p[@data-msgid='Name']");
            public static By textFirstNameBox = By.xpath("//input[@id='firstName']");
            public static By locatorAccountTab =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By textLastNameBox = By.xpath("//input[@id='lastName']");
            public static By buttonClickContinue =
                    By.xpath("//button[@class='h-button-v2' " +
                            "and @data-qa='hpanel_tracking-personal-information-continue_button']");
            public static By textPasswordBox = By.xpath("//input[@type='password']");
            public static By buttonClickConfirm =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-confirm_button']");
            public static By readTextFullName =
                    By.xpath("//div[@class='text-md-left text-sm-right text-left' and text()='John Wick']");
        }

        public class UpdatePhoneNumberPage {
            public static By buttonAccountInfo =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By buttonClickGetAccountInfo = By.xpath("(//span[@class='h-nav__link-text' " +
                    "and text()='Account Information'])[2]");
            public static By paragraphPhoneNumber =
                    By.xpath("//p[@data-msgid='Phone number']");
            public static By textAddPhoneNumber = By.xpath("//input[@id='phone' and @type='text']");
            public static By buttonClickConfirmChanges =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-continue_button']");
            public static By elementCurrentPassword = By.xpath("//input[@type='password']");
            public static By buttonClickConfirm =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-confirm_button']");
            public static By textReadPhoneNumber =
                    By.xpath("//div[@class='text-md-left text-sm-right text-left' " +
                            "and text()='+370 123123']");
        }

        public class AdditionalInfoPage {
            public static By buttonAccountInfo =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By buttonClickGetAccountInfo = By.xpath("(//span[@class='h-nav__link-text' " +
                    "and text()='Account Information'])[2]");
            public static By fieldCurrentPassword = By.xpath("//input[@type='password']");
            public static By paragraphAdditionalDetails =
                    By.xpath("//p[@data-msgid='Additional details']");
            public static By divisionInputPersonalDetails =
                    By.xpath("//textarea[@id='additionalDetails']");
            public static By buttonClickContinueAtInfoField =
                    By.xpath("//button[@class='h-button-v2' and @data-qa='hpanel_tracking-personal-information-continue_button']");
            public static By textReadMessage =
                    By.xpath("(//div[@class='text-md-left text-sm-right text-left'])[5]");
            public static By buttonConfirmClick =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-confirm_button']");
        }

        public class DomainSearchPage {
            public static By spanDomains = By.xpath("//span[@class='header-menu__link-text' " +
                    "and @data-msgid='Domains']");
            public static By formFieldDomainName = By.xpath("//input[@type='text']");
            public static By buttonSearch = By.xpath("//button[@class='h-button-v2 submit-button']");
            public static By buttonBuyDomain = By.xpath("(//button[@class='h-button-v2 purchase-button' and @id='hpanel_tracking-domain-checker-buy_by_category_button'])[14]");
            public static By paragraphPrice = By.xpath("//p[@class='details-item__price' and @data-qa='purchase-detail-total']");
            public static By spanDomainNameAi = By.xpath("//span[@class='h-text-break-keep-all' and text()='.ai']");
        }
    }
}
