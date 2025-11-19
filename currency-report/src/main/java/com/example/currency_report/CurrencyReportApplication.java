package com.example.currency_report;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class CurrencyReportApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyReportApplication.class, args);
    }
}
