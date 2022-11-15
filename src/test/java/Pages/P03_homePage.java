package Pages;

import StepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    public List<WebElement> wishList(){
        List<WebElement>wishItms = Hooks.driver.findElements(By.className("add-to-wishlist-button"));
        return wishItms;
    }
}
