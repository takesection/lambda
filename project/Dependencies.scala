import sbt._

object Dependencies {

  val lambda = "com.amazonaws" % "aws-lambda-java-core" % "1.1.0"

  val commonDeps = Seq()
  
  val appDeps = Seq(lambda)
}