package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json"}, features="Features", glue="definitions", tags= {"@Sanity"})
public class OnlineShopRunner {

}
