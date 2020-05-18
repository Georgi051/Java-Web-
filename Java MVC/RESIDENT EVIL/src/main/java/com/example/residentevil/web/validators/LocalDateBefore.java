package com.example.residentevil.web.validators;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


@Constraint(validatedBy=LocalDateBeforeValidatorImpl.class)
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LocalDateBefore {
    String message() default "must be after {value}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
