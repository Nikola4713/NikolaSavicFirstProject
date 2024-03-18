package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};

        Arrays.sort(array);
        System.out.println("Lowest number is : "+array[0]);
        System.out.println("Largest number is :" +array[5]);
    }
}
