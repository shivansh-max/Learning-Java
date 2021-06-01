package com.company;

public class Switch {
    public static void main(String[] args) {
        switchTesting('A');
        monthForString("Oct");
        printDayOfWeek(5);
        printDayOfWeekBonus(6);
    }

    public static void switchTesting(char myCharValue) {
        switch (myCharValue) {
            case 'A':
            case 'a':
                System.out.println("It is an A.");
                break;
            case 'B':
            case 'b':
                System.out.println("It is an B.");
                break;
            case 'C':
            case 'c':
                System.out.println("It is an C.");
                break;
            case 'D':
            case 'd':
                System.out.println("It is an D.");
                break;
            case 'E':
            case 'e':
                System.out.println("It is an E.");
                break;
            default:
                System.out.println("The letter Wasn't found.");
        }
    }

    public static void monthForString(String myStringMonth) {
        switch (myStringMonth.toLowerCase()) {
            case "january":
                System.out.println("January is the month !");
                break;
            case "february":
                System.out.println("February is the month !");
                break;
            case "march":
                System.out.println("March is the month !");
                break;
            case "april":
                System.out.println("April is the month !");
                break;
            case "may":
                System.out.println("May is the month !");
                break;
            case "june":
                System.out.println("June is the month !");
                break;
            case "july":
                System.out.println("July is the month !");
                break;
            case "august":
                System.out.println("August is the month !");
                break;
            case "september":
                System.out.println("September is the month !");
                break;
            case "october":
                System.out.println("October is the month !");
                break;
            case "november":
                System.out.println("November is the month !");
                break;

            case "december":
                System.out.println("December is the month !");
                break;
            default:
                System.out.println("Spelling mistake !");
                break;
        }
    }

    public static void printDayOfWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday is the day !");
                break;
            case 1:
                System.out.println("Monday is the day !");
                break;
            case 2:
                System.out.println("Tuesday is the day !");
                break;
            case 3:
                System.out.println("Wednesday is the day !");
                break;
            case 4:
                System.out.println("Thursday is the day !");
                break;
            case 5:
                System.out.println("Friday is the day !");
                break;
            case 6:
                System.out.println("Saturday is the day !");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfWeekBonus(int day) {
        if (day == 0) {
            System.out.println("Sunday is the day !");
        } else if (day == 1) {
            System.out.println("Monday is the day !");
        } else if (day == 2) {
            System.out.println("Tuesday is the day !");
        } else if (day == 3) {
            System.out.println("Wednesday is the day !");
        } else if (day == 4) {
            System.out.println("Thursday is the day !");
        } else if (day == 5) {
            System.out.println("Friday is the day !");
        } else if (day == 6) {
            System.out.println("Saturday is the day !");
        } else {
            System.out.println("Invalid day");
        }
    }
}
