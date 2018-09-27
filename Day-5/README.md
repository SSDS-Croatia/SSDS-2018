# Day 5 - Learning from networked and relational data

On the fifth day of the school you will learn how to use Apache SPARK to perform some algorthms on Graphs. In order to follow the presentations and hands-on the following software is required:

	* Java JDK 8 (older and newer versions of Java are not supported)
  	* IDE for Scala - IntelliJ IDEA
	* Scala 2.11
	
Installation of Apache Spark itself is not required, because we will use Apache Spark libraries for Scala, wich will be run within the IntelliJ IDEA.
  
## Installation on Windows
  
### JAVA Installation
Make sure you have Java JDK 8 (or higher) installed. You can download it from https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html.
	
### Scala Installation
The simplest way to use Scala within IntelliJ IDEA is to use library that comes with the IDE. IntelliJ IDEA also allows the instalation of Scala sdk directly from the IDE.

The third way is to manually install and download Scala from http://www.scala-lang.org/download/. Default version of Scala for download is __2.12.__, and version __2.11.__ is needed for this hands-on session. You will need to scroll down to "Other releases" section and choose Scala 2.11.12. Once downloaded installation of Scala is straightforward.
	
### IntelliJ IDEA
Download and install InetelliJ IDEA from https://www.jetbrains.com/idea/.

__IMPORTANT! Do not forget to install Scala plugin!__

## Installation of Ubuntu/Mint Linux

### Java installation
Make sure you have Java JDK 8 installed. You can installit with the following set of shell instructions:
	
	sudo apt-get install python-software-properties
	sudo add-apt-repository ppa:webupd8team/java
	sudo apt-get update
	sudo apt-get install oracle-java8-installer
	
### Scala installation
You can install Scala either through InteliJ IDEA or manually. Scala installation for Linux can be downloaded from http://www.scala-lang.org/download/.
	
	wget www.scala-lang.org/files/archive/scala-2.11.8.deb
	sudo dpkg -i scala-2.11.8.deb
	
On Ubuntu and Mint Linux, Scala home folder should be __/usr/share/scala__.

### IntelliJ IDEA
Download and install InetelliJ IDEA from https://www.jetbrains.com/idea/ 

__IMPORTANT! Do not forget to install Scala plugin!__

After unpacking the installation file, IntelliJ IDEA is started by running __idea.sh__ script located in the __./bin__ folder.

## Testing the installation
1. Open IntelliJ IDEA IDE on your computer and create a new project. On the left side of the window choose __Java__ and then check the box for __Scala__. Depending on the installation, you might need to define Java and Scala SDKs you will use.

	If Java SDK is not set in the __Project SDK__ field (top of the window), click button __New__ and select the folder where you installed your Java SDK.

	If the Scala SDK is not set in the field __Use library__ (Bottom part of the window), click button __Create__ which will open a new popup window. There you can choose Scala SDK installed with IntelliJ IDEA, download Scala from a repository or point to an existing Scala installation if you installed it manually.

	On Ubuntu and Mint Linux, Scala home folder should be __/usr/share/scala__.

2. After selecting Java and Scala SDKs, click __Next__, choose project name and location and click __Finish__.

3. To be able to run the examples and solve problems for the hands-on session, you will need to import some libraries to your project. Within the IntelliJ IDEA interface, right click on __src__ folder within your project. Open __Open Module Settings__ and select __Libraries__. To add new libraries to your project, click on button __+__.

	For this froject, libraries will be added from the __Maven repository__. Add the following libraries to your project (you can copy-paste library names):

		org.apache.spark:spark-core_2.11:2.1.1
		org.apache.spark:spark-sql_2.11:2.1.3
		org.apache.spark:spark-graphx_2.11:2.1.3
		ml.sparkling:sparkling-graph-api_2.11:0.0.7
		ml.sparkling:sparkling-graph-examples_2.11:0.0.7
		ml.sparkling:sparkling-graph-loaders_2.11:0.0.7
		ml.sparkling:sparkling-graph-operators_2.11:0.0.7

__IMPORTANT! When adding libraries, library names must not contain spaces at the end.__

4. After importing all required libraries, you are ready to create your installation. Create new Scala object by right-clicking on __src__ folder in the __Project contents__ window and selecting __New->Scala class__. From the drop down list select __Object__ and name your Scala object __GraphAnalysis__. Copy the following code:


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

	To run the code, right-click the __GraphAnalysis__ object in the __Project contents__ window and select __Run 'GraphAnalysis'__. Output should look something like:

		[Stage 1:>                                                          (0 + 0) / 8](3,Charlie)
		(1,Alice)
		(2,Bob)
		Edge(2,3,friend)
		Edge(1,2,coworker)

## Dataset for the hands-on session
Last is to import __dataset.xml__ file from this repository into your project. You can either download it directly into your IntelliJ IDEA project folder (it will be detected automatically), or create a new file throught the IDE and then copy the contents from this repository.
