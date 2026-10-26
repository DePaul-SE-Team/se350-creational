package org.example.FactoryMethod.Simple;

public class Client {
    public static void main(String [] args)
    {
        CarFactoryMethod factoryMethod = new HyundaiFactoryMethod();
        factoryMethod.createCar();
    }
}

interface CarFactoryMethod{
    public Car createCar();
}

class HyundaiFactoryMethod implements CarFactoryMethod{
    public Car createCar(){
        return new Hyundai();
    }
}

class ToyotaFactoryMethod implements CarFactoryMethod{
    public Car createCar(){
        return new Toyota();
    }
}


interface Car{
}

class Hyundai implements Car {
}

class Toyota implements Car {
}

