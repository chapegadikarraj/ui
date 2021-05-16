FROM adoptopenjdk/openjdk8:jdk8u202-b08-alpine-slim
ADD target/ui-0.0.1-SNAPSHOT.jar ui-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "ui-0.0.1-SNAPSHOT.jar"]