FROM openjdk:17
ADD target/SBD_EnvironmentVariable-0.0.1-SNAPSHOT.jar SBD_EnvironmentVariable-0.0.1-SNAPSHOT.jar

# Passing Env Variable Value
ENV TEST_ENV_VAR=test12345

EXPOSE 8080
ENTRYPOINT ["java","-jar","SBD_EnvironmentVariable-0.0.1-SNAPSHOT.jar"]