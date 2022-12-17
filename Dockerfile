FROM maven:3.8.5-openjdk-17 as mavenconstruindo
WORKDIR /serveureka
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17
WORKDIR /microservico
COPY --from=mavenconstruindo ./serveureka/target/*.jar ./eureka.jar
EXPOSE 8800
ENTRYPOINT java -jar eureka.jar