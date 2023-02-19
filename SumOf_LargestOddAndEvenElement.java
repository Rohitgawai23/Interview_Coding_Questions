package _MNC_Coding_Que;
/*
  given an array of a integers returns the sum of largest odd integer and largest even integer in A
  if their are no odd no even integer in A you assume that the largest one in the group is 0.
  eg. [5,3,10,6,11] answer : 21
      [20,10,7,5]   answer : 27
*/
public class SumOf_LargestOddAndEvenElement {
    public static int SumOfLargestOddAndEven(int A[])
    {
        int maxEven=0;
        int maxOdd=0;

        for(int i=0; i<A.length; i++) {
            if (A[i] % 2 == 0 && A[i] > maxEven) {
                maxEven = A[i];
            } else if (A[i] % 2 != 0 && A[i] > maxOdd) {
                maxOdd = A[i];
            }
        }
        return maxEven+maxOdd;
    }

    public static void main(String[] args) {
        int A[]={5,3,10,6,11};
       // int A[]={20,10,7,5};
        System.out.println("Sum of largest odd and even integer in A1 : "+ SumOfLargestOddAndEven(A));

    }
}
