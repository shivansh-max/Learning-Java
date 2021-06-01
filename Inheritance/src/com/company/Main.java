package com.company;

public class Main {

    public static void main(String[] args) {
        // Tiger inherit form the animal
        System.out.println("Tiger: ");
        Tiger tiger = new Tiger("Anousha", 99, 120, 2,
                4, 1, 70, "Orange with some black stripes");

        tiger.eat();
        tiger.run();
        tiger.walk();

        System.out.println();
        System.out.println();
        System.out.println();


        // Shark inherit form the animal
        System.out.println("Shark : ");
        Shark shark = new Shark("Shivansh", 30, 90, 10, 2, 3);

        shark.swim(60);


        System.out.println();
        System.out.println();
        System.out.println();


        // Veichal is not an inheated class
        System.out.println("Car : ");
        Vehicle car = new Vehicle(50, true, 10, 10, 240, 0, "road");

        car.moving("Lamborghini");


        System.out.println();
        System.out.println();
        System.out.println();


        // Circle
        System.out.println("Circle : ");
        Circle circle = new Circle(50.0);
        System.out.println(("The Area Of a 50 feet circle is : " + circle.getArea() + " feet."));

        // Cylinder
        System.out.println("Cylinder : ");
        Circle Cylinder = new Cylinder(50.0, 50.0);
        System.out.println(("The Volume of a cilender with the height of 50 feet and the radius of 50 feet is : " + circle.getArea() + " feet."));
    }
}
