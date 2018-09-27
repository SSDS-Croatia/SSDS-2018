import org.apache.spark.graphx.{Edge, Graph, VertexId}
import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object GraphAnalysis
{
  def main(args: Array[String]): Unit =
  {
    val conf = new SparkConf().setAppName("GrapX example").setMaster("local[*]")
    val sc:SparkContext = new SparkContext(conf)
    implicit val sparkContext = sc
    val vertices: RDD[(VertexId, String)] =
      sc.parallelize(List( (1L, "Alice"), (2L, "Bob"),  (3L, "Charlie")))
    class Edge[ED]( val srcId: VertexId, val dstId: VertexId, val attr: ED)
    val edges =  sc.parallelize(List( Edge(1L, 2L, "coworker"),
      Edge(2L, 3L, "friend")))

    val graph = Graph(vertices, edges)
    graph.vertices.foreach(println)
    graph.edges.foreach(println)
  }
}
