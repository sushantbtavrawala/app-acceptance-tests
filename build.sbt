name := "app-acceptance-tests"

version := "1.0"

scalaVersion := "2.11.7"


libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-library" % "2.11.7",
  "info.cukes" % "cucumber-junit" % "1.2.4",
  "info.cukes" % "cucumber-picocontainer" % "1.2.4",
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test",
  "org.apache.poi" % "poi-ooxml" % "3.13",
  "org.apache.poi" % "poi-ooxml-schemas" % "3.13",
  "log4j" % "log4j" % "1.2.17",
  "net.sourceforge.htmlunit" % "htmlunit" % "2.19" ,
  "org.seleniumhq.selenium" % "htmlunit-driver" % "2.28",
  "org.seleniumhq.selenium" % "selenium-java" % "3.6.0",
  "org.seleniumhq.selenium" % "selenium-firefox-driver" % "3.6.0",
  "com.typesafe.play" %% "play-iteratees" % "2.4.6",
  "com.typesafe.play" %% "play-json" % "2.4.6",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",
  "org.pegdown" % "pegdown" % "1.6.0" % "test",
  "org.scalatest" %% "scalatest" % "2.2.4",
  "com.netaporter" %% "scala-uri" % "0.4.14",
  "io.appium" % "java-client" % "3.1.0",
  "com.applitools" % "eyes-selenium-java" % "2.19",
  "com.fasterxml.jackson.core" % "jackson-databind" % "2.7.2",
  "com.fasterxml.jackson.module" % "jackson-module-scala_2.10" % "2.7.2"

)
