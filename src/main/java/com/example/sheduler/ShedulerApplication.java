package com.example.sheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
public class ShedulerApplication {

    private final Logger LOG = LoggerFactory.getLogger(ShedulerApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(ShedulerApplication.class, args);
    }

    @Scheduled(initialDelay = 3000, fixedDelay = 2000)
    public void takeAction() {
        LOG.info("Running the @Scheduled task..");
    }

}
