package com.company;

public class meathodOverloading {
    public static void main(String[] args) {
//        System.out.println("12 feet and 5 inches in centimeters is:" + calcFeetAndInchesToCentimeters(5,12) + " cm"
        System.out.println("37 inches are " + calcFeetAndInchesToCentimeters(1));
    }

    public static double calcFeetAndInchesToCentimeters(double inches, double feet) {
//        1 inch = 2.54 centimeter
        feet = feet * 12;
        double total = (feet + inches);
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            return (total * 2.54);
        } else {
            System.out.println("Invalid");
            return -1.0;
        }
    }

    public static final String TEXT = "bobob";

    public static double calcFeetAndInchesToCentimeters(double inches) {
//        12 inch = 1 foot
        System.out.println(TEXT);
        if (inches >= 0) {
            double feet = (int) (inches / 12);
            System.out.println(feet);
            inches = inches - (feet * 12);
            return calcFeetAndInchesToCentimeters(inches, feet);
        } else {
            System.out.println("Invalid");
            return -1.0;
        }

    }

}
