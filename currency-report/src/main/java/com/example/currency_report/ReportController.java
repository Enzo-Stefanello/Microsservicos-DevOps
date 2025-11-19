package com.example.currency_report;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

@RestController
public class ReportController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/quote")
    public Map<String, Object> getQuote(
            @RequestParam String from,
            @RequestParam String to
    ) {

        Map<String, Object> response = new HashMap<>();
        response.put("from", from);
        response.put("to", to);

        // MOCK do preço
        response.put("price", 5.42);
        response.put("timestamp", Instant.now().toString());

        return response;
    }
}
