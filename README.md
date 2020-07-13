# A Barebones Spring Data Rest Example #

`./gradlew bootRun` to run

A barebones example of [Spring Data Rest][spring-data-rest], a Spring project that generates REST endpoints based on the Repository domain objects you define.  

In this example we use Spring JPA to define our entites.  [Other options are available!][options]

Use Postman or `curl` to hit endpoints.  The base localhost:8080 shows some available endpoints, `/profile/[endpoint]` gives information about the relevant various APIs made available.

For a brief overview, see [this blog post][post]

[spring-data-rest]:https://spring.io/projects/spring-data-rest
[options]:https://docs.spring.io/spring-data/rest/docs/current/reference/html/#getting-started.bootstrap
[post]:https://integral-io.github.io/spring/java/prototyping/whipping-up-a-rest-service-with-spring-data-rest/
