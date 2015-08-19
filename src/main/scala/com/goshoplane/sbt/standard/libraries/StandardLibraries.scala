package com.goshoplane.sbt.standard.libraries

import sbt._
import Keys._


object StandardLibraries extends StandardLibraries

/**
 * This maintains common libraries and their versions
 * to be used like a standard.
 */
trait StandardLibraries {

  val StandardResolvers = Seq(
    "anormcypher"            at "http://repo.anormcypher.org/",
    "Akka Repository"        at "http://repo.akka.io/releases",
    "Spray Repository"       at "http://repo.spray.io/",
    "twitter-repo"           at "http://maven.twttr.com",
    "Typesafe Repository"    at "http://repo.typesafe.com/typesafe/releases/",
    "Sonatype repo"          at "https://oss.sonatype.org/content/groups/scala-tools/",
    "Sonatype releases"      at "https://oss.sonatype.org/content/repositories/releases",
    "Sonatype snapshots"     at "https://oss.sonatype.org/content/repositories/snapshots",
    "Sonatype staging"       at "http://oss.sonatype.org/content/repositories/staging",
    "softprops-maven"        at "http://dl.bintray.com/content/softprops/maven",
    "Local Maven Repository" at "file://" + Path.userHome.absolutePath + "/.m2/repository"
  )

  object Version {
    val scala           = "2.11.7"
    val lucene          = "5.2.1"
    val akka            = "2.3.12"
    val scalaz          = "7.1.3"
    val fastutil        = "7.0.7"
    val twitterUtil     = "6.25.0"
    val slf4j           = "1.7.12"
    val scallop         = "0.9.5"
    val commonsLang     = "3.4"
    val bijection       = "0.8.1"
    val guava           = "18.0"
    val logback         = "1.1.2"
    val scaldi          = "0.3.2"
    val retry           = "0.2.0"
    val odelay          = "0.1.0"
    val phantom         = "1.10.1"
    val play            = "2.4.2"
    val kafka           = "0.8.2.1"
    val curator         = "2.8.0"
    val scalatest       = "2.2.4"
  }


  object Libs {

    ////////////////////////// Lucene /////////////////////////

    val lucene = Seq (
      "org.apache.lucene" % "lucene-core"             % Version.lucene,
      "org.apache.lucene" % "lucene-analyzers-common" % Version.lucene,
      "org.apache.lucene" % "lucene-queries"          % Version.lucene,
      "org.apache.lucene" % "lucene-queryparser"      % Version.lucene
    )

    ////////////////////////// Akka /////////////////////////
    val akka = Seq (
      "com.typesafe.akka" %% "akka-slf4j" % Version.akka,
      "com.typesafe.akka" %% "akka-actor" % Version.akka)


    val akkaCluster = Seq (
      "com.typesafe.akka" %% "akka-cluster" % Version.akka)

    val akkaContrib = Seq (
      "com.typesafe.akka" %% "akka-contrib" % Version.akka)


    val akkaMultiNodeTestkit = Seq(
      "com.typesafe.akka" %% "akka-multi-node-testkit" % Version.akka)


    ////////////////////////// Scalaz /////////////////////////

    val scalaz = Seq (
      "org.scalaz" %% "scalaz-core" % Version.scalaz)


    ////////////////////////// fastutil /////////////////////////

    val fastutil = Seq (
      "it.unimi.dsi" % "fastutil" % Version.fastutil)


    ////////////////////////// twitterUtil /////////////////////////

    val twitterUtil = Seq (
      "com.twitter" %% "util-core" % Version.twitterUtil)


    ////////////////////////// slf4j /////////////////////////

    val slf4j = Seq (
      "org.slf4j" % "slf4j-api" % Version.slf4j)


    ////////////////////////// Scallop /////////////////////////

    val scallop = Seq (
      "org.rogach" %% "scallop" % Version.scallop)


    ////////////////////////// CommonsLang3 /////////////////////////

    val commonsLang = Seq (
      "org.apache.commons" % "commons-lang3" % Version.commonsLang)


    ////////////////////////// Bijection /////////////////////////

    val bijection = Seq (
      "com.twitter" %% "bijection-core" % Version.bijection,
      "com.twitter" %% "bijection-util" % Version.bijection)

    val bijectionGuava = Seq(
      "com.twitter" %% "bijection-guava" % Version.bijection)

    val bijectionNetty = Seq(
      "com.twitter" %% "bijection-netty" % Version.bijection)


    ////////////////////////// Guava /////////////////////////

    val guava = Seq (
      "com.google.guava" % "guava" % Version.guava)


    ////////////////////////// Logback /////////////////////////

    val logback = Seq (
      "ch.qos.logback" % "logback-core"    % Version.logback,
      "ch.qos.logback" % "logback-classic" % Version.logback)


    ////////////////////////// Scaldi /////////////////////////

    val scaldi = Seq (
      "org.scaldi" %% "scaldi" % Version.scaldi)

    val scaldiAkka = Seq (
      "org.scaldi" %% "scaldi-akka" % Version.scaldi)


    ////////////////////////// retry /////////////////////////

    val retry = Seq (
      "me.lessis" %% "retry" % Version.retry)


    ////////////////////////// odelay /////////////////////////

    val odelayCore = Seq (
      "me.lessis" %% "odelay-core" % Version.odelay)


    ////////////////////////// Phantom /////////////////////////

    val phantom = Seq (
      "com.websudos" %% "phantom-dsl" % Version.phantom,
      "com.websudos" %% "phantom-udt" % Version.phantom)


    ////////////////////////// Play /////////////////////////

    val playJson = Seq (
      "com.typesafe.play" %% "play-json" % Version.play)


    ////////////////////////// Apache Kafka /////////////////////////

    val kafka = Seq (
      "org.apache.kafka" %  "kafka-clients" % Version.kafka,
      "org.apache.kafka" %% "kafka"         % Version.kafka)


    ////////////////////////// Apache Curator /////////////////////////

    val curator = Seq(
      "org.apache.curator" % "curator-framework" % Version.curator exclude("log4j", "log4j") exclude("org.slf4j", "slf4j-log4j12"),
      "org.apache.curator" % "curator-recipes"   % Version.curator exclude("log4j", "log4j") exclude("org.slf4j", "slf4j-log4j12"))

    val curatorTest = Seq(
      "org.apache.curator" % "curator-test" % Version.curator % "test")


    ////////////////////////// Scalatest /////////////////////////

    val scalatest = Seq(
      "org.scalatest" %% "scalatest" % Version.scalatest % "test")

  }

}