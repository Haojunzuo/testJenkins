package com.example.testjenkins;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class TestJenkinsApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(TestJenkinsApplication.class, args);
    }
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
        return builder.sources(TestJenkinsApplication.class);
    }
}
