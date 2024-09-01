package com.example.testingadmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class TestingAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestingAdminApplication.class, args);
    }
}
