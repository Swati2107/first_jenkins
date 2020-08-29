FROM openjdk:8
RUN mkdir /swati
COPY target/demo-0.0.1-SNAPSHOT.jar /swati
CMD ["java", "-jar", "/swati/demo-0.0.1-SNAPSHOT.jar"]