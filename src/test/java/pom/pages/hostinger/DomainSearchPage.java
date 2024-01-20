package pom.pages.hostinger;

import pom.pages.Common;
import pom.pages.Locator;

public class DomainSearchPage {
    public static void openUrl(String url) {
        Common.setUpChrome();
        Common.openUrl(url);
    }

    public static void clickOnDomainSection() {
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.spanDomains);
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.spanDomains);
    }

    public static void inputDomainNameToSeachBox(String domainName) {
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.formFieldDomainName);
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.formFieldDomainName);
        Common.addText(Locator.Hostinger.DomainSearchPage.formFieldDomainName, domainName);
    }

    public static void buttonClickSearch() {
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.buttonSearch);
    }

    public static String readIsDomainAvailable() {
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.spanAiDomain);
        return Common.getText(Locator.Hostinger.DomainSearchPage.spanAiDomain);
    }

    public static void clickOnBuyDomain() {
        Common.scrollWindowByActionsPlus3500Y();
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.buttonBuyDomain);
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.buttonBuyDomain);
    }

    public static String readTotalPrice() {
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.paragraphPrice);
        return Common.getText(Locator.Hostinger.DomainSearchPage.paragraphPrice);
    }
}
