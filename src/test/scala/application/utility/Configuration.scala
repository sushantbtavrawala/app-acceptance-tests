package application.utility

/**
  * Created by anuja on 27/07/18.
  */
case class Settings(
                   url: String
                   )

object Configuration {

  lazy val environment: Enviornment.Name = {
    val envProperty = System.getProperty("enviornment", "local")

    envProperty match {
      case "local" => Enviornment.Local
      case "dev" => Enviornment.Dev
      case _ => throw new IllegalArgumentException(s"Enviornment '$envProperty' not known")
    }
  }

  lazy val setting: Settings = create()

  private def create(): Settings = {

    environment match {
      case Enviornment.Local => new Settings( url = "https://www.ebay.co.uk/")
      case Enviornment.Dev => new Settings( url = "")
      case Enviornment.Qa => new Settings( url = "")
      case _ =>  throw new IllegalArgumentException(s"Environment '$environment' not known")
    }
  }

  object Enviornment extends Enumeration {
    type Name = Value
    val Local, Qa, Staging, Dev = Value
  }

}