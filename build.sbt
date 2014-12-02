name := """sbt-scoverage-issue"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.2"

libraryDependencies += "com.softwaremill.macwire" %% "macros" % "0.7.3"

libraryDependencies += "com.softwaremill.macwire" %% "runtime" % "0.7.3"