package com.example.simplewebapplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication


public class SimpleWebApplication {

    public static void main(String[]  args) {
        SpringApplication.run(SimpleWebApplication.class, args); }


    //@Bean
       /* public CommandLineRunner commandLineRunner(ApplicationContext ctx){ return  args -> {

        System.out.println("lets Inspect the bean provided by Spring boot  ");
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for(String names: beanNames){
            System.out.println("Bean Names "+beanNames);
        }
        };
    }*/

}
