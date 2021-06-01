package com.company;

public class Vehicle {
    private int speed;
    private boolean drivingByHand;
    private int increaseSpeed;
    private int decreaseSpeed;
    private int maxSpeed;
    private int LowestSpeed;
    private String Movement;


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isDrivingByHand() {
        return drivingByHand;
    }

    public void setDrivingByHand(boolean drivingByHand) {
        this.drivingByHand = drivingByHand;
    }

    public int getIncreaseSpeed() {
        return increaseSpeed;
    }

    public void setIncreaseSpeed(int increaseSpeed) {
        this.increaseSpeed = increaseSpeed;
    }

    public int getDecreaseSpeed() {
        return decreaseSpeed;
    }

    public void setDecreaseSpeed(int decreaseSpeed) {
        this.decreaseSpeed = decreaseSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getLowestSpeed() {
        return LowestSpeed;
    }

    public void setLowestSpeed(int lowestSpeed) {
        LowestSpeed = lowestSpeed;
    }

    public String getMovement() {
        return Movement;
    }

    public void setMovement(String movement) {
        Movement = movement;
    }

    public int speedAddOrSubtract(String increaseOrDecrease, int amount){
        if (increaseOrDecrease == "increase"){
            this.speed += amount;
            return (speed += amount);
        }else{
            this.speed -= amount;
            return (speed -= amount);
        }
    }

    public Vehicle(int speed, boolean drivingByHand, int increaseSpeed, int decreaseSpeed, int maxSpeed, int lowestSpeed, String movement) {
        this.speed = speed;
        this.drivingByHand = drivingByHand;
        this.increaseSpeed = increaseSpeed;
        this.decreaseSpeed = decreaseSpeed;
        this.maxSpeed = maxSpeed;
        LowestSpeed = lowestSpeed;
        Movement = movement;
    }

    public int setGear(){
        if (this.speed <= 0){
            return 0;
        }else if (this.speed <= 10 && this.speed > 0){
            return 1;
        }else if (this.speed <= 20 && this.speed > 10) {
            return 2;
        }else if (this.speed <= 30 && this.speed > 20) {
            return 3;
        }else if (this.speed <= 40 && this.speed > 30) {
            return 4;
        }else if (this.speed <= 50 && this.speed > 40) {
            return 5;
        }else if (this.speed <= 60 && this.speed > 500) {
            return 6;
        }else{
            return 7;
        }
    }
     public  void moving(String vehicleName){
         System.out.println("The " + vehicleName + " is moving at a speed of " +
                 this.speed + " and is in the gear of " + setGear());
     }

}
