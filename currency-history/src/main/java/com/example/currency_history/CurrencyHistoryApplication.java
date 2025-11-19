package com.example.currency_history;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyHistoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyHistoryApplication.class, args);
    }
}
