import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "score"
    val appVersion      = "1.0"

    val appDependencies = Seq(
        
        "mysql" % "mysql-connector-java" % "5.1.18",
        "org.squeryl" %% "squeryl" % "0.9.4",
        "org.scalatest" %% "scalatest" % "1.6.1" % "test",
        "asm" % "asm-all" % "2.2",
        "org.scala-lang" % "scala-swing" % "2.9.1",
        "postgresql" % "postgresql" % "8.4-701.jdbc4"
        
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*).settings(
      // Add your own project settings here      
    )

}
