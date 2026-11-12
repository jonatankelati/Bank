package com.example.Bank.dto.Payment;

import java.time.LocalDateTime;

public record PaymentResponseDTO(String paymentId, PaymentStatus status, Long amount, LocalDateTime createdAt){}
