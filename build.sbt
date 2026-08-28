name := "compilertoolkit-scala"

version := "0.1"

libraryDependencies ++= Seq(
  "com.monovore"  %% "decline"       % "2.6.2",
  "org.typelevel" %% "cats-parse"    % "1.1.0",
  "org.json4s"    %% "json4s-native" % "4.1.0-M8",
  "org.scalatest" %% "scalatest"     % "3.2.20" % Test
)

enablePlugins(JavaAppPackaging)
