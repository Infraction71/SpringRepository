package com.example.demo.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;


import com.example.demo.validation.LicensePlateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

    @Target({ TYPE }) // add TYPE to be applicable to class
    @Retention(RUNTIME)
    @Constraint(validatedBy = LicensePlateClassValidator.class)
    @Documented
    public @interface LicensePlateClassValidatorInterface {

        String message() default "{org.hibernate.validator.referenceguide.chapter06.CheckCase." +
                "message}";

        Class<?>[] groups() default { };

        Class<? extends Payload>[] payload() default { };

        int age() default 22;

        String Plate() default "AAA 444";

        @Target({ FIELD, METHOD, PARAMETER, ANNOTATION_TYPE })
        @Retention(RUNTIME)
        @Documented
        @interface List {
            com.example.demo.validation.LicensePlateClassValidatorInterface[] value();
        }
}
