package SelenuimPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ErrorVerifier {
    WebDriver driver;

    public ErrorVerifier(WebDriver driver){
        this.driver = driver;
    }

    public String getErrorMessage(){
        return driver.findElement(By.id("error")).getText();
    }
}
