# Day 5 - Learning from networked and relational data

On the fifth day of the school you will learn how to use Apache SPARK to perform some algorthms on Graphs. In order to follow the presentations and hands-on the following software is required:

	* Java JDK 8 (older and newer versions of Java are not supported)
  	* IDE for Scala - IntelliJ IDEA
	* Scala 2.11
	
Installation of Apache Spark itself is not required, because we will use Apache Spark libraries for Scala, wich will be run within the IntelliJ IDEA.
  
## Installation on Windows
  
### JAVA install
Make sure you have Java JDK 8 (or higher) installed. You can download it from https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html.
	
### Scala install
The simplest way to use Scala within IntelliJ IDEA is to use library that comes with the IDE. IntelliJ IDEA also allows the instalation of Scala sdk directly from the IDE.

The third way is to manually install and download Scala from http://www.scala-lang.org/download/. Default version of Scala for download is 2.12., and version 2.11. is needed for this hands-on session. You will need to scroll down to "Other releases" section and choose Scala 2.11.12. Once downloaded installation of Scala is straightforward.
	
### IntelliJ IDEA
Download and install InetelliJ IDEA from https://www.jetbrains.com/idea/.

_IMPORTANT! Do not forget to install Scala plugin!_

When running InetelliJ IDEA for the first time, you will have to define Java SDK and Scala to use. When opening a new project, choose "Java" and then check box for "Scala".

If Java SDK is not set in the "Project SDK" field, click button "New" and select the folder where you installed your Java SDK.

Similar with Scala. If the Scala SDK is not set in the field "Use library", click button "Create" and select the folder where you installed Scala.

## Instalation of Ubuntu/Mint Linux

### Java installation
Make sure you have Java JDK 8 installed.
	
	sudo apt-get install python-software-properties
	sudo add-apt-repository ppa:webupd8team/java
	sudo apt-get update
	sudo apt-get install oracle-java8-installer
	
### Scala installation
Download and install Scala from http://www.scala-lang.org/download/
	
	wget www.scala-lang.org/files/archive/scala-2.11.8.deb
	sudo dpkg -i scala-2.11.8.deb
	
## Spark Installation
Download Spark from https://spark.apache.org/downloads.html and uncompress it in the folder of your choice.

To test if your Apache Spark installation works correctly, run spark-shell script from the folder SPARK_HOME your\Path\To\Spark\bin.

### Environment variables
Add the following lines to your .bashrc file.

	export SPARK_HOME=/path/to/Spark
	export SCALA_HOME=/path/to/Scala
	export PATH=$SPARK_HOME/bin:$PATH

On Ubuntu and Mint Linux, Scala home folder is usualy "/usr/share/scala".

Run .bashrc to make the changes happen.

	source ~/.bashrc
	
### IntelliJ IDEA
Download and install InetelliJ IDEA from https://www.jetbrains.com/idea/ 

Do not forget to install Scala plugin!

When running InetelliJ IDEA for the first time, you will have to define Java SDK and Scala to use. When opening a new project, choose "Java" and then check box for "Scala".

If Java SDK is not set in the "Project SDK" field, click button "New" and select the folder where you installed your Java SDK.

Similar with Scala. If the Scala SDK is not set in the field "Use library", click button "Create" and select the folder where you installed Scala. On Ubuntu and Mint Linux, Scala home folder is usualy "/usr/share/scala".


## Required libraries
With IntelliJ IDEA interface, right click on "src" folder within your project. Open "Module settings" and select "Libraries". To add new libraries to your project, click on button "+".

For this froject, libraries will be added from a "Maven repository". Add the following libraries to your project:

	org.apache.spark:spark-core_2.11:2.1.1
	org.apache.spark:spark-sql_2.11:2.1.3
	org.apache.spark:spark-graphx_2.11:2.1.3
	ml.sparkling:sparkling-graph-api_2.11:0.0.7
	ml.sparkling:sparkling-graph-examples_2.11:0.0.7
	ml.sparkling:sparkling-graph-loaders_2.11:0.0.7
	ml.sparkling:sparkling-graph-operators_2.11:0.0.7
