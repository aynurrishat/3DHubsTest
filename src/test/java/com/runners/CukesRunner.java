package com.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

   features = "src/test/resources/features",
       plugin = {"json:target/cucumber.json"},
        glue = "com/stepdefs",
        dryRun=false,
        tags="@test"
)

public class CukesRunner {


}
