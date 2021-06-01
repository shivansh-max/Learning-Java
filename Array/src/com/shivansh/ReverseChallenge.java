package com.shivansh;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseChallenge {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter the amount of elements : \r");
        Scanner amounta = new Scanner(System.in);
        int amount = amounta.nextInt();

        int[] array = getIntegers(amount);
        reverse(array);
        amounta.close();
    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity +" integer values:\r");
        for(int i=0; i<array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.close();
        return array;

    }

    public static void printArray(int[] array) {
        for(int i=0; i<array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }

    public static void reverse(int[] array) {
        int[] reverseArray = new int[array.length];

        int reverseVal = 0;
        int maxIndex = array.length - 1;
        int switcher;

        for (int i = 0; i < array.length; i++) {
            switcher = array[maxIndex];
            reverseArray[reverseVal] = switcher;

            reverseVal++;
            maxIndex--;

        }

        System.out.println("Your array is : " + Arrays.toString(array));
        array = reverseArray;
        System.out.println("Reversed list is : " + Arrays.toString(array));
    }
}
