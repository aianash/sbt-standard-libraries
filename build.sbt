organization := "com.goshoplane"

name := "sbt-standard-libraries"

version := "0.1.0"

scalaVersion := "2.10.4"

scalacOptions := Seq("-unchecked", "-deprecation", "-encoding", "utf8")

sbtPlugin := true

publishMavenStyle := true

scriptedSettings

scriptedLaunchOpts <<= (scriptedLaunchOpts, version) { case (s,v) => s ++
  Seq("-Xmx1024M", "-XX:MaxPermSize=256M", "-Dplugin.version=" + v)
}

scriptedBufferLog := false