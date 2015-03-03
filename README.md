# ScalaDCI demo app

####Minimal project setup for using ScalaDCI

_See [Molecule](http://scaladci.org) website for more info._

Clone this repo and play around:

1. `git clone https://github.com/dci/scaladci-demo.git`
2. Open/import project in your IDE
3. Run `MoneyTransferApp`
4. Make your own Context, Roles and Interactions...


### ScalaDCI in your own project

Add the following to your project file:

```scala
libraryDependencies ++= Seq(
  "org.scaladci" %% "scaladci" % "0.5.2"
),
addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0-M5" cross CrossVersion.full)
```