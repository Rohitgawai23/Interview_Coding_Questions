package _MNC_Coding_Que;

import java.util.Scanner;

public class Fibonacii_series
{
    static {
        System.out.println("Fibonacci series :");
    }
    public static void main(String[] args)
    {
        int no1=0, no2=1;
        for(int i=0; i<10; i++)
        {
            int no3=no1+no2;
            System.out.print(no1+" ");
            no1 = no2;
            no2 = no3;
        }

    }
}
