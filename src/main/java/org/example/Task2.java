package org.example;

public class Task2 {
    public static void main(String[] args) {
        int [] values={4,8,16,32,64,128,256,512,1024};

        int sum=0;
        for(int i=0; i< values.length; i++ )
        {
            if(sum<values[i])
            {
                sum=sum+values[i];
            }
        }
        System.out.println("The summary of all numbers in array is " + sum);
    }
}
