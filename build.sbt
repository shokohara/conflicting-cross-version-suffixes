Global / onChangedBuildSource := ReloadOnSourceChanges

val core = project
  .settings(
    scalaVersion := "3.0.0-M1",
    libraryDependencies ++= Seq("org.typelevel" %% "cats-core" % "2.3.0-M2")
  )

val app = project
  .dependsOn(core)
  .settings(
    scalaVersion := "2.13.4",
    scalacOptions += "-Ytasty-reader"
  )

