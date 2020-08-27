name := "scala-02-01"

version := "0.1"

scalaVersion := "2.12.8"

scapegoatVersion in ThisBuild := "1.3.8"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.0" % "test"
)
