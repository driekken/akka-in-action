import AssemblyKeys._

scalaVersion := "2.11.1"

resolvers ++= Seq("Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/",
                  "Sonatype snapshots"  at "http://oss.sonatype.org/content/repositories/snapshots/",
                  "Spray Repository"    at "http://repo.spray.io",
                  "Spray Nightlies"     at "http://nightlies.spray.io/")

libraryDependencies ++= {
  val akkaVersion       = "2.3.4"
  Seq(
    "com.typesafe.akka"       %%  "akka-actor"                     % akkaVersion,
    "com.typesafe.akka"       %%  "akka-slf4j"                     % akkaVersion,
    "com.typesafe.akka"       %%  "akka-testkit"                   % akkaVersion   % "test",
    "org.scalatest"           %% "scalatest"                       % "2.2.0"       % "test"
  )
}

lazy val chapter2=project

lazy val goticks=project in file("chapter6")

lazy val chanels=project in file("chapter-channels")

lazy val wordsCluster=project in file("chapter-cluster")

lazy val chapterFaultTolerance=project in file("chapter-fault-tolerance")

lazy val chapterFutures=project in file("chapter-futures")

lazy val chapterPerf=project in file("chapter-perf")

lazy val chapterRouting=project in file("chapter-routing")

lazy val chapterState=project in file("chapter-state")

lazy val chapterStructure=project in file("chapter-structure")

lazy val chapterTestdriven=project in file("chapter-testdriven")
