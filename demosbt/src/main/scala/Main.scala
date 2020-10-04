import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark._

object Main extends App {

    val sc = new SparkContext("local[*]" , "SparkDemo")
    val lines = sc.textFile("C:\\Spark\\demosbt\\NOTICE");
    val words = lines.flatMap(line => line.split(' '))
    val wordsKVRdd = words.map(x => (x,1))
    val count = wordsKVRdd.reduceByKey((x,y) => x + y)
                            .map(x => (x._2,x._1))
                            .sortByKey(false)
                            .map(x => (x._2, x._1))
                            .take(10)
    wordsKVRdd.reduceByKey((x,y) => x + y)
                .coalesce(1, true)
                .saveAsTextFile("C:\\Spark\\demosbt\\RESULT")
    count.foreach(println)

}