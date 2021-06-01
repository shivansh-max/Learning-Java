package com.company;


public class Wall {
    private String direction;

    public Wall(String direction) {
        this.direction = direction;
    }

    public String getDirection() {
        return direction;
    }

    public void window(String weather){
        System.out.println("Looking outside the window I see a " + weather + " sky.");
    }
}
