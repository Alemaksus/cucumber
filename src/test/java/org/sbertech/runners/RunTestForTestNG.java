package org.sbertech.runners;

//entry point for testng tests

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        glue = {"org.sbertech.stepDefinitions", "org.sbertech.typeRegistry"},
        features = "src/test/resources/features")
public class RunTestForTestNG extends AbstractTestNGCucumberTests {
}



