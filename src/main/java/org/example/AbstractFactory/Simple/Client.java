package org.example.AbstractFactory.Simple;

public class Client {
    public static void main (String [] args){
        CarFactory electricFactory = new ElectricFactory();
        Car sudanElectric = electricFactory.buildSudanCar();
        Car SUVElectric = electricFactory.buildSUVCar();

        sudanElectric.carType();
        SUVElectric.carType();
    }
}
