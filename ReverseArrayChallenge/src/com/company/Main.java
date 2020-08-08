package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    public static void main(String[] args) {
        int[] array = {1,5,3,7,11,9,15};
        System.out.println("Array = "  + Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed Array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array){

        int maxIndex = array.length - 1;
        int halfLenght = array.length/2;
        for (int i=0;i<halfLenght;i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
