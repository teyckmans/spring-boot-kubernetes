FROM adoptopenjdk/openjdk11:alpine

COPY build/libs/spring-boot-kubernetes-basics-0.0.1.jar /

ENTRYPOINT java -jar spring-boot-kubernetes-basics-0.0.1.jar