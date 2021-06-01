package com.company;

public class Car {
    private int wheels;
    private int engine;
    private int cylinders;
    private int doors;
    private int speed;

    public Car(int engine, int cylinders, int doors, int wheels, int speed) {
        this.engine = engine;
        this.cylinders = cylinders;
        this.doors = doors;
        this.wheels = wheels;
        this.speed = speed;
    }

    public int getWheels() {
        return wheels;
    }

    public int getEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getDoors() {
        return doors;
    }


    public int getSpeed() {
        return speed;
    }

    public void accelerate(int amount){
        System.out.println("Increasing speed by " + amount + " . The current amount is " + this.speed + amount);
        this.speed += amount;
    }

    public void startEngine (){
        System.out.println("Starting the engine.");
        System.out.println("All of the " + cylinders + " are ready. Please enter the car.");
    }
}
