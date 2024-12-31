package SelenuimPO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public interface LoginPage {
    void login(String username,String password);
    void rememberMe();
    void resetPassword();
//public class LoginPage {
//    private LoginStrategy loginStrategy;
//    public LoginPage(LoginStrategy loginStrategy){ \\Using DIP
//        this.loginStrategy =  loginStrategy;
//    }
//
//    public void login(String username, String password){
//        loginStrategy.login(username,password);
//    }
}
