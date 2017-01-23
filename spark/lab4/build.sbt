name := "lab4"

version := "1.0"

scalaVersion := "2.10.5"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.2" % "provided"
libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.6.2" % "provided"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.6.2"  % "provided"
libraryDependencies += "org.apache.spark" % "spark-hive_2.10" % "1.6.2"  % "provided"
libraryDependencies += "org.apache.spark" % "spark-streaming-kafka_2.10" % "1.6.2"  % "provided"
libraryDependencies += "org.pcap4j" % "pcap4j-packetfactory-static" % "1.7.0"
libraryDependencies += "org.pcap4j" % "pcap4j-core" % "1.7.0"

