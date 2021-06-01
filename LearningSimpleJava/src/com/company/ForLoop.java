package com.company;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {
        System.out.println("Please enter the number from where you wan't to find the first three prime numbers : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        forLoopChallenge(n);

        System.out.println("");
        System.out.println("#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$#%$");
        System.out.println("");

        // other challenge
        int count = 0;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if ((i % 5 == 0) && (i % 3 == 0)) {
                sum += i;
                System.out.println(count + 1 + " number is : " + (sum));
                count += 1;
            }

            if (count == 5) {
                System.out.println("Found five numbers !");
                break;
            }
        }


    }

    public static void forLoopChallenge(int n) {
        int count = 0;
        //n
        for (int i = n; i > (long) Math.sqrt(n); i++) {
            if (isPrime(i)) {
                count += 1;
                System.out.println(count + " prime number is " + i);
            }

            if (count == 3) {
                break;
            }

        }

    }

    public static boolean isPrime(int num) {
        if (num == 0) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {

//            System.out.println(i);
            if (num % i == 0) {
//                System.out.println("It is not prime");
                return false;
            }
        }
//        System.out.println("It is prime");
        return true;
    }
}
