addSbtPlugin("com.typesafe.play" % "sbt-plugin" % "2.5.8")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % sys.props.getOrElse("scalajs.version", sys.error("'scalajs.version' environment variable is not defined")))

addSbtPlugin("com.typesafe.sbt" % "sbt-gzip" % "1.0.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-digest" % "1.1.1")

addSbtPlugin("ch.epfl.scala" % "sbt-web-scalajs-bundler" % sys.props.getOrElse("plugin.version", sys.error("'plugin.version' environment variable is not set")))

ivyLoggingLevel in ThisBuild := UpdateLogging.Quiet
