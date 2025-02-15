package com.jdshah.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@Slf4j
@RestController
@RequiredArgsConstructor
public class GrandChildController {
    private final RestTemplate restTemplate;

    @GetMapping("/say-hi")
    public String sayHi() {
        log.info("Grandchild was called...");
        return "Hii from Grand Child";
    }
}
