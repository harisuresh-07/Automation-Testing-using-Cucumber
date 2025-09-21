package test_runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;


import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "E:\\eclipse-workspace\\Cucumber_SwagLabs\\features\\login.feature",
    glue = "step_definition"
   
)

public class TestRunner {

}
