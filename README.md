# Microservice Tutorial

## Set Up Env
1. Download Kafka (https://dlcdn.apache.org/kafka/3.2.0/kafka_2.13-3.2.0.tgz)
2. Using Kafka (https://kafka.apache.org/quickstart#quickstart_consume)
   1. Get Kafka
      1. > tar -xzf kafka_2.13-3.2.0.tgz
         > 
         > cd kafka_2.13-3.2.0
   2. START THE KAFKA ENVIRONMENT
      1. > bin/zookeeper-server-start.sh config/zookeeper.properties
      2. > bin/kafka-server-start.sh config/server.properties
   3. CREATE A TOPIC TO STORE YOUR EVENTS
      1. > bin/kafka-topics.sh --create --topic quickstart-events --bootstrap-server localhost:9092
      2. or using Java to config a topic
   4. WRITE SOME EVENTS INTO THE TOPIC
      1. > bin/kafka-console-producer.sh --topic quickstart-events --bootstrap-server localhost:9092
      2. or using Java to write a producer
   5. READ THE EVENTS
      1. > bin/kafka-console-consumer.sh --topic quickstart-events --from-beginning --bootstrap-server localhost:9092
      2. or using Java to write a consumer


## Producer:
* order-service
* return-service 
  * you need to create this service to handle the return order scenario
  * remember to define a new topic like **return_order**

## Consumer:
* stock-service
  * handle the **return_order** topic
* email-service
  * handle the **return_order** topic.
* payment-service
  * you need to implement the code for this service
  * handle refund money for **return_order** topic

## base-domains
For return service, if you need a new payload, you can create a new POJO in base-domains.
For example, return payload should have return reason field.
