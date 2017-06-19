
lazy val commonSettings = Defaults.coreDefaultSettings ++ Seq(
  organization := "org.scaladci",
  version := "0.5.6",
  scalaVersion := "2.12.2",
  scalacOptions := Seq("-unchecked", "-deprecation", "-feature"),
  resolvers ++= Seq(Resolver.sonatypeRepo("releases"), Resolver.sonatypeRepo("snapshots")),
  libraryDependencies ++= Seq(
    "org.scaladci" %% "scaladci" % "0.5.6"
  ),
  addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
)

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
