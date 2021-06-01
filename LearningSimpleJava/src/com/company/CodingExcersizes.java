package com.company;

public class codingExcersizes {
    public static void main(String[] args) {

//    Area Challenge
//        System.out.println("The area of a circle with a radius of 70 is : " + area(70));
//        System.out.println("The area of a rectangle with side a as 50 and b as 45 is : " + area(50,45));

    }

//    Area challenge :
    public static double area(double radius) {
        if (radius < 0) {
            System.out.println("Invalid.");
            return -1.0;
        } else {
            return (radius * radius * 22 / 7);
        }
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            System.out.println("Invalid.");
            return -1.0;
        } else {
            return (x*y);
        }
    }



//    Day Year  Challenge
//    1 day = 1440minutes
//    i year = 525600minutes
    public static void printYearsAndDays(long  minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else{
            long day, year, calcMinutes;
            calcMinutes = minutes;
            year =(long) (minutes / 525600);
            calcMinutes= minutes - (year * 525600);
            day =(long) (minutes / 1440);
            calcMinutes = minutes - (day * 1440);

            System.out.println(minutes+" = "+year+" y "+day+" d.");
        }
    }
}
