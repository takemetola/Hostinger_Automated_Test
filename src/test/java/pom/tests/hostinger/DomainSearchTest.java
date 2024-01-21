package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.hostinger.DomainSearchPage;
import pom.pages.hostinger.UpdateProfileNamePage;
import pom.tests.TestBase;

public class DomainSearchTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        DomainSearchPage.openUrl("https://www.hostinger.com");

        String email = "desire2work4hostinger@gmail.com";
        String password = "Testas123!";

        UpdateProfileNamePage.clickOnButtonLogin();
        UpdateProfileNamePage.inputEmail(email);
        UpdateProfileNamePage.inoutPassword(password);
        UpdateProfileNamePage.clickOnButtonLoginAccount();
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
        DomainSearchPage.inputDomainNameToSeachBox(domainName);
        DomainSearchPage.readIfDomainAvailable(expectedResult1);
        DomainSearchPage.buttonClickSearch();

        DomainSearchPage.clickOnBuyDomain();

        actualResult = DomainSearchPage.readTotalPrice();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
