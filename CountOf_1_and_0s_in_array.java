package _MNC_Coding_Que;

public class CountOf_1_and_0s_in_array {
    public static void main(String[] args) {
    /*    int arr[] = {0,1,1,0,1,0,1,1,1,0,0};
        int CountOf_1 =0,CountOf_0 =0;

       for(int i=0; i<arr.length; i++)
       {
           if(arr[i] == 1)
           {
               CountOf_1++;
           }
       }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] == 0)
            {
                CountOf_0++;
            }
        }
        System.out.println("Number of 1s are :"+CountOf_1);
        System.out.println("Number of 0s are :"+CountOf_0);
*/

        int arr[] = {0,1,1,0,1,0,1,1,1,0,0};
        int countof_1 = 0;
        int countof_0 = 0;

        for(int i=0; i<arr.length; i++){
            if(arr[i] == 1)
                countof_1++;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] ==0)
                countof_0++;
        }
        System.out.println("Number of 1s are: "+countof_1);
        System.out.println("Number of 0s are: "+countof_0);

    }
}
