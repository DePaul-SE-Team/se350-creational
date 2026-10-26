package org.example.Builder.Simple;

public class Client {
    public static void main (String [] args){
        Builder builderA = new ConcreteCarBuilder();
        builderA.setDoor(new Door()).setEngine(new Engine()).setSeats(new Seat()).setWindow(new Window());
    }
}

interface Builder{
    public Builder setDoor(Door door);
    public Builder setWindow(Window window);
    public Builder setSeats(Seat seat);
    public Builder setEngine(Engine engine);
    public Car returnCar();
}

class ConcreteCarBuilder implements Builder{
    Car car;
    ConcreteCarBuilder(){
        this.car = new ConcreteCar();
    }
    @Override
    public Builder setDoor(Door door) {
        car.setDoor(door);
        return this;
    }

    @Override
    public Builder setWindow(Window window) {
        car.setWindow(window);
        return this;
    }

    @Override
    public Builder setSeats(Seat seat) {
        car.setSeats(seat);
        return this;
    }

    @Override
    public Builder setEngine(Engine engine) {
        car.setEngine(engine);
        return this;
    }

    @Override
    public Car returnCar(){
        return this.car;
    }

}

interface Car{
    public void setDoor(Door door);
    public void setWindow(Window window);
    public void setSeats(Seat seat);
    public void setEngine(Engine engine);
}


// setter in the car...
// this helps in avoiding subclassing...
class ConcreteCar implements Car{
    private Door door;
    private Window window;
    private Seat seat;
    private Engine engine;

    // need to return a builder
    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    @Override
    public void setWindow(Window window) {
        this.window = window;
    }

    @Override
    public void setSeats(Seat seat) {
        this.seat = seat;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}

/* Item you add on to the product you are building */
class Door{}
class Window{}
class Seat{}
class Engine{}

