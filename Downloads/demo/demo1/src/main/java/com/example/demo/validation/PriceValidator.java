package com.example.demo.validation;

import com.example.demo.model.Product;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class PriceValidator implements ConstraintValidator<ValidPrice, Product> {
    @Override
    public boolean isValid(Product p, ConstraintValidatorContext ctx) {
        if (p.getBuyPrice() == null || p.getSellPrice() == null) return true;
        return p.getBuyPrice() <= p.getSellPrice();
    }
}

