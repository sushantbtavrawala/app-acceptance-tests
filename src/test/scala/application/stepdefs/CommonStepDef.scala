package application.stepdefs

import cucumber.api.scala.{EN, ScalaDsl}
import org.openqa.selenium.firefox.FirefoxDriver
import org.junit.Assert._
import application.utility.Configuration._
import org.openqa.selenium.By
class CommonStepDef extends ScalaDsl with EN {

  val driver = application.utility.Browser.instance
  val ebayHome = application.utility.Configuration.setting.url

  Given("""^I navigate to the ebay home page$""") { () =>
    driver.get(ebayHome)
  }

  Then("""^I will be on the "(.*)" page$""") { (pageTitle: String) =>
    assertTrue(driver.getTitle.contains(pageTitle))
  }

  When("""^I click on the "(.*)" link""") { (pageTitle: String) =>
    driver.findElement(By.linkText(pageTitle)).click()
  }
}