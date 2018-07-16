package application.stepdefs

import cucumber.api.DataTable
import cucumber.api.scala.{EN, ScalaDsl}
import org.junit.Assert.{assertFalse, assertTrue}
import org.openqa.selenium.{By, WebDriver}
import org.scalatest.tags.FirefoxBrowser


class CommonStepDef extends ScalaDsl with EN {

  Given("""^I navigate to the "(.*)" page$""") { (pageTitle: String) =>


  }

  Then("""^I will be on the "(.*)" page$""") { (pageTitle: String) =>

  }
}
