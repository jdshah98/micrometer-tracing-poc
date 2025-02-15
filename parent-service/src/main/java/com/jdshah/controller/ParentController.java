package com.jdshah.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ParentController {
    private final RestTemplate restTemplate;

    @GetMapping("/call")
    public String callChild() {
        log.info("Parent was called...");
        log.info("Say Hi to GrandChild ... ");
        return "GrandChild said: " + restTemplate.exchange(
                "http://localhost:8081/call",
                HttpMethod.GET,
                null,
                String.class
        ).getBody();
    }
}
