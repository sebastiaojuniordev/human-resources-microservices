FROM openjdk:11
VOLUME /tmp
ADD ./target/hr-payroll-*.jar hr-payroll.jar
ENTRYPOINT ["java","-jar","/hr-payroll.jar"]
