package com.example.Bank.controller;

import com.example.Bank.dto.Payment.PaymentResponseDTO;
import jakarta.validation.Valid;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @PostMapping(value = "/api/v1/payments")
    public PaymentResponseDTO postPayment(@Valid PaymentResponseDTO paymentRequestDTO){

        return null;
    }
}
