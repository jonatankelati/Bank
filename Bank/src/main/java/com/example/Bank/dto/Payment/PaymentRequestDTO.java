package com.example.Bank.dto.Payment;

import jakarta.validation.constraints.NotNull;

public record PaymentRequestDTO (@NotNull(message = "Amount can not be 0") Long amount, @NotNull String toAccount,@NotNull String fromAccount){}
