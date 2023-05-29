name := "concurrency"

version := "1.0"

//ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.13"

lazy val root = (project in file("."))
  .settings(
    name := "concurrency-scala"
  )

libraryDependencies += "commons-io" % "commons-io" % "2.5"

libraryDependencies += "org.scala-lang.modules" %% "scala-async" % "1.0.1"

//libraryDependencies += "com.github.scala-blitz" %% "scala-blitz" % "1.2"

libraryDependencies += "com.netflix.rxjava" % "rxjava-scala" % "0.20.7"

libraryDependencies += "org.scala-lang.modules" %% "scala-swing" % "3.0.0"

libraryDependencies += "org.scala-stm" %% "scala-stm" % "0.11.1"

libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.8.0"

libraryDependencies += "com.typesafe.akka" %% "akka-remote" % "2.8.0"

//libraryDependencies += "com.storm-enroute" %% "scalameter-core" % "0.21"

libraryDependencies += "org.scalaz" %% "scalaz-concurrent" % "7.2.35"

//libraryDependencies += "com.typesafe.akka" %% "akka-stream-experimental" % "0.4"

//libraryDependencies += "com.quantifind" %% "wisp" % "0.0.4"

//libraryDependencies += "org.scalafx" %% "scalafx" % "1.0.0-R8"

//libraryDependencies += "com.storm-enroute" %% "reactive-collections" % "0.5"