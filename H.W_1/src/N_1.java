/**
 * Created by Msi1 on 1/17/2022.
 */
public class N_1 {
   public static void PrintArray ( int array[] )
   {
       for (int i = 0; i <array.length ; i++)
           System.out.println(array[i]);
   }
   public static int [] ReverseUsingAnotherArray ( int array[]  )
   {
       int swapArray [] = new int[array.length];

       for (int i = 0 ; i <array.length ; i++ )
           swapArray[i]=array[i];

       for (int i = 0 , j=array.length-1; i <array.length ; i++,j--)
           array[i]=swapArray[j];

       return array;
   }

    public static void main(String[] args) {

       /* Write a Java method that Reverse an array using another array */

        int array []= {100,200,300,400,500};

        PrintArray(ReverseUsingAnotherArray(array));

    }
}
