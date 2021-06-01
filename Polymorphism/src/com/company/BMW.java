package com.company;

public class BMW extends Car{
    private int wheels;
    private int engine;
    private int cylinders;
    private int doors;
    private int speed;


    public BMW(int engine, int cylinders, int doors, int wheels, int speed) {
        super(engine, cylinders, doors, wheels, speed);
        this.wheels = wheels;
        this.engine = engine;
        this.cylinders = cylinders;
        this.doors = doors;
        this.speed = speed;
    }

    @Override
    public void accelerate(int amount) {
        System.out.println("The BMW is moving at a speed of " + (this.speed + amount));
        this.speed += amount;
    }
}
