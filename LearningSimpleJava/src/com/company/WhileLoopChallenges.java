package com.company;

public class whileLoopChallenges {
    public static void main(String[] args) {
        getLargestPrime(24);
    }

    public static int getLargestPrime (int number){
        int getTheGreatestPrimeFactor = 0;

        if (number < 0) {
            return -1;
        }

        for (int i = 1; i <= number / 2;i++){
//            System.out.println(i);
            if (number % i == 0 && (i > getTheGreatestPrimeFactor)){
                getTheGreatestPrimeFactor = i;
                System.out.println(getTheGreatestPrimeFactor);
            }

        }

        return getTheGreatestPrimeFactor;
    }

}