package org.example.AbstractFactory.Simple;

public class ElectricFactory implements CarFactory {
    @Override
    public Car buildSudanCar() {
        return new SedanElectric();
    }

    @Override
    public Car buildSUVCar() {
        return new SUVElectric();
    }
}
