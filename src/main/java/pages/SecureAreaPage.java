package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecureAreaPage {

    private WebDriver driver;
    private By statusAlert = By.className("user-cover");
    private By statusError = By.className("error");

    public SecureAreaPage(WebDriver driver){
        this.driver = driver;
    }

    public String getAlertText(){
       return driver.findElement(statusAlert).getText();
    }

    public String getErrorText(){
        return driver.findElement(statusError).getText();
    }

}
