package org.example;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers!");
        System.out.println("First number is : ");
        int num1= input.nextInt();
        System.out.println("Second number is : ");
        int num2= input.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.println("Value of the first number after swaping is "+ num1);
        System.out.println("Value of the second number after swaping is " + num2);
    }
}
