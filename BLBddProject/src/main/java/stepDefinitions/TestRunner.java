package stepDefinitions;

import org.junit.runner.RunWith;
import org.testng.annotations.BeforeClass;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.TestNGCucumberRunner;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\Features",
glue= {"stepDefinitions"},
monochrome=true,
plugin= {"pretty","json:target/MyReports/report.json","junit:target/MyReports/report.xml"},
dryRun = false,
publish=true)

public class TestRunner extends AbstractTestNGCucumberTests{
	public TestNGCucumberRunner testNGCucumberRunner;
    @BeforeClass(alwaysRun = true)
    public void setUpCucumber() {
         testNGCucumberRunner = new TestNGCucumberRunner(this.getClass());
    }

}
