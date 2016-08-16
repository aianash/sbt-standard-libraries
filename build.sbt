organization := "com.aianonymous"

name := "sbt-standard-libraries"

version := "0.2.0"

scalaVersion := "2.10.6"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

sbtPlugin := true

publishMavenStyle := true

scriptedSettings

scriptedLaunchOpts <<= (scriptedLaunchOpts, version) { case (s,v) => s ++
  Seq("-Xmx1024M", "-Dplugin.version=" + v)
}

scriptedBufferLog := false