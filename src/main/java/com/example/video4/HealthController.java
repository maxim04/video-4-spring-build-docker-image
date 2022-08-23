package com.example.video4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/health")
public class HealthController {
    @Value("${com.example.video4.version}")
    private String version;

    @Value("${com.example.video4.testvar1}")
    private String testVar1;

    @GetMapping("/version")
    public ResponseEntity<?> version() {
        return ResponseEntity.ok(version);
    }

    @GetMapping("/test-var-1")
    public ResponseEntity<?> testVarOne() {
        return ResponseEntity.ok(testVar1);
    }
}
