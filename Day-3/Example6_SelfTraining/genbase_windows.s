[Data]
File = Data\genbase-Labeled.arff
TestSet = Data\genbase-Test.arff

[Attributes]
Target = 113-139
Descriptive = 1-112

[Ensemble]
EnsembleMethod = RForest
Iterations = 100
SelectRandomSubspaces = SQRT
OOBestimate = Yes

[SemiSupervised]
SemiSupervisedMethod =  SelfTraining
UnlabeledData = Data\genbase-Unlabeled.arff
ConfidenceMeasure = ClassesProbabilities 
UnlabeledCriteria = KMostConfident
K = 50

[Output]
TrainErrors = No
TestErrors = Yes
