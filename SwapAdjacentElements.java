package _MNC_Coding_Que;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SwapAdjacentElements {
    public static void main(String[] args)
    {
        Integer array[] ={1,2,3,4,5,6};
        List<Integer> l= Arrays.asList(array);
        Collections.swap(l,0,1);
        Collections.swap(l,2,3);
        Collections.swap(l,4,5);

        for(int i=0; i<array.length; i++){
            array[i]=l.get(i);
            System.out.print(array[i]+" ");
        }

    }
}
