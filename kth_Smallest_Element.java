package _MNC_Coding_Que;

import java.util.Arrays;
//  Given an array and a number K where K is smaller than the size of the array.
//  Find the K’th smallest element in the given array. Given that all array elements are distinct.
//  Input :-  arr[] = {7, 10, 4, 3, 20, 15};
//  K = 3
//  Output :-  7
public class kth_Smallest_Element
{
    static int kthsmallest(Integer [] arr, int k){
        Arrays.sort(arr);

        return arr[k-1];
    }

    public static void main(String[] args)
    {
        Integer arr[]=new Integer[]{7, 10, 4, 3, 20, 15};
        int k=3;
        System.out.println(kthsmallest(arr,k));


    }

}
