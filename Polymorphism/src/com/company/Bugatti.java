package com.company;

public class Bugatti extends Car{
    private int wheels;
    private int engine;
    private int cylinders;
    private int doors;
    private int speed;

    public Bugatti(int engine, int cylinders, int doors, int wheels, int speed) {
        super(engine, cylinders, doors, wheels, speed);
        this.wheels = wheels;
        this.engine = engine;
        this.cylinders = cylinders;
        this.doors = doors;
        this.speed = speed;
    }
    @Override
    public void accelerate(int amount) {
        System.out.println("The Bugatti is moving at a speed of " + (this.speed + amount));
        this.speed += amount;
    }
}
