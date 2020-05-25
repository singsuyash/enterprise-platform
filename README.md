![Maven Package](https://github.com/singsuyash/enterprise-platform/workflows/Maven%20Package/badge.svg)

# Contacts
* [mail](mailto:loafvantage@gmail.com)
* [slack](https://vantage-loaf.slack.com)

# References
- https://docs.docker.com/get-started/
- https://spring.io/guides/gs/spring-boot-docker/
- https://dzone.com/articles/build-docker-images-with-maven-and-gradle
- https://stackoverflow.com/questions/37700352/setting-the-default-active-profile-in-spring-boot
- https://vsupalov.com/docker-env-vars/
- https://www.baeldung.com/spring-boot-actuators
- https://www.baeldung.com/java-logging-intro

# Application startup
- mvn -pl spring-cloud-config-server spring-boot:run -Dspring-boot.run.profiles=<local/development/production>
- mvn -pl spring-cloud-config-client spring-boot:run -Dspring-boot.run.profiles=<local/development/production>

