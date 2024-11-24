package steps;

import org.junit.runner.RunWith;

import io.cucumber.core.backend.Glue;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)	
@CucumberOptions(features= {".//features/"},
glue="steps",
plugin = {"pretty","html:reports/myreport.html"},
dryRun = false,
monochrome = false,
publish=true,
tags = "@sanity or @multi"

)

public class TestRunner {

}
