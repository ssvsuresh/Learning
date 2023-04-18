package TestRunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="FeatureFiles/UserRegestration.feature", glue = "StepDefinitions",
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/userregistration.html"})
public class UserRegistrationTest 
{

}
