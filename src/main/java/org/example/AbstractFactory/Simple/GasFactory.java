package org.example.AbstractFactory.Simple;

public class GasFactory implements CarFactory {
    @Override
    public Car buildSudanCar() {
        return new SedanGas();
    }

    @Override
    public Car buildSUVCar() {
        return new SUVGas();
    }
}
