scalaVersion := "2.12.4"
addCompilerPlugin("org.scalameta" % "semanticdb-scalac" % "3.7.4" cross CrossVersion.full)
scalacOptions += "-Yrangepos"
