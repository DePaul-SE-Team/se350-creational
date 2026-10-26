package org.example.Exercise.Part1;
public class Client {
    public static void main(String[] args) {

    }
    public static Car createCarType(CarType carType){
        return switch(carType){
            case KIA -> new Kia();
            case TOYOTA -> new Toyota();
        };
    }
}


enum CarType{
    KIA,
    TOYOTA
}
interface Car {}
class Kia implements Car{}
class Toyota implements Car{}