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

    public static void inputDomainNameToSearchBox(String domainName) {
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.formFieldDomainName);
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.formFieldDomainName);
        Common.addText(Locator.Hostinger.DomainSearchPage.formFieldDomainName, domainName);
    }

    public static void buttonClickSearch() {
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.buttonSearch);
    }


    public static void clickOnBuyDomain() {
        Common.clickOnElement(Locator.Hostinger.DomainSearchPage.buttonBuyDomain);
    }

    public static String readTotalPrice() {
        Common.waitForElementToBeVisible(Locator.Hostinger.DomainSearchPage.paragraphPrice);
        return Common.getText(Locator.Hostinger.DomainSearchPage.paragraphPrice);
    }

    public static void readIfDomainAvailable(String expectedResult1) throws InterruptedException {
        Thread.sleep(5000);
        Common.scrollWindowByActionsPlus3500Y2();
        Thread.sleep(2000);
        String domainName = Common.getText(Locator.Hostinger.DomainSearchPage.getDomainNameAi);

        if (expectedResult1.equals(domainName)) {
            System.out.println("Domain with %s was found.".formatted(expectedResult1));
        } else {
            System.out.println("Domain .ai not found. Test Terminated.");
            //System.exit(0);
        }
    }
}
