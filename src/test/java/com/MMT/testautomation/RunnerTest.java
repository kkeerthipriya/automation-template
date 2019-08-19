package com.MMT.testautomation;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by Keerthi Parepalli on 19/08/2019.
 */


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "classpath:features/MKHomePage.feature",
        plugin = {"pretty", "html:target/cucumber-html-report"}


)
public class RunnerTest {

}
