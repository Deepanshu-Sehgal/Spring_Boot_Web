package com.datricle.web.springbootwebtutorial;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootwebtutorialApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootwebtutorialApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Hello i m running");
    }
}