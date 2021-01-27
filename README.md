# Spring-boot-mysql-Docker-deployment
 we had to do the following steps manually-
>>Create custom docker network named consumer-producer network
>>Start Container named producer using image employee-producer and the custom network consumer-producer
>>Start Container named consumer using image employee-consumer and the custom network consumer-producer

The above steps can be automated using docker compose.

Compose is a tool for defining and running multi-container Docker applications. With Compose,we canuse a YAML file to configure our application's services. Then, with a single command, you create and start all the services from your configuration.
Using docker-compose we will be creating the custom network named consumer-producer and then starting the containers employee-producer and employee consumer.
