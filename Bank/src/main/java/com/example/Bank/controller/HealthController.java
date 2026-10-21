package com.example.Bank.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping(value = "api/va/payments/health/live")
    public String liveCheck(){
        return "Live";
    }

    @GetMapping(value = "api/va/payments/health/ready")
    public String readyCheck(){
        return "Ready";
    }
}
