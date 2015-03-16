import sbt._
import sbt.Keys._

object ScalaDciDemoBuild extends Build {

  lazy val scaladci = Project(
    id = "scaladci",
    base = file("."),
    aggregate = Seq(scaladciDemo),
    settings = commonSettings ++ Seq(moduleName := "scaladci-demo-root")
  )

  lazy val scaladciDemo = Project(
    id = "scaladci-demo",
    base = file("demo"),
    settings = commonSettings ++ Seq(moduleName := "scaladci-demo")
  )

  lazy val commonSettings = Defaults.coreDefaultSettings ++ Seq(
    organization := "org.scaladci",
    version := "0.5.4",
    scalaVersion := "2.11.6",
    scalacOptions := Seq("-unchecked", "-deprecation", "-feature"),
    resolvers ++= Seq(Resolver.sonatypeRepo("releases"), Resolver.sonatypeRepo("snapshots")),
    libraryDependencies ++= Seq(
      "org.scaladci" %% "scaladci" % "0.5.4"
    ),
    addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)
  )
}