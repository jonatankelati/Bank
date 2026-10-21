package com.example.Bank.dto.Payment;

import java.time.LocalDateTime;

public record PaymentDTO (String paymentId, PaymentStatus status, Long amount, LocalDateTime createdAt){}
