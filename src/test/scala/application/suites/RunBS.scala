package application.suites

import cucumber.api.CucumberOptions
import cucumber.api.junit.Cucumber
import org.junit.runner.RunWith

/**
  * Created by anuja on 18/01/19.
  */
@RunWith(classOf[Cucumber])
@CucumberOptions(
  dryRun=false,
  monochrome=true,
  features =Array("src/test/resources/features"),
  glue = Array("application.stepdefs"),
  format = Array("pretty", "html:target/cucumber", "json:target/cucumber.json"),
  tags = Array("@browserstack")
)
class RunBS {

}
