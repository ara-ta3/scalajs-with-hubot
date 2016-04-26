enablePlugins(ScalaJSPlugin)

name := "Scala js in Hubot"

scalaVersion := "2.11.7"

scalaJSOutputWrapper := ("var __ScalaJSEnv = { exportsNamespace: exports };", "")
