//Program to Reverse an Array.
package Core_java04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Reverse_array
{
    public static void main(String args[])
    {
        ArrayList arrayList=new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("Before Reverse Order : "+arrayList);
        Collections.reverse(arrayList);
        System.out.println("After Reverse Order : "+arrayList);



    }
}
