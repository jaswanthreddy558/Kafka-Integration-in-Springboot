For Local configuration please follow the steps for Kafka configuration
Step 1 : Download the kafka https://kafka.apache.org/downloads
Zookeeper :
C:\Users\jaswa\kafka_2.12-2.8.1\bin\windows\zookeeper-server-start.bat C:\Users\jaswa\kafka_2.12-2.8.1\config\zookeeper.properties
Kafka Server :
C:\Users\jaswa\kafka_2.12-2.8.1\bin\windows\kafka-server-start.bat C:\Users\jaswa\kafka_2.12-2.8.1\config\server.properties
Create topic
C:\>C:\Users\jaswa\kafka_2.12-2.8.1\bin\windows\kafka-topics.bat --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic TestTopic
To view the all topic list :
C:\Users\jaswa\kafka_2.12-2.8.1\bin\windows\kafka-topics.bat --list --bootstrap-server localhost:9092
Added Messages inside our Topics
C:\Users\jaswa\kafka_2.12-2.8.1\bin\windows\kafka-console-producer --broker-list localhost:9092 --topic TestTopic
Consume Message
C:\Users\jaswa\kafka_2.12-2.8.1\bin\windows\kafka-console-consumer.bat --topic TestTopic --from-beginning --bootstrap-server localhost:9092