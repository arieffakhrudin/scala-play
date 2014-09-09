name := "cobajava"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  "org.mindrot" % "jbcrypt" % "0.3m"
  //"postgresql" % "postgresql" % "9.1-903.jdbc4"
  //"mysql" % "mysql-connector-java" % "5.0.8"
)     

play.Project.playJavaSettings