ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.12.10"

lazy val root = (project in file("."))
  .settings(
    name := "test-units-spark"
  )

resolvers ++= Seq(
  "bintray-spark-packages" at "https://dl.bintray.com/spark-packages/maven",
  "Typesafe Simple Repository" at "https://repo.typesafe.com/typesafe/simple/maven-releases",
  "MavenRepository" at "https://mvnrepository.com"
)



val sparkVersion = "3.1.0"
val scalaTestVersion = "3.2.1"


libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-sql" % sparkVersion exclude("com.fasterxml.jackson.core", "jackson-databind"),
  "org.apache.spark" %% "spark-sql" % sparkVersion % Test,
  "org.apache.spark" %% "spark-sql" % sparkVersion % Test classifier "tests",
  "org.apache.spark" %% "spark-catalyst" % sparkVersion % Test,
  "org.apache.spark" %% "spark-catalyst" % sparkVersion % Test classifier "tests",
  "org.apache.spark" %% "spark-hive" % sparkVersion % Test,
  "org.apache.spark" %% "spark-hive" % sparkVersion % Test classifier "tests",
  "org.apache.spark" %% "spark-core" % sparkVersion,
  "org.apache.spark" %% "spark-core" % sparkVersion % Test classifier "tests",
  // logging
  "log4j" % "log4j" % "1.2.17",
  "org.slf4j" % "slf4j-log4j12" % "1.7.30",

  "org.scalatest" %% "scalatest" % scalaTestVersion % Test,
  "org.scalacheck" %% "scalacheck" % "1.14.3" ,
  "org.scalatestplus" %% "scalacheck-1-14" % "3.2.2.0",

  "org.scalikejdbc"         %% "scalikejdbc"                          % "3.5.0"    % Test exclude("com.fasterxml.jackson.core", "jackson-databind"),
  "org.scalikejdbc"         %% "scalikejdbc-test"                     % "3.5.0"   % Test exclude("com.fasterxml.jackson.core", "jackson-databind"),
  "com.dimafeng"            %% "testcontainers-scala-postgresql"      % "0.40.11"  % Test,
  "com.dimafeng"            %% "testcontainers-scala-scalatest"       % "0.40.11"  % Test,
  "org.flywaydb"            % "flyway-core"                         % "9.8.3" exclude("com.fasterxml.jackson.core", "jackson-databind"),
  "org.postgresql"          % "postgresql"                            % "42.5.1" ,
)


