package org.example;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number= scanner.nextInt();
        boolean flag=false;
        for(int i=2;i<=number/2;i++)
        {
            if(number%i ==0)
            {
                flag=true;
                break;
            }
        }
        if(!flag)
        {
            System.out.println(number+ " is a prime number");
        }
        else System.out.println(number+ " is not a prime number");
    }
}
