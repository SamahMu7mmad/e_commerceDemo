package org.example.stepDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class D03_currenciesStepDef {
    P03_homePage home = new P03_homePage();
    @Given("user select euro option")
    public void selectEuro(){
        WebElement currencyList = Hooks.driver.findElement(By.id("customerCurrency"));
        Select select = new Select(currencyList);
        select.selectByVisibleText("Euro");
    }

    @Then("euro symbol is displayed on all products")
    public void euroSymbolIsDisplayedOnAllProducts() {
        for(int x = 0; x<home.currencyList().size(); x++){
            String expectedResult = "€";
            String actualResult = home.currencyList().get(x).getText();
            Assert.assertTrue(actualResult.contains(expectedResult));
            System.out.println(actualResult);
        }
    }
}
