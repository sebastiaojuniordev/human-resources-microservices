FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-worker-*.jar hr-worker.jar
ENTRYPOINT ["java","-jar","/hr-worker.jar"]
