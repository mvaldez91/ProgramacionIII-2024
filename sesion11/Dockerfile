FROM eclipse-temurin:20-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY ${JAR_FILE} app.jar
ARG DB_SERVER
ENV DB_SERVER $DB_SERVER
ARG DB_PASSWORD
ENV DB_PASSWORD $DB_PASSWORD
ARG DB_PORT
ENV DB_PORT $DB_PORT
COPY application.properties application.properties
ENTRYPOINT ["java","-jar","/app.jar"]