package com.company;

import java.util.Scanner;

public class addTenNumbers {
    public static void main(String[] args) {
        int count = 1;
        int num = 0;
        boolean validNum;
        while (count <= 10){
            System.out.println("Enter number " + count + " :");
            Scanner Input = new Scanner(System.in);
            validNum = Input.hasNextInt();
            if (validNum){
                num += Input.nextInt();
            }else {
                System.out.println("Invalid Number");
            }
            count ++;
        }
        System.out.println("The answer is : " + num);
    }
}
