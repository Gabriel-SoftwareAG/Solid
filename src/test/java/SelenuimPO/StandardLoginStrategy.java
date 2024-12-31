package SelenuimPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StandardLoginStrategy implements Login,RememberMe,ResetPassword{
    private WebDriver driver;

    public StandardLoginStrategy(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void login(String username, String password){
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("loginButton")).click();
    }

    @Override
    public void rememberMe() {

    }

    @Override
    public void resetPassword() {

    }
}
