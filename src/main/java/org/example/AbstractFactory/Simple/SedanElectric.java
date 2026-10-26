package org.example.AbstractFactory.Simple;

public class SedanElectric extends Car{
    @Override
    void cargoSpace() {
        System.out.println("4 seating");
    }

    @Override
    void carType() {
        System.out.println("Electric");
    }
}
