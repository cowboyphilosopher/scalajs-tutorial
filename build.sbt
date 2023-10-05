enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.12.11"
resolvers ++= Seq(
    "jitpack" at "https://jitpack.io",
    "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
  )

// This is an application with a main method
scalaJSUseMainModuleInitializer := true

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.2.0"
libraryDependencies += "com.github.rchain" % "kalium" % "0.8.1"
//libraryDependencies += "coop.firefly" %% "secp256k1-java-dylib" % "0.1-SNAPSHOT"
libraryDependencies += "com.github.rchain" % "secp256k1-java" % "0.1"
libraryDependencies += "io.f1r3fly" % "compiler_2.12" % "0.1.0-SNAPSHOT" from "file:/Users/btcmac/.m2/repository/io/f1r3fly/compiler_2.12-0.1.0-SNAPSHOT.jar/0.1.0-SNAPSHOT.jar"
libraryDependencies += "io.f1r3fly" % "rholang_2.12" % "0.1.0-SNAPSHOT" from "file:/Users/btcmac/.m2/repository/io/f1r3fly/rholang_2.12-0.1.0-SNAPSHOT.jar/0.1.0-SNAPSHOT.jar"
libraryDependencies += "io.f1r3fly" % "mettal_2.12" % "0.1.0-SNAPSHOT" from "file:/Users/btcmac/.m2/repository/io/f1r3fly/mettal_2.12-0.1.0-SNAPSHOT.jar/0.1.0-SNAPSHOT.jar"

// Add support for the DOM in `run` and `test`
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.7.9" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")
