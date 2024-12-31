package SelenuimPO;

import org.openqa.selenium.WebDriver;

public class NavigationHelper {
    WebDriver driver;
    public NavigationHelper(WebDriver driver){
        this.driver = driver;
    }

    public void navigateTo(String url){
        driver.get(url);
    }
}
