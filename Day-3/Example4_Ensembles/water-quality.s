[Data] 
File = ../Data/water-quality-MTR-rnd.arff

[Attributes]
Target = 17-30
Disable = 1-16
Descriptive = 3,1,5,4

[Ensemble]
EnsembleMethod = RForest
Iterations = 100
SelectRandomSubspaces = LOG
OOBestimate = Yes
FeatureRanking = Genie3
NumberOfThreads = 2
