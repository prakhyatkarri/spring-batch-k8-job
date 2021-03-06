package com.batch.job.datafeed.config;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CloudTaskAppConfig {

    @Bean
    public TaskListener taskListener(){
        return new TaskListener();
    }

    @Bean
    OkHttpClient okHttpClient(){
        return new OkHttpClient();
    }

}