FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-oauth-*.jar hr-oauth.jar
ENTRYPOINT ["java","-jar","/hr-oauth.jar"]
