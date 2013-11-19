name := "programming-challenges"

organization := "rovak"

scalaVersion := "2.10.3"

/** Dependencies */
resolvers ++= Seq("snapshots" at "http://oss.sonatype.org/content/repositories/snapshots",
                  "releases" at "http://oss.sonatype.org/content/repositories/releases")

libraryDependencies ++=   Seq(
    "org.specs2"      %% "specs2"       % "2.3.4",
    "org.scala-lang"  % "scala-reflect" % "2.10.2",
    "com.chuusai"     %% "shapeless"    % "1.2.4",
    "org.scalacheck"  %% "scalacheck"   % "1.10.0",
    "org.hamcrest"    % "hamcrest-all"  % "1.1",
    "org.mockito"     % "mockito-all"   % "1.9.0",
    "junit"           % "junit"         % "4.11",
    "org.pegdown"     % "pegdown"       % "1.2.1",
    "org.specs2"      % "classycle"     % "1.4.1"
)

scalacOptions in Test ++= Seq("-Yrangepos")

initialCommands in console := "import org.specs2._"