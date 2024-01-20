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
    public void testDomainSearchAndShoppingCartFunctionality(String domainName, String expectedResult) {

        String actualResult;

        DomainSearchPage.clickOnDomainSection();
        DomainSearchPage.inputDomainNameToSeachBox(domainName);
        DomainSearchPage.buttonClickSearch();
        String expectedResul1 = DomainSearchPage.readIsDomainAvailable();

        if (expectedResul1==expectedResul1) {
            System.out.println("Domain with %s was found.".formatted(expectedResul1));
        }
        else {
            System.out.println("Domain not found. Test Terminated.");
            System.exit(0);
        }

        DomainSearchPage.clickOnBuyDomain();

        actualResult = DomainSearchPage.readTotalPrice();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
