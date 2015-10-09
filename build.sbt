organization := "com.goshoplane"

name := "sbt-standard-libraries"

version := "0.1.2"

scalaVersion := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

sbtPlugin := true

publishMavenStyle := true

scriptedSettings

scriptedLaunchOpts <<= (scriptedLaunchOpts, version) { case (s,v) => s ++
  Seq("-Xmx1024M", "-Dplugin.version=" + v)
}

scriptedBufferLog := false