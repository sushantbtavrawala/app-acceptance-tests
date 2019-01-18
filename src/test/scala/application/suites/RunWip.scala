package application.suites

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.AfterClass
import org.junit.runner.RunWith

@RunWith(classOf[Cucumber])
@CucumberOptions(
  dryRun=false,
  monochrome=false,
  features =Array("src/test/resources/features"),
  glue = Array("application.stepdefs"),
  format = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags = Array("@wip")
)
class RunWip {

}


