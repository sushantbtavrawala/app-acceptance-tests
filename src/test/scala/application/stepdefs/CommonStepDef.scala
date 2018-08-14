package application.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.firefox.FirefoxDriver
import org.junit.Assert._
import application.utility.Configuration._
class CommonStepDef extends ScalaDsl with EN {

  val driver = application.utility.Browser.instance
  val ebayHome =  application.utility.Configuration.setting.url

  Given("""^I navigate to the "(.*)" page$""") { (pageTitle: String) =>
    driver.get(ebayHome)
  }

  Then("""^I will be on the "(.*)" page$""") { (pageTitle: String) =>
    assertTrue(driver.getCurrentUrl.equals("https://www.ebay.co.uk/"))
  }
}
