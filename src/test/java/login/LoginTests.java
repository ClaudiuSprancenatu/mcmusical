package login;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureAreaPage;

public class LoginTests extends BaseTests {

    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickIntrainCont();
        loginPage.setUsername("sprancenatuc@yahoo.com");
        loginPage.setPassword("tobatama94C");
        SecureAreaPage secureAreaPage = loginPage.clickLoginButton();
        Assert.assertTrue(secureAreaPage.getAlertText().
                contains("In aceasta sectiune gasesti toate informatiile legate de contul tau si de comenzile efectuate."),
                "Alert text is incorrect!");
    }

}
