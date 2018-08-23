//Program to search the minimum and maximum element in array.
package Core_java04;

import java.util.Arrays;
import java.util.Collections;

public class max_min_Array
{
    public static void main(String args[])
    {
        Integer[] num={8,4,5,6,4,3,1,0};
        int min=(int) Collections.min(Arrays.asList(num));
        int max=(int) Collections.max(Arrays.asList(num));
        System.out.println("Min Numbers : "+min);
        System.out.println("Max Numbers : "+max);
        Collections.min(Arrays.asList(num));

    }
}
