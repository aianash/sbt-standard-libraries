import sbt._
import sbt.Keys._
import com.goshoplane.sbt.standard.libraries.StandardLibraries

object Build extends sbt.Build with StandardLibraries {

  lazy val root = Project(
    id = "min-project",
    base = file("."),
    settings = Defaults.defaultSettings ++
      Seq(
        scalaVersion := "2.11.7",
        crossPaths := false,

        resolvers ++= StandardResolvers,

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