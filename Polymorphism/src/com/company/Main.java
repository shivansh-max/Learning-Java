package com.company;


public class Main {

    public static void main(String[] args) {
        for(int i=1; i<11; i++) {
            Movie movie =
                    randomMovie();
            assert movie != null;
            System.out.println("Movie #" + i +
                    " : " + movie.getName() + "\n" +
                    "Plot: " + movie.plot() + "\n");
        }

        Cars();
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }

    public static void Cars(){
        BMW Bmw = new BMW(9, 8,4,4,80);
        Lamborghini Lam = new Lamborghini(9, 8,4,4,80);
        Bugatti Bug = new Bugatti(9, 8,4,4,80);

        Bmw.startEngine();
        System.out.println();
        Bmw.accelerate(70);
        System.out.println();
        Lam.startEngine();
        System.out.println();
        Lam.accelerate(80);
        System.out.println();
        Bug.startEngine();
        System.out.println();
        Bug.accelerate(90);

    }
}
