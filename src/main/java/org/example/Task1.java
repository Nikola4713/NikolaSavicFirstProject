package org.example;

public class Task1 {
    public static void main(String[] args) {
        int [] temperature={32,38,44,56,82,104,76,90};
        int max=0;
        for(int i=0;i<temperature.length;i++)
        {
            if(max<temperature[i])
            {
                max=temperature[i];
            }
        }
        System.out.println("The maximum temperature is " + max);
    }
}
