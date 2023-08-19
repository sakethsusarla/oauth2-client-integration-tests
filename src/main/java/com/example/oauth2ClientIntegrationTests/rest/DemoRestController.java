package com.example.oauth2ClientIntegrationTests.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    @GetMapping("/protected")
    public String hello() {
        return "You should be able to see this message if you are authenticated";
    }
}

