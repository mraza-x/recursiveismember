import java.util.*;

/**
Mohammed Raza
CSC 236 - Lab1 # 4 (main)
*/

public class RecursiveIsMember
{

   public static void main(String[] args)
   {

       int[] num = {2,4,6,8,10,12,14,16,18,20};
	   int index = 20;

   }

   public static boolean isMember(int[] num, int index)

   {
      if(num[num.length]%2 != 0)

    	return false;

      if(num[num.length]%2 == 0)

        System.out.println(num[num.length] + " is in the array");

        num[index] = num[ num.length - 1];

        //
        // Dr. Zale, I do not understand how to do this.
        // The recursive method will not let me pass
        // num[num.length - 1] and index - 1.
        // This compiles, but it does not work correctly.
        //

        return isMember(num, index - 1);

   }

}