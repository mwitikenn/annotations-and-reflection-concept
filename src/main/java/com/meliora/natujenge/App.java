package com.meliora.natujenge;

import com.meliora.natujenge.core.CarFactory;
import com.meliora.natujenge.domain.Car;

/**
 * Hello world!
 */
public class App {
    String packageName = this.getClass().getPackage().getName();
    private static CarFactory carFactory;

    App() {
        System.out.println("About to start all cars in the package " + packageName);
        carFactory = new CarFactory(packageName);
    }

    public static void main(String[] args) {
        try {
            App app = new App();

            Car car = carFactory.getCarByNumberPlate("KDE 267H");

            car.startEngine();

            car.accelerate();

            car.brake();

            car.stopEngine();

        } catch (Exception ex) {
            System.out.println("Exception " + ex);
        }
    }
}
