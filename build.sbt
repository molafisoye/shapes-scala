name := "shapes-oo-scala"

version := "0.3"

scalaVersion := "3.0.0-RC2"

scalacOptions ++= Seq("-deprecation", "-feature", "-unchecked")

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "3.2.7"  % Test,
  "org.scalacheck" %% "scalacheck" % "1.15.3" % Test
)
