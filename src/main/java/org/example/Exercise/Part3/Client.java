package org.example.Exercise.Part3;
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new KiaFactory();
        Car car = factory.createCarType();
    }
}


interface CarFactory{
    public Car createCarType();
}

class KiaFactory implements CarFactory{
    @Override
    public Car createCarType() {
        return new Kia();
    }
}
class ToyotaFactory implements CarFactory{
    @Override
    public Car createCarType() {
        return new Toyota();
    }
}


enum CarType{
    KIA,
    TOYOTA
}
interface Car {}
class Kia implements Car{}
class Toyota implements Car{}