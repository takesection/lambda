import sbt._

object Dependencies {

  val lambda = "com.amazonaws" % "aws-lambda-java-core" % "1.1.0"

  val junit = "junit" % "junit" % "4.12"
  val junitInterface = "com.novocode" % "junit-interface" % "0.11"

  val commonDeps = Seq(
    junit % Test,
    junitInterface % Test
  )
  
  val appDeps = Seq(lambda)
}