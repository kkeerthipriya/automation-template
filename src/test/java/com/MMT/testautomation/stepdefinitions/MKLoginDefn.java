package com.MMT.testautomation.stepdefinitions;

import com.MMT.testautomation.steps.MKLoginSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MKLoginDefn {

    MKLoginSteps mkLoginSteps=new MKLoginSteps();


    @Given("^I am valid user$")
    public void i_am_Valid_user() throws Throwable {
        mkLoginSteps.openBrowser();
    }

    @When("^I click on the make my trip URL$")
    public void i_click__on_the_make_my_trip() throws Throwable {

    }

    @Then("^I should see the homepage of make my trip$")
    public void i_should_login_to_the_forever_new_website() throws Throwable {
    }



}
