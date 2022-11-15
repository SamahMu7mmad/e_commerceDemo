package Pages;

import StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P02_login {
    public WebElement logBtn(){
        return Hooks.driver.findElement(By.className("ico-login"));
    }
    public WebElement userEmail(){
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement userPass(){
        return Hooks.driver.findElement(By.id("Password"));
    }

    public WebElement entrLogin(){
        return Hooks.driver.findElement(By.className("login-button"));
    }
    public void loginScc(){
        logBtn().click();
        userEmail().sendKeys();
        userPass().sendKeys();
        userPass().submit();
    }

}
