package io.github.cgew85;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static spark.Spark.*;

@SpringBootApplication
public class SparkRestServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SparkRestServiceApplication.class, args);

        get("/hello", (request, response) -> "Hello World");

        get("/hello/:name", (request, response) -> "Hello: " + request.params(":name"));



    }
}
