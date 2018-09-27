# Day 5 - Learning from networked and relational data

On the fifth day of the school you will learn how to use Apache SPARK to perform some algorthms on Graphs. In order to follow the presentations and hands-on the following software is required:

	* Java JDK 8 (older and newer versions of Java are not supported)
	* Scala 2.11
	* Apache Spark 2.3.1
  	* Scala IDE - IntelliJ
  
  
## Installation on Windows
  
### JAVA install
Make sure you have Java JDK 8 installed. To make things simpler later on Java JDK path should not contain space characters
For example, good installation folder is c:\Java.
	
### Scala install
Download and install Scala from http://www.scala-lang.org/download/
Use option: "Download the Scala binaries for windows "
	
### Apache Spark
Download Spark from https://spark.apache.org/downloads.html and uncompress it in the folder of your choice.

Obtain hadoop WinUtils library from https://github.com/steveloughran/winutils. Download version for hadoop-2.7.1.

Create (if it doesn't exist) the hive folder and give it proper permissions using WinUtils tool.
	
	* Create the folder C:\tmp\hive\
	• Open a terminal as administrator, go into the folder in which you copied winutils.
	• Write winutils.exe chmod 777 \tmp\hive

There is a bug in the windows script in Apache Spark version 2.1.1., which could also appear in other versions. To fix it, open the file bin\spark-class2.cmd with a text editor, search the statement :

	"%RUNNER%" -Xmx128m …

and remove the quotation marks as follows:

	%RUNNER% -Xmx128m

### Environment variables
Open your system properties, go to advanced options and open the window to set environment variables.

Set following wariables:

	JAVA_OPTION -Xmx512M -Xms512M
	HADOOP_HOME your\Path\To\Winutils
	JAVA_HOME your\Path\To\JavaSDKRoot
	SCALA_HOME your\Path\To\Scala\bin
	SPARK_HOME your\Path\To\Spark\

To test if your Apache Spark installation works correctly, run spark-shell script from the folder SPARK_HOME your\Path\To\Spark\bin.

### IntelliJ IDEA
Download and install InetelliJ IDEA from https://www.jetbrains.com/idea/ 

Do not forget to install Scala plugin!

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
