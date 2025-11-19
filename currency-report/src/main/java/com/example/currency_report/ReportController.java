package com.example.currency_report;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Map;

@RestController
public class ReportController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/quote")
    public Map<String, Object> quote(@RequestParam String from, @RequestParam String to) {

        return Map.of(
                "from", from,
                "to", to,
                "price", 5.42,
                "timestamp", Instant.now().toString()
        );
    }
}
