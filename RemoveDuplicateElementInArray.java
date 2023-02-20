package _MNC_Coding_Que;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementInArray {
    public static void main(String[] args)
    {
        Integer []Array={1,2,3,4,4,5,5,3,2};
        LinkedHashSet <Integer> set=new LinkedHashSet<>(Arrays.asList(Array));
        Integer [] UniqueArray = set.toArray(new Integer[0]);
        System.out.println("Removing duplicate element in array: "+Arrays.toString(UniqueArray));
        
    }
}
