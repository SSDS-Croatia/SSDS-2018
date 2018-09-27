### Summer school of data science - Day 2

Slides of the lecture can be found here: http://www.l3s.de/~anand/anand-split-summer-school.pdf

Preparation for the second hands-on session consists of setting up a python environment
using Anaconda and installing all necessary libraries. The procedure for this is as follows:

1. Download Anaconda 5.2 (for python 3.6) for your favourite OS from https://www.anaconda.com/download/ 
Install it using the automated installer, you can leave the defaults during installation but remember which folder you
installed into, for the rest of the instructions we will assume this is "D:\Anaconda3" (modify this path in the commands as required)

2. Pull the updated repo from github with files for the Day 2 session.

3. Some setup is needed before you can start a notebook
 
Open up a terminal / command-prompt (in any folder) and enter the following commands (in the given order, ommiting comments after "#"):

- D:\Anaconda3\Scripts\conda.exe create -n SSDS_day2_env python=3.4 # creates a new virtual environment with the same python version as the development machine
- D:\Anaconda3\Scripts\activate SSDS_day2_env # makes it active
- D:\Anaconda3\Scripts\pip.exe install -r requirements-ssds3.txt # installs the necessary python libraries (you will find this file in the repo)
- D:\Anaconda3\python -m ipykernel install --user --name SSDS_day2_env --display-name "Python (SSDS_day2)" # makes the environment visible to jupyter notebooks
- D:\Anaconda3\python -m nltk.downloader punkt stopwords # tokenizer and stopwords resources for text processing

Finally, unpack the english_cleaned_lyrics.rar file in the ...\Day2\word2vec\lyrics-dataset folder which will generate 
an english_cleaned_lyrics.txt file in the same folder.

4. Start a jupyter notebook by positioning yourself (in terminal/command-prompt) into the 
   Day2 folder of the git repo (the one containing this README file) and issuing
   D:\Anaconda3\Scripts\jupyter-notebook
   Open the Day2 notebook file and you should be able to run the code.
      

* the above commands have not been tested on linux/mac but should work with minimal modifications (for example, you may find
  that your "conda", "activate", and "pip" commands are in a slightly different subfolder of Anaconda3 or some of the commands
  don't have an ".exe" suffix)

** a more elaborate list of requirements (a full outline of the environment where the code was developed) is in requirements-ssds3-full.txt
   which might be of use to you if you run into problems with various library versions