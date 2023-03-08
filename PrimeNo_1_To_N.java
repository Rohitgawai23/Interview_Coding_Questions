package _MNC_Coding_Que;

import java.util.Scanner;

public class PrimeNo_1_To_N {
    static {
        System.out.println("Prime Number between 1 to 25 : ");
    }
    public static void main(String[] args) {

        int i,j;
        for(i=2; i<=25; i++){
            for(j=2; j<=i; j++){
                if(i%j==0)
                    break;
            }
            if(i==j)
                System.out.print(i+" ");
        }


    }
}
