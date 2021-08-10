package com.meliora.natujenge.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface CarDetails {
    String numberPlate();

    String model();

    String color();

    int year();

    int engineSize();
}
