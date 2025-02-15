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
public class ChildController {

    private final RestTemplate restTemplate;

    @GetMapping("/call")
    public String callGrandChild() {
        log.info("Child was called...");
        log.info("Calling GrandChild now ... ");
        return restTemplate.exchange(
                "http://localhost:8082/say-hi",
                HttpMethod.GET,
                null,
                String.class
        ).getBody();
    }
}
