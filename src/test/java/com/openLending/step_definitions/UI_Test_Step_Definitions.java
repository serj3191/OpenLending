package com.openLending.step_definitions;

import com.openLending.pages.GooglePage;
import com.openLending.pages.LinkedInPage;
import com.openLending.utilities.ConfigurationReader;
import com.openLending.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class UI_Test_Step_Definitions {

GooglePage googlePage = new GooglePage();
LinkedInPage linkedInPage = new LinkedInPage();

    @When("user is on Google page")
    public void user_is_on_google_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("URL"));
    }

    @When("user searches for {string}")
    public void user_searches_for(String string) {
googlePage.getUserInput().sendKeys(string+ Keys.ENTER);

    }
    @When("user sees LinkedIn page of the company")
    public void user_sees_linked_in_page_of_the_company() {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(googlePage.getLinkedIn_Page());
    }
    @When("user clicks on LinkedIn page link")
    public void user_clicks_on_linked_in_page_link() {
   googlePage.getLinkedIn_Page().click();
    }
    @Then("user is redirected to that page")
    public void user_is_redirected_to_that_page() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("linkedin"));
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("open-lending"));
    }
    @Then("user sees {string} message under the logo")
    public void user_sees_message_under_the_logo(String string) {
Assert.assertEquals(linkedInPage.getText().getText(),string);
    }


}
