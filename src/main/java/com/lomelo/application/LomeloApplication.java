package com.lomelo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication(scanBasePackages={"com.lomelo"})
@EnableMongoRepositories(basePackages={"com.lomelo"})
//@EnableMongoRepositories({"com.lomelo"})
public class LomeloApplication {

    public static void main(String[] args) {
        SpringApplication.run(LomeloApplication.class, args);
    }

}
