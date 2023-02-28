package _MNC_Coding_Que;

public class MissingNumbers_inArray
{
    static void MissingElements(int arr[], int N)
    {
        int diff = arr[0] - 0;

        for(int i=0; i<N; i++)
        {
            if(arr[i]-i != diff)
            {
                while(diff < arr[i]-i)
                {
                    System.out.print((i+diff) + " ");
                    diff++;
                }
            }
        }
    }
    public static void main(String[] args)
    {
        int arr[] ={2,3,5,8};
        int N = arr.length;
        MissingElements(arr,N);

    }
}

/*
This Java program is meant to find the missing elements in an array of integers. Here's a step by step explanation of the code:

The class "MissingNumbers_inArray" is defined.

A static method "MissingElements" is defined, which takes two arguments: an array of integers "arr" and an integer "N" (the length of the array).

In the "MissingElements" method, a variable "diff" is declared and initialized to the difference between the first element of the array and 0.

A for loop is used to iterate through the array. In each iteration, the difference between the current element and its index is compared with the "diff" value.

If the difference between the current element and its index is not equal to "diff", then a while loop is executed.

The while loop continues until the difference between the current element and its index is equal to "diff".

Within the while loop, the missing elements are printed to the console using the "System.out.print" method. The missing element is calculated as the sum of the current index and the difference between the current element and its index.

The "diff" value is then incremented by 1 in each iteration of the while loop.

After the for loop, the "MissingElements" method ends.

In the "main" method, an array of integers is declared and initialized.

The length of the array is stored in the "N" variable.

The "MissingElements" method is called with the array and "N" as arguments.

The "main" method ends and the program terminates.
*/

