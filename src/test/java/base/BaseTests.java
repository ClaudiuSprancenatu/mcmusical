package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

public class BaseTests {
    public WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void SetUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        goHome();
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void goHome(){
        driver.get("https://www.mcmusic.ro/");
    }
}
