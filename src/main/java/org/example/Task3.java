package org.example;

public class Task3 {
    public static void main(String[] args) {
        int [][] oddEvenNumbers={
                {4,9,16,33,64,129,256,513,1024},
                {3,8,15,32,65,128,255,512,1023}
        };
        System.out.println("Even numbers in this 2D array are: ");
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<9;j++)
            {
                if(oddEvenNumbers[i][j] %2 ==0)
                {
                    System.out.print(oddEvenNumbers[i][j]+ " ");
                }
            }
        }

    }
}
