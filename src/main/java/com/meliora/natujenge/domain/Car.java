package com.meliora.natujenge.domain;

import com.meliora.natujenge.interfaces.Vehicle;

public class Car implements Vehicle {
    private String numberPlate;

    private String model;

    private String color;

    private int year;

    private int engineSize;

    public Car(String numberPlate, String model, String color, int year, int engineSize) {
        this.numberPlate = numberPlate;
        this.model = model;
        this.color = color;
        this.year = year;
        this.engineSize = engineSize;

        System.out.println("Initialized :: " + model);
    }

    public boolean startEngine() {
        System.out.println("starting the engine");
        return true;
    }

    public boolean stopEngine() {
        System.out.println("stopping the engine");
        return true;
    }

    public boolean accelerate() {
        System.out.println("accelerating...");
        return true;
    }

    public boolean brake() {
        System.out.println("braking...");
        return true;
    }
}
