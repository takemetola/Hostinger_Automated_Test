package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.UserCredentials;
import pom.pages.hostinger.AdditionalInfoPage;
import pom.pages.hostinger.LoginInfo;
import pom.tests.TestBase;

public class AdditionalInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AdditionalInfoPage.openUrl("https://www.hostinger.com");

        String email = UserCredentials.getEmail();
        String password = UserCredentials.getPassword();

        LoginInfo.login(email, password);
    }

    @DataProvider(name = "testAddingMoreInfoToProfile")
    public static Object[][] provideDataForTestAddingMoreInfoToProfile() {
        return new Object[][]{
                {"because it is worth doing it...", "Testas123!", "because it is worth doing it..."}
        };
    }

    @Test(dataProvider = "testAddingMoreInfoToProfile")
    public void testAddingMoreInfoToProfile(String text, String password, String expectedResult) throws InterruptedException {

        String actualResult;
        AdditionalInfoPage.clickOnAccountIcon();
        AdditionalInfoPage.clickonAccountInfomation();
        AdditionalInfoPage.clickOnAdditionalDetailsGroup();
        AdditionalInfoPage.addTextToTextBox(text);
        AdditionalInfoPage.clickOnContinueButtonAdditionlInfoField();
        AdditionalInfoPage.addTextConfirmPassword(password);
        AdditionalInfoPage.clickOnConfirmButton();

        Thread.sleep(2000);
        actualResult = AdditionalInfoPage.readTextMessage();

        Assert.assertEquals(actualResult, expectedResult);
    }
}
