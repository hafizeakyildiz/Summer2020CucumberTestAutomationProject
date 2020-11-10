package com.vytrack.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "json:target/JSONReports/report.json",
                "junit:target/JUnitReports/report.xml",
                "html:target/HtmlReports",
                "rerun:target/rerun.txt",
                "html:target/cucumber-report.html"},
        features = "src/test/resources/features",
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags ="@negative_login",
        publish= true
)
public class CucumberRunner {
    //We do not need anything inside this class
}
