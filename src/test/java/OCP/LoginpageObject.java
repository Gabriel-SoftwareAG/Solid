package OCP;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginpageObject {
    private WebDriver driver;

    public void login(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login")).click();
    }
}
