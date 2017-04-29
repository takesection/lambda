import Dependencies._
import sbt.Keys._

lazy val commonSettings = Seq(
  version := "$version$",
  organization := "jp.pigumer",
  scalaVersion := "2.12.1",
  libraryDependencies ++= commonDeps
)

lazy val root = (project in file("./modules/application")).
  settings(commonSettings: _*).
  settings(
    name := "aws-lambda-example",
    libraryDependencies ++= appDeps,
    assemblyJarName in assembly := "aws-lambda-example.jar"
  )
