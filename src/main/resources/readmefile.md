For Local configuration please follow the steps for Kafka configuration

Step 1 : Download the kafka https://kafka.apache.org/downloads Step 2 : Extract the zip file
Step 3 : Start the ZooKeeper C:\Users\jaswa\kafka\bin\windows\zookeeper-server-start.bat C:\Users\jaswa\kafka\config\zookeeper.properties 
Step 4 : Start the Kafka Server C:\Users\jaswa\kafka\bin\windows\kafka-server-start.bat C:\Users\jaswa\kafka\config\server.properties 
Step 5 : kafka\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic TestTopic
ToView the topic list :  C:\Users\jaswa\kafka\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
Step 6 : Added Messages inside our Topics C:\Users\jaswa\kafka\bin\windows\kafka-console-producer --broker-list localhost:9092 --topic TestTopic 
Step 7 : C:\Users\jaswa> kafka\bin\windows\kafka-cons   ole-consumer.bat --topic TestTopic --from-beginning --bootstrap-server localhost:9092