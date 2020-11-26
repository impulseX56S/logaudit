package com.ebowin.logaudit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class LogauditApplication {

    public static void main(String[] args) {
        SpringApplication.run(LogauditApplication.class, args);
    }

}
