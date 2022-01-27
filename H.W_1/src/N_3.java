/**
 * Created by Msi1 on 1/17/2022.
 */

import java.util.Random;


public class N_3 {

    public static void PrintArray ( int array[] )
    {
        for (int i = 0; i <array.length ; i++)
            System.out.println(array[i]);
    }

    public  static int [] removeElement ( int array [] ) {
        Random objRandom = new Random();
        int randomIndex = objRandom.nextInt(array.length);
        for (int i = 0; i <array.length ; i++) {


            if (array[randomIndex]>0)
                array [randomIndex] = -1;
               else
                  randomIndex = objRandom.nextInt(array.length);


            }




        return array;
    }

    public static void main(String[] args) {

       /* Write a Java method that repeatedly selects and removes a random
        entry from an array until the array holds no more entries. */


       int array [] = {10,20,30,40,50};

        removeElement(array);
        PrintArray(array);


    }
}
