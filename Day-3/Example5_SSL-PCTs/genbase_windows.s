[Data]
File = Data\genbase-Labeled.arff
TestSet = Data\genbase-Test.arff

[Attributes]
Target = 113-139
Descriptive = 1-112

[Tree]
Heuristic = VarianceReduction	  

[SemiSupervised]
SemiSupervisedMethod = PCT
UnlabeledData = Data\genbase-Unlabeled.arff
InternalFolds = 5
PossibleWeights =  [0.0,0.1,0.2,0.3,0.4,0.5,0.6,0.7,0.8,0.9,1.0]

[Output]
TrainErrors = No
TestErrors = Yes
WritePredictions = Test