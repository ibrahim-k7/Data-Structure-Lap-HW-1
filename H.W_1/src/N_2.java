/**
 * Created by Msi1 on 1/17/2022.
 */
public class N_2 {

    public static void PrintArray ( int array[] )
    {
        for (int i = 0; i <array.length-1 ; i++)
            System.out.println(array[i]);
    }

    public static int[] CopyArray (int fromArray [] , int toArray [] )
    {
        for (int i = 0; i <fromArray.length-1 ; i++)
            toArray[i] = fromArray[i];

        return toArray;
    }

    public static void main(String[] args) {

        /*Write a Java method that Clone an array to a backup array.*/

        int array [] = {11,22,33,44,55,66};

        int backupArray [] = new int[array.length];

        CopyArray(array , backupArray);

        PrintArray(backupArray);

    }
}
