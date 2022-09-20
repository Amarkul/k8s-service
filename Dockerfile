FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 9190
ADD target/k8s-service-1.0.0.jar k8s-service-1.0.0.jar
ENTRYPOINT ["java","-jar","/k8s-service-1.0.0.jar"]