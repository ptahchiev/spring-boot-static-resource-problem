package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication
public class DemopropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemopropertiesApplication.class, args);
    }

    @Bean
    public Properties jawrProperties() {
        Properties jawrProperties = new Properties();

        jawrProperties.put("jawr.js.bundle.jquery.id", "/jquery.min.js");
        jawrProperties.put("jawr.js.bundle.jquery.mappings", "webjars/jquery/1.12.1/jquery.min.js");

        return jawrProperties;
    }
}
