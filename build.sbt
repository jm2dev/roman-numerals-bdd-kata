name := "bdd kata"

organization := "com.jm2dev.kata"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.10.0-RC2" 

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.10.0-RC2" % "2.0.M5" % "test"
)

initialCommands := "import com.jm2dev.kata.bddkata._"
