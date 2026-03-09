package com.example.demo.validation;

import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PriceValidator.class)
public @interface ValidPrice {
    String message() default "Giá mua phải nhỏ hơn hoặc bằng giá bán";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
