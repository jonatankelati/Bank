package com.example.Bank.validation;

import jakarta.validation.Constraint;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = DiffrentAccountsValidator.class)
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DiffrentAccounts {
    String message() default "No whitespace allowed";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
