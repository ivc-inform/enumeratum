resolvers ++= Seq(
  Classpaths.sbtPluginReleases
)

addSbtPlugin("com.lucidchart" % "sbt-scalafmt-impl" % "1.14-1.0")

addSbtPlugin("com.lucidchart" % "sbt-scalafmt-coursier" % "1.14-1.0")

addSbtPlugin("io.get-coursier" % "sbt-coursier" % "1.0.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.5.1")

addSbtPlugin("org.scoverage" % "sbt-coveralls" % "1.2.2")

//addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.8.5")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.20")

addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.2.27")

addSbtPlugin("org.wartremover" % "sbt-wartremover" % "2.2.1")

addSbtPlugin("com.github.tkawachi" % "sbt-doctest" % "0.7.0")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")
