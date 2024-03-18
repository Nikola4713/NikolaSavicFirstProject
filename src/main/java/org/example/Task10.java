package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
    public static void main(String[] args) {
        String [] array={"apple","apple","juice","juice","cucumber","kiwi"};
        Arrays.sort(array);
        for(int i=0;i< array.length;i++)
        {

            for(int j=i+1;j< array.length;j++)
            {
                if (array[i].equals(array[j]))
                {

                    System.out.println(array[i]);
                }
            }

        }

    }
}