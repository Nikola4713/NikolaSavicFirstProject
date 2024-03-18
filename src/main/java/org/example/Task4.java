package org.example;

public class Task4 {
    public static void main(String[] args) {
        int [][] numbers={
                {4,9,16,33,64,129,256,513,1024},
                {3,8,15,32,65,128,255,512,1023}
        };
        int sum1=0;
        int sum2=0;
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<9;j++)
            {
                if(numbers[i][j] %2==0)
                {
                    sum1=sum1+numbers[i][j];


                }
                if(numbers[i][j]%2!=0)
                {
                    sum2=sum2+numbers[i][j];
                }
            }

        }
        System.out.println("The summary of Even numbers in the array is: "+sum1);
        System.out.println("The summary of Odd numbers in the array is :" + sum2);

    }
}
