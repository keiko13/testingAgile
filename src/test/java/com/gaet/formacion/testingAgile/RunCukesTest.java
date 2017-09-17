package com.gaet.formacion.testingAgile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java", glue = "cucumb.features")
public class RunCukesTest {


}
