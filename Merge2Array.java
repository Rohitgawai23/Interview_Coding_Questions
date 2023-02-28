package _MNC_Coding_Que;

public class Merge2Array
{
    public static void main(String[] args)
    {


        int arr1[]={5,6,7,8,9};
        int arr2[]={0,1,2,3,4};
        int emptyarray[]=new int[arr1.length + arr2.length];

        for(int i=0; i<arr1.length; i++)
            emptyarray[i]=arr1[i];

        for(int i=0; i<arr2.length; i++)
            emptyarray[arr1.length+i]=arr2[i];

        System.out.println("Merge 2 array");
        for(int i=0; i<emptyarray.length; i++)
            System.out.print(emptyarray[i]+" ");

    }
}
