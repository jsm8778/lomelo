package com.lomelo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableMongoRepositories(basePackages={"com.lomelo"})
@ComponentScan(basePackages={"com.lomelo"})
@EnableScheduling
//@EnableMongoRepositories({"com.lomelo"})
public class LomeloApplication {

    public static void main(String[] args) {
        SpringApplication.run(LomeloApplication.class, args);
    }

}
