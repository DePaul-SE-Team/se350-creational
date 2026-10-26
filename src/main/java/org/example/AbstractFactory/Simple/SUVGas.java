package org.example.AbstractFactory.Simple;

public class SUVGas extends Car{
    @Override
    void cargoSpace() {
        System.out.println("6 seating");
    }

    @Override
    void carType() {
        System.out.println("Gas");
    }
}

