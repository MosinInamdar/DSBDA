## hadoop version
## javac -version
## export HADOOP_CLASSPATH = $(hadoop classpath)
## echo $HADOOP_CLASSPATH
## hadoop fs -mkdir /WordCount
## hadoop fs -mkdir /WordCount/Input
## hadoop fs -put <Path of input.txt file> /WordCount/Input
## cd 'folder that contains WordCount'
## javac -classpath ${HADOOP_CLASSPATH} -d <file path to store in> <WordCount.java file path>
## jar -cvf wordCount.jar -C WordClasses/ .
## hadoop jar 'jar file path' <Class name like WordCount> /WordCount/Input /WordCount/Output
## haddop dfs -cat /WordCount/Output/*
