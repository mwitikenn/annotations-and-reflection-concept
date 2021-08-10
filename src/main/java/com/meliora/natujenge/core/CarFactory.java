package com.meliora.natujenge.core;

import com.meliora.natujenge.annotations.CarDetails;
import com.meliora.natujenge.domain.Car;
import com.meliora.natujenge.exceptions.CarNotFoundException;
import org.reflections.Reflections;

import java.lang.annotation.Annotation;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CarFactory {
    private Map<String, Car> cars;

    public CarFactory(String packageName) {
        this.cars = new HashMap<String, Car>();

        System.out.println("Starting to initialize all cars defined...");

        initializeCars(packageName);

        System.out.println("Initialized the cars " + cars);
    }

    public void initializeCars(String packageName) {
        Reflections reflections = new Reflections(packageName);

        Set<Class<?>> classes = reflections.getTypesAnnotatedWith(CarDetails.class);

        System.out.println(classes);
        for (Class<?> cl : classes) {

            CarDetails carDetails = (CarDetails) cl.getAnnotation(CarDetails.class);

            System.out.println(carDetails);

            Car car = new Car(carDetails.numberPlate(), carDetails.model(), carDetails.color(), carDetails.year(), carDetails.engineSize());

            this.cars.put(carDetails.numberPlate(), car);
        }
    }

    public Car getCarByNumberPlate(String numberPlate) throws CarNotFoundException {
        Car car = this.cars.get(numberPlate);

        if (car == null) {
            throw new CarNotFoundException("Car with the number plate " + numberPlate + " was not found in our yard");
        }
        return car;
    }
}
