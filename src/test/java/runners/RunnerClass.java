package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //provide the path for features
        features="src/test/resources/features/",
        //provide the name of the folder that has the steps in it, it is case-sensitive
        glue = "steps",
        //If we do "dryRun" as "true", it stops the execution and give us the missing step definition(ideal for adding new scenarios).
        dryRun = false,
        //tags identify the scenarios in a group that will execute all scenarios having
        tags="@test123",
        //for generating the report
        plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json","rerun:target/failed.txt"}


)
public class RunnerClass {

}
