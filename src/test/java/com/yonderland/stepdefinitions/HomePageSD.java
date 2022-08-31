package com.yonderland.stepdefinitions;

import com.yonderland.base.BasePage;
import com.yonderland.base.ConfigReader;
import com.yonderland.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class HomePageSD {
    @Given("User is on the home page")
    public void userIsOnTheHomePage() { BasePage.initializeDriver(); }

    @When("get home page url")
    public void getHomePageUrl() throws InterruptedException{ System.out.println("Yondarland Home Page URL: "  + HomePage.getHomepageURL());
        Thread.sleep(2000);
    }

    @And("verify if url is expected")
    public void verifyIfUrlIsExpected() throws InterruptedException{
        String expectedURL = ConfigReader.getProperty("url");
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        Thread.sleep(2000);
    }

    @And("get home page title")
    public void getHomePageTitle() throws InterruptedException {
        System.out.println(" Expected Title: " + HomePage.getHomepageTitle());
        Thread.sleep(2000);
    }

    @And("verify if title is expected")
    public void verifyIfTitleIsExpected() throws InterruptedException{
        String expectedTitle = "Yonderland — premium brands and retail concepts focused on outdoor";
        Assert.assertEquals(expectedTitle, HomePage.getHomepageTitle());
        Thread.sleep(2000);
    }

    @Then("User click yonderlandLogo button")
    public void userClickYonderlandLog() throws InterruptedException{
        HomePage.clickYonderlandLogo();
        Thread.sleep(2000);
    }

    @And("Test Ayacucho logo page button")
    public void testAyacuchoLogoPageButton() throws InterruptedException{
        HomePage.clickAyacucho();
    }

    @Then("User sees Ayacucho page")
    public void userSeesAyacuchoPage() {
        String expectedURL = "https://www.ayacucho-outdoor.com/";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL: " + HomePage.verifyURL());
    }

    @And("Test Juttu logo page button")
    public void testJuttuLogoPageButton() throws InterruptedException{
        HomePage.clickYuttu();
    }

    @Then("User sees Juttu page")
    public void userSeesJuttuPage() {
        String expectedURL = "https://www.juttu.be/nl.html";
        Assert.assertEquals(expectedURL, HomePage.verifyURL());
        System.out.println("Expected URL: " + HomePage.verifyURL());
    }
}
