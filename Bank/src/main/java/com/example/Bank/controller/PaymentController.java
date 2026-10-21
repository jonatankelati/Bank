package com.example.Bank.controller;

import com.example.Bank.dto.Payment.PaymentDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping(value = "/api/v1/payments")
    public PaymentDTO postPayment(){
        return null;
    }
}
