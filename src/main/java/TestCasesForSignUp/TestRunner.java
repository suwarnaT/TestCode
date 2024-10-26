package TestCasesForSignUp;
import cucumber.api.CucumberOptions;

@CucumberOptions(
	    plugin = "json:target/cucumber-report.json",
	    features = "Project/Feature/feature.feature",
	    glue="StepsDefeinitionsForSignUpPage"
	    )
public class TestRunner extends AbstractTestNGCucumberTests 
{

}