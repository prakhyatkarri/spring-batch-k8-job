package com.batch.job.datafeed.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.task.configuration.DefaultTaskConfigurer;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

public class TaskConfiguration extends DefaultTaskConfigurer {
    public TaskConfiguration(DataSource dataSource) {
        super(dataSource);
    }
}
