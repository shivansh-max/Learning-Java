package com.company;

public class swithChallenge {
    public static void main(String[] args) {
//        if (isLeapYear(0)) {
//            System.out.println("YES");
//        } else {
//            System.out.println("NO");
//        }
        getDaysInMonth(-2,1700);

    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;
            } else {
                return false;
            }

        } else {
            return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        int monthIntoDay = 0;
        if ((month < 1 || month > 12) || (year < 1 || year > 9999)) {
            return -1;
        }
        switch (month) {

            case 1:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");
                break;
            case 2:
                if (isLeapYear(year)) {
                    monthIntoDay = 29;
                    System.out.println(monthIntoDay + " are the amount of days in the year " + year + " .");
                } else {
                    monthIntoDay = 28;
                    System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                }
                break;
            case 3:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 4:
                monthIntoDay = 30;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 5:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 6:
                monthIntoDay = 30;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 7:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 8:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 9:
                monthIntoDay = 30;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 10:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 11:
                monthIntoDay = 30;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
            case 12:
                monthIntoDay = 31;
                System.out.println(monthIntoDay + "are the amount of days in the year " + year + " .");

                break;
        }

        return monthIntoDay;
    }
}

