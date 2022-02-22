Flow
Event generator creates and push events -> Kafka -> server-sent-events server receive events stream -> reactive consumer receives events stream from server-sent-event server
server-sent-events is just a middle server which we have added. It subscribes and receive events stream from kafka in similar manner (most likely) the reactive consumer is receiving from server-sent-events server using sse stream. 

install kafka -> https://kafka.apache.org/quickstart
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties

bin/kafka-topics.sh --create --topic egen-sse-test-topic --bootstrap-server localhost:9092 —-partitions 1

go to server-sent-events and start the server - mvn spring-boot:run
go to reactive-consumer and start the consumer - mvn spring-boot:run

go to server-sent-events and run the ServerGenerateEventsApplication.java

In the console logs for reactive-consumer, you should see the messages getting received


