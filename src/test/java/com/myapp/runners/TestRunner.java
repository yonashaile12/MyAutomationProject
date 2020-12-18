package com.myapp.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        plugin = {
                "json:target/cucumber.json"
        },
        features = "src/test/resources",
        glue = "com/myapp/step_definitions",
        dryRun = false
)
public class TestRunner {
}
