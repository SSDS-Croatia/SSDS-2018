### Day 1 - Platforms for big data analytics and stream processing

In the first day of the school you will learn about the tools and programming models for processing big data streams. In order to follow the presentations and hands-on the following software is required:

	* Java JDK 8 (older and newer versions of Java are not supported)
	* Apache Maven 3.x
	* Git
	* an Java IDE (recommended IntelliJ from JetBeans)
	* Scala 2.11

In addiotion to the software the students has to:

	* Clone the [flink-training-exercise](https://github.com/dataArtisans/flink-training-exercises "Flink training exercise") from the GitHub
	* Download the test data
	
There is 3 possible ways how to obtain the required software:

	1. Using pre-installed VMs (Virtual Machines) remotely (recommended)
	2. Download pre-installed VM and use it locally
	3. Install software locally on your laptop

## Using pre-installed Virtual Machine (remotely)

For this hands-on, 30 VMs from [EGI FedCloud training](https://www.egi.eu/services/training-infrastructure/) infrastructure, located at INFN-Catania (Italy) is prepared. The VMs already contain all the required software, exercise code and training data. On the day of the hands-on, you will get the VM IP addresses and the information how to connect.

The students will use the remote desktop connection to access the remote machines. For this, students have to download and install [x2go Client](https://wiki.x2go.org/doku.php) on their laptops. 

This version is independent on the operating system on students' laptops. Supported platforms are: Win, Linux and Mac OS.


## Download pre-installed VM locally

The second option is to download pre-installed VM on your laptops and start it locally.
For this you will first need to

1. [Download](http://mojoblak.srce.hr/public.php?service=files&t=15652ab336afc96bd1f26e06ad56725f) the pre-installed VM on your laptop. The size of VM is 5.6 GB and is split into 3 files. Download all files.
After downloading, start unzipping the "SSDS-2018-Flink-split.zip" file and the other 2 files will be unzipped automatically. The resulting file is called **SSDS-2018-Flink.ova**.

2. Download and install the [Oracle VirtualBox](https://www.virtualbox.org/wiki/Downloads) for you platform. Once the installation is completed, follow these [instructions](https://www.virtualbox.org/manual/ch01.html#ovf) on how to import the *.ova file into the VirtualBox.

The default user name is: ***ubuntu***, and the password is: ***Ssds-2018-fl1nk***.

The default VM configuration is 1 CPU and 2 GB of memory, but you can re-configure the VM setting based on the availability of the resources of your laptops.

This version is independent on the host operating system. Supported platforms are: Win, Linux and Mac OS.


## Install on your laptop

For those that want to install the required software and training data on their laptops and use it locally on their own, please, follow the instructions on how to [setup](http://training.data-artisans.com/devEnvSetup.html) the Flink development environment.