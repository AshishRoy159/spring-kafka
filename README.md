# spring-kafka

Initial Steps to run this application. This application considers taht all the services running on their default ports. 
If it is running on a different port please make changes in code accordingly.

1. Start zookeeper instatnce by using command  -

  For windows - bin\windows\zookeeper-server-start.bat config\zookeeper.properties
  
  Others - bin/zookeeper-server-start.sh config/zookeeper.properties

2. Start Kafka instance by using command - 

  For windows - bin\windows\kafka-server-start.bat config\server.properties
  
  Others - bin/kafka-server-start.sh config/server.properties

3. Start a topic (We have used "bootcode" here, make changes in your code accordingly)

  For windows - bin\windows\kafka-topics.bat --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic bootcode
  
  Others - bin/kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic bootcode

After all the services starts -
Make a GET request to "http://localhost:8080/kafka/publish/{message}".
Your message should appear in console.
