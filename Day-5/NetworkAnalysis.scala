import ml.sparkling.graph.api.loaders.GraphLoading.LoadGraph
import ml.sparkling.graph.api.operators.algorithms.community.CommunityDetection.ComponentID
import ml.sparkling.graph.loaders.graphml.GraphFromGraphML.GraphML
import ml.sparkling.graph.operators.OperatorsDSL._
import org.apache.spark.{SparkConf, SparkContext}
import ml.sparkling.graph.operators.measures.edge.{CommonNeighbours}
import org.apache.spark.graphx.{Graph, VertexId}
import org.apache.spark.rdd.RDD

object NetworkAnalysis
{
  def main(args: Array[String]): Unit =
  {
    val conf = new SparkConf().setAppName("Link Prediction example").setMaster("local[*]")

    val sc:SparkContext = new SparkContext(conf)

    implicit val sparkContext = sc

    // Load the graph from CSV
    val filePath = "dataset.xml"
    val graph: Graph[String, String] = LoadGraph.from(GraphML(filePath)).load()

    // Print the initial graph
    println("\nInitial graph (srcID,dstID):")
    graph.edges.map(x => "(" + x.srcId + "," + x.dstId + ")").foreach(println)

    // Predict new edges
    val predictedEdges: RDD[(VertexId,VertexId)] = graph.predictLinks(CommonNeighbours, 0, true)

    // Print the predicted edges
    println("\nPredicted edges (srcID,dstID):")
    predictedEdges.foreach(println)

    // Community detection
    val components: Graph[ComponentID, String] = graph.PSCAN(0.3)

    println("\nCommunities (nodeID,communityID):")
    components.vertices.foreach(println);
  }
}

