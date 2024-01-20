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

        public class UpdateProfileNamePage {

            public static By buttonClickLogin = By.xpath("//a[@id='hgr-topmenu-login']");
            public static By loginInputEmail = By.xpath("//input[@id='email-input']");
            public static By loginInputPassword = By.xpath("//input[@id='password-input']");
            public static By buttonClickLoginAccount = By.xpath("//button[@data-qa='login-button']");
            public static By buttonClickAccountInfo =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By buttonClickGetAccountInfo = By.xpath("(//span[@class='h-nav__link-text' " +
                    "and text()='Account Information'])[2]");
            public static By wrapperClickName =
                    By.xpath("//div[@class='h-list-group-item h-list-group-item--clickable']" +
                            "//div[@class='h-list-group__content-wrapper']/p[@data-msgid='Name']/following-sibling::" +
                            "div[@class='text-md-left text-sm-right text-left']");
            public static By locatorNameWait =
                    By.xpath("//div[@class='h-list-group-item h-list-group-item--clickable']" +
                            "//div[@class='h-list-group__content-wrapper']/p[@data-msgid='Name']/following-sibling::" +
                            "div[@class='text-md-left text-sm-right text-left']");
            public static By textAddFirstName = By.xpath("//hp-form-field[@name='firstName']");
            public static By elementWaitNameBox = By.xpath("//hp-form-field[@name='firstName']");
            public static By elementNameBoxClick = By.xpath("//hp-form-field[@name='firstName']");
            public static By locatorWaitAccountTab =
                    By.xpath("//button[@class='header__user-profile button-plain header__icon']");
            public static By elementLastNameBoxClick = By.xpath("//hp-form-field[@name='lastName']");
            public static By textBoxLastNameClear = By.xpath("//hp-form-field[@name='lastName']");
            public static By textAddLastName = By.xpath("//hp-form-field[@name='lastName']");
            public static By doubleClickOnFirstNameBox = By.xpath("//hp-form-field[@name='firstName']");
            public static By doubleClickOnLastNameBox = By.xpath("//hp-form-field[@name='lastName']");
            public static By buttonClickContinue =
                    By.xpath("//button[@class='h-button-v2' " +
                            "and @data-qa='hpanel_tracking-personal-information-continue_button']");
            public static By textAddPassword = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By buttonClickConfirm =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-confirm_button']");
            public static By passwordBoxElementWait = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By passwordBoxElementClick = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By readTextFullName =
                    By.xpath("//div[@class='text-md-left text-sm-right text-left' and text()='John Wick']");
        }

        public class UpdatePhoneNumberPage {
            public static By PhoneGroupElementClick =
                    By.xpath("//p[@data-msgid='Phone number' and text()='Phone number']");
            public static By elementPhoneBoxClick = By.xpath("//hp-form-field[@name='phone']");
            public static By textAddPhoneNumber = By.xpath("//hp-form-field[@name='phone']");
            public static By elementPhoneBox2 =
                    By.xpath("//p[@data-msgid='Phone number' and text()='Phone number']");
            public static By phoneNumberGroupClick = By.xpath("//hp-form-field[@name='phone']");
            public static By buttonClickConfirmChanges =
                    By.xpath("//button[@data-v-2fe5f685 " +
                            "and @data-qa='hpanel_tracking-personal-information-continue_button']");
            public static By textAddPassword = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By buttonClickConfirm =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-confirm_button']");
            public static By passwordBoxElementWait = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By passwordBoxElementClick =
                    By.xpath("//hp-form-field[@name='currentPassword']");
            public static By textReadPhoneNumber =
                    By.xpath("//div[@class='text-md-left text-sm-right text-left' " +
                            "and text()='+370 123123']");
        }

        public class AdditionalInfoPage {

            public static By passwordBoxElementWait = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By passwordBoxElementClick = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By textAddPassword = By.xpath("//hp-form-field[@name='currentPassword']");
            public static By elementAdditionalDetailsGroup =
                    By.xpath("//p[@data-msgid='Additional details']");
            public static By buttonClickOnAdditionalDetailsGroup =
                    By.xpath("//p[@data-msgid='Additional details']");
            public static By elementTextBox =
                    By.xpath("//div[@data-v-577ee0b7='' " +
                            "and @class='personal-information__inputs']//hp-form-field[@name='additionalDetails']");
            public static By textAddToTextBox =
                    By.xpath("//div[@data-v-577ee0b7='' " +
                            "and @class='personal-information__inputs']//hp-form-field[@name='additionalDetails']");
            public static By buttonClickContinueAtInfoField =
                    By.xpath("//button[@data-v-2fe5f685 and @data-v-577ee0b7 " +
                            "and @class='h-button-v2' and @hp-form-submit " +
                            "and @data-qa='hpanel_tracking-personal-information-continue_button']");
            public static By textReadMessage =
                    By.xpath("//div[contains(text(), " +
                            "'Why did the candidate bring a ladder to the job interview?')]");
            public static By elementTextBoxWait =
                    By.xpath("//div[@data-v-577ee0b7='' " +
                            "and @class='personal-information__inputs']//hp-form-field[@name='additionalDetails']");
            public static By buttonConfirmClick =
                    By.xpath("//button[@data-qa='hpanel_tracking-personal-information-confirm_button']");
        }
    }
}
