package org.example.stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class D04_searchStepDef {
    P03_homePage home = new P03_homePage();

    @When("user click on search field")
    public void userClickOnSearchField() {
        home.searchField().click();
    }

    @And("user search with {string}")
    public void userSearchWith(String arg0) {
        home.searchField().sendKeys(arg0);
    }

    @Then("user could find {string} relative results")
    public void userCouldFindRelativeResults(String arg0) {
        home.searchBtn().click();

        for (int x = 0; x < home.searchResults().size(); x++) {
            String expectedResult = String.valueOf(arg0.toLowerCase());
            String actualResult = home.searchResults().get(x).getText().toLowerCase();
            System.out.println(actualResult);
            System.out.println(expectedResult);
            Assert.assertTrue(actualResult.contains(expectedResult));
            System.out.println(actualResult);
        }
    }

    @And("user search by {string}")
    public void userSearchBy(String arg0) {
        home.searchField().sendKeys(arg0);
    }

    @Then("user could find by {string} relative results")
    public void userCouldFindByRelativeResults(String arg0) {
        String itm = Hooks.driver.findElement(By.className("ui-menu-item-wrapper")).getText();
        Hooks.driver.findElement(By.className("ui-menu-item-wrapper")).click();
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(7));


        for (int x = 0; x < home.skuResults().size(); x++) {
            String expectedRes = String.valueOf(arg0.toLowerCase());
            String actualRes = home.skuResults().get(x).getText().toLowerCase();
            System.out.println(actualRes);
            System.out.println(expectedRes);
            Assert.assertTrue(actualRes.contains(expectedRes));
        }
    }
}
