package com.batch.job.datafeed;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.configuration.EnableTask;

@SpringBootApplication
@EnableTask
public class DataFeedApp implements ApplicationRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(DataFeedApp.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(DataFeedApp.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOGGER.debug("DataFeed complete");
    }
}
