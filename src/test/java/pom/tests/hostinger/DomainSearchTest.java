package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.UserCredentials;
import pom.pages.hostinger.DomainSearchPage;
import pom.pages.hostinger.LoginInfo;
import pom.tests.TestBase;

public class DomainSearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DomainSearchPage.openUrl("https://www.hostinger.com");

        String email = UserCredentials.getEmail();
        String password = UserCredentials.getPassword();

        LoginInfo.login(email, password);
    }
    @DataProvider(name = "testDomainSearchAndShoppingCartFunctionality")
    public static Object [][] provideDataForTestDomainSearchAndShoppingCartFunctionality() {
        return new Object [][]{
                {"mylatestproject", "$217.78"}
        };
    }

    @Test(dataProvider = "testDomainSearchAndShoppingCartFunctionality")
    public void testDomainSearchAndShoppingCartFunctionality(String domainName, String expectedResult) throws InterruptedException {

        String actualResult;
        String expectedResult1 = ".ai";

        DomainSearchPage.clickOnDomainSection();
        DomainSearchPage.inputDomainNameToSearchBox(domainName);
        DomainSearchPage.buttonClickSearch();
        DomainSearchPage.readIfDomainAvailable(expectedResult1);
        DomainSearchPage.clickOnBuyDomain();

        actualResult = DomainSearchPage.readTotalPrice();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
