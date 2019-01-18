package application.utility


import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.firefox.FirefoxDriver
import scala.util.Try

/**
  * Created by anuja on 06/08/18.
  */
object Browser {

  val instance: WebDriver = InitialiseBrowser

  def InitialiseBrowser: WebDriver = {
    val driver = createDriver()
    driver
  }

  private def createDriver(): WebDriver = {
    val browserProperty = System.getProperty("browser", "firefox-local")

    browserProperty match {
      case "firefox-local" =>  new FirefoxDriver()
      case "chrome-local" => new ChromeDriver()
      case "browserstack" => BrowserStack.initialise()
      case _ => throw new IllegalArgumentException(s"Enviornment '$browserProperty' not known")
    }
  }

  sys addShutdownHook {

    Try(instance.quit())

  }

}


