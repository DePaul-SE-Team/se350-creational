package org.example.Exercise.Part4;
public class Client {
    public static void main(String[] args) {
        CarFactory factory = new KiaFactory();
        Car car = factory.createCarType();
    }
}


interface CarFactory{
    public Car createCarType();
    public Engine createEngineType();
}

class KiaFactory implements CarFactory{
    @Override
    public Car createCarType() {
        return new Kia();
    }

    @Override
    public Engine createEngineType() {
        return new KiaEngine();
    }
}
class ToyotaFactory implements CarFactory{
    @Override
    public Car createCarType() {
        return new Toyota();
    }

    @Override
    public Engine createEngineType() {
        return new ToyotaEngine();
    }
}


enum CarType{
    KIA,
    TOYOTA
}

// product A
interface Car {}
class Kia implements Car{}
class Toyota implements Car{}

// product B
interface Engine{}
class KiaEngine implements Engine{}
class ToyotaEngine implements Engine{}