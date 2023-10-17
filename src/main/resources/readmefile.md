For Local configuration please follow the steps for Kafka configuration

**Step 1 : Download the kafka https://kafka.apache.org/downloads Step 2 : Extract the zip file
Step 3 : Start the ZooKeeper C:\Users\jaswa\kafka\bin\windows\zookeeper-server-start.bat C:\Users\jaswa\kafka\config\zookeeper.properties Step 4 : Start the Kafka Server C:\Users\jaswa\kafka\bin\windows\kafka-server-start.bat C:\Users\jaswa\kafka\config\server.properties Step 5 : C:\Users\jaswa\kafka\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic TestTopic Created topic TestTopic. (Note Above one ) EDIT- As of 2022 Newer versions(2.2 and above) of Kafka no longer require ZooKeeper connection string i.e. --zookeeper localhost:2181 for creating topics. Instead, add Kafka Broker --bootstrap-server localhost:9092 connection string. So for topic creation the new command may look like ,

For Topic creation use below line : kafka\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic TestTopic

ToView the topic list : kafka\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092

Step 6 : Added Messages inside our Topics C:\Users\jaswa\kafka\bin\windows\kafka-console-producer --broker-list localhost:9092 --topic TestTopic

// The above 16 line is not working for producer please refer below the line C:>Users\jaswa\kafka\bin\windows\kafka-console-producer.bat --topic topic_demo --bootstrap-server localhost:9092

Step 7 : Consume Messages to Topics C:\Users\jaswa>kafka\bin\windows C:\Users\jaswa\kafka\bin\windows\kafka-console-consumer --bootstrap-server localhost:9092 --topic topic_demo** // The above 23 line is not working please for consuming the messages please refer the below line C:\Users\jaswa>\kafka\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092 C:\Users\jaswa>\kafka\bin\windows\kafka-console-consumer.bat --topic topic_demo --from-beginning --bootstrap-server localhost:9092