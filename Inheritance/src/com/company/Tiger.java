package com.company;

public class Tiger extends Animal{
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    public Tiger(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    private void chew() {
        System.out.println("Tiger gobled it's food !!!");
    }

    @Override
    public void eat() {
        System.out.println("RRRROOOAAARRR !!!");
        chew();
        super.eat();
    }

    public void run(){
        int speed = 70;
        super.move(speed);
    }

    public void walk(){
        int speed = 15;
        super.move(speed);
    }

}
