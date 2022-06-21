https://developer.confluent.io/tutorials/creating-first-apache-kafka-streams-application/kstreams.html

./gradlew shadowJar
java -jar build/libs/creating-first-apache-kafka-streams-application-*.jar configuration/dev.properties
docker exec -it broker /usr/bin/kafka-console-consumer --topic random-strings --bootstrap-server broker:9092
docker exec -it broker /usr/bin/kafka-console-consumer --topic tall-random-strings --bootstrap-server broker:9092