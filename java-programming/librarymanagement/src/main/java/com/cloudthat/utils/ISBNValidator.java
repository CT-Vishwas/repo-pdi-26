package com.cloudthat.utils;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

public class ISBNValidator implements ConstraintValidator<ValidISBN, String>{
    @Override
    public boolean isValid(String isbn, ConstraintValidatorContext context) {
        if (isbn == null) return false;

        String regex = "^(?:97[89])?\\d{9}[\\dxX]$";
        return isbn.matches(regex);
    }
}
