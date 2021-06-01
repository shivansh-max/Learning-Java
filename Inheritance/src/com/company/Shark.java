package com.company;

public class Shark extends Animal {

    private int gills;
    private int eyes;
    private int fins;

    public Shark(String name, int size, int weight, int gills, int eyes, int fins) {

        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    public void rest() {
        System.out.println("Bub bub bub the shark is asleep.");
    }

    public void moveMuscles() {
        System.out.println("Swish Swish the shark is moving");
    }

    public void moveBackFin() {
        System.out.println("Shhhhhhhhh the sharkes top fin is cutting the water.");
    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
        System.out.println("Munch The shark has eaten.");
        rest();

    }
}