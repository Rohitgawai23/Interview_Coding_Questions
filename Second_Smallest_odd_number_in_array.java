package _MNC_Coding_Que;
 import java.util.*;


public class Second_Smallest_odd_number_in_array {
    public static void main(String[] args) {
        int[] arr = {122,367,378,478,901,839,849,452,129,290,138,299,827,388,232,104,928,302,348,340,124,435,346,235,117,103,102,875,908};

        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\n2nd Smallest odd number in Array: ");

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]%2 != 0)
            {
                count++;
                if(count == 2)
                {
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}

/*
102 103 104 117 122 124 129 138 232 235 290 299 302 340 346 348 367 378 388 435 452 478 827 839 849 875 901 908 928
        2nd Smallest odd number in Array: 117

*/
