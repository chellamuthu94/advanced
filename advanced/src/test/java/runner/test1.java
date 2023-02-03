package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class test1 {

@CucumberOptions(features="src/test/resources/feature",glue ="stepcalender",plugin = {"json:test-output/cucumber-reports/Cucumber.json","html:test-output/cucumber-reports/cucumber.html","testng:test-output/cucumber-reports/Cucumber.testng"})

public class runner1 extends AbstractTestNGCucumberTests{
                
}
}
