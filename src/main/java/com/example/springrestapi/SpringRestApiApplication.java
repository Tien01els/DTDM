package com.example.springrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringRestApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringRestApiApplication.class, args);

        API api = context.getBean(API.class);

        System.out.println(api);
    }

}
