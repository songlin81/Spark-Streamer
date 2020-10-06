# Spark-Streamer
Demo for Spark

### Installation
	SPARK_HOME --> C:\Spark\spark-2.4.7-bin-hadoop2.7
	C:\Spark\spark-2.4.7-bin-hadoop2.7\bin>spark-shell (Ctrl+d to quit)
	
### Web UI	
	http://localhost:4040/

### CLI
	scala> val x =sc.textFile("README.md")
		x: org.apache.spark.rdd.RDD[String] = README.md MapPartitionsRDD[1] at textFile at <console>:24
	scala> x.take(11).foreach(println)
		# Apache Spark
		Spark is a fast and general cluster computing system for Big Data. It provides
		high-level APIs in Scala, Java, Python, and R, and an optimized engine that
		supports general computation graphs for data analysis. It also supports a
		rich set of higher-level tools including Spark SQL for SQL and DataFrames,
		MLlib for machine learning, GraphX for graph processing,
		and Spark Streaming for stream processing.
		<http://spark.apache.org/>

	scala> val y = x.map(_.reverse)
		y: org.apache.spark.rdd.RDD[String] = MapPartitionsRDD[2] at map at <console>:25
	scala> y.take(11).foreach(println)
		krapS ehcapA #
		sedivorp tI .ataD giB rof metsys gnitupmoc retsulc lareneg dna tsaf a si krapS
		taht enigne dezimitpo na dna ,R dna ,nohtyP ,avaJ ,alacS ni sIPA level-hgih
		a stroppus osla tI .sisylana atad rof shparg noitatupmoc lareneg stroppus
		,semarFataD dna LQS rof LQS krapS gnidulcni sloot level-rehgih fo tes hcir
		,gnissecorp hparg rof XhparG ,gninrael enihcam rof bilLM
		.gnissecorp maerts rof gnimaertS krapS dna
		>/gro.ehcapa.kraps//:ptth<
		
### IDE
	IntelliJ->Plugins->Add Scala
