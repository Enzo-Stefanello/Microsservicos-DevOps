package com.example.currency_history;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.List;
import java.util.Map;

@RestController
public class HistoryController {

    @GetMapping("/health")
    public Map<String, String> health() {
        return Map.of("status", "UP");
    }

    @GetMapping("/history")
    public Map<String, Object> history(@RequestParam String from, @RequestParam String to) {

        List<Map<String, Object>> values = List.of(
                Map.of("timestamp", Instant.now().minusSeconds(3600).toString(), "price", 5.40),
                Map.of("timestamp", Instant.now().toString(), "price", 5.43)
        );

        return Map.of(
                "from", from,
                "to", to,
                "values", values
        );
    }
}
