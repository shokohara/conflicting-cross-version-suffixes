Global / onChangedBuildSource := ReloadOnSourceChanges
val scala2Version = "2.13.3"
val dottyVersion = "0.27.0-RC1"

val core = projectMatrix
  .settings(
    scalaVersion := dottyVersion,
    libraryDependencies ++= Seq("org.typelevel" %% "cats-kernel" % "2.3.0-M1")
  )
  .jvmPlatform(scalaVersions = Seq(dottyVersion, scala2Version))

val app = projectMatrix
  .dependsOn(core)
  .settings(
    libraryDependencies ++= Seq("org.typelevel" %% "cats-core" % "2.3.0-M1"),
    scalaVersion := scala2Version
  )
  .jvmPlatform(scalaVersions = Seq(scala2Version))
