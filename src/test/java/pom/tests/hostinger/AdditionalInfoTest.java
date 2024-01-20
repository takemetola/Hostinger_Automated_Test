package pom.tests.hostinger;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pom.pages.hostinger.AdditionalInfoPage;
import pom.pages.hostinger.UpdateProfileNamePage;
import pom.tests.TestBase;

public class AdditionalInfoTest extends TestBase {
    @BeforeMethod
    @Override
    public void setUp() {
        AdditionalInfoPage.openUrl("https://www.hostinger.com");

        String email = "desire2work4hostinger@gmail.com";
        String password = "Testas123!";

        UpdateProfileNamePage.clickOnButtonLogin();
        UpdateProfileNamePage.inputEmail(email);
        UpdateProfileNamePage.inoutPassword(password);
        UpdateProfileNamePage.clickOnButtonLoginAccount();

        UpdateProfileNamePage.clickOnAccountIcon();
        UpdateProfileNamePage.clickonAccountInfomation();
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
