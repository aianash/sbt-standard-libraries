# Sbt Standard Libraries

This is a collection of libraries most commonly used at Shoplane.
The purpose is to bring uniformity in version and the libraries
used across services.

Hence this repo will be primarily used to keep up with the latest versions.

## Usage

**project/plugins.sbt**

```scala
addSbtPlugin("com.goshoplane" % "sbt-standard-libraries" % "0.1.0") // for sbt-0.13.x or higher
```

**project/Build.scala**

```scala
import sbt._
import sbt.Keys._
import com.goshoplane.sbt.standard.libraries.StandardLibraries

// INHERIT TO ACCESS THE LIBRARIES
object Build extends sbt.Build with StandardLibraries {

  lazy val root = Project(
    id = "min-project",
    base = file("."),
    settings = Defaults.defaultSettings ++
      Seq(
        scalaVersion := "2.11.7",
        crossPaths := false,

		// ADD RESOLVERS FOR THE STANDARD LIBRARIES
        resolvers ++= StandardResolvers,

		// INCLUDE DEPENDENCIES LIKE THESE
        libraryDependencies ++= Seq(
        ) ++ Libs.lucene
          ++ Libs.akka
          ++ Libs.akkaContrib
          ++ Libs.akkaCluster
          ++ Libs.akkaMultiNodeTestkit
          ++ Libs.scalaz
          ++ Libs.fastutil
          ++ Libs.twitterUtil
          ++ Libs.slf4j
          ++ Libs.scallop
          ++ Libs.commonsLang
          ++ Libs.bijection
          ++ Libs.bijectionGuava
          ++ Libs.bijectionNetty
          ++ Libs.guava
          ++ Libs.logback
          ++ Libs.scaldi
          ++ Libs.scaldiAkka
          ++ Libs.retry
          ++ Libs.odelayCore
          ++ Libs.phantom
          ++ Libs.playJson
          ++ Libs.kafka
          ++ Libs.curator
          ++ Libs.curatorTest
          ++ Libs.scalatest
      )
  )
}

```

## Current Libraries

1. Lucene
2. Akka Core
3. Akka Cluster
4. Akka Contrib
5. Akka Multi Node Testkit
6. Scalaz
7. Fastutil
8. Twitter Util
9. Slf4j
10. Scallop
11. Apache CommonsLang3
12. Twitter Bijection (Core, Guava, Netty)
13. Google Guava
14. Logback
15. Scaldi and ScaldiAkka
16. Retry and Odelay
17. Websudos Phantom
18. PlayJson
19. Apache Kafka
20. Apache Curator (including curator-test)
21. Scalatest
22. Akka Testkit
23. Caffeine
24. MapDB
25. Shoplane Commons
26. Onyx Core

## Adding new Libraries

1. Add to StandardLibraries class
2. To test, add them as dependency in sbt-test/sbt-standard-libraries/min-project/project/Build.scala
3. and then test it by running
```bash
> scripted
```
from root folder of the project.