package org.example.SimpleFactory;

public class Client {
    public static void main(String [] args)
    {
        SimpleFactory simpleFactory = new SimpleFactory();
        simpleFactory.createCar(CarType.Hyundai);
    }
}

interface Car{
}

class Hyundai implements Car{
}

class Toyota implements Car{
}

enum CarType{
    Hyundai, Toyota
}
class SimpleFactory{
    public Car createCar(CarType carType){
       return switch(carType){
            case Hyundai -> new Hyundai();
            case Toyota -> new Toyota();
        };
    }
}
