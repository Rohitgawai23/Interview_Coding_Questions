package _MNC_Coding_Que;

import java.util.Scanner;

public class Factorial_ {
    public static void main(String[] args) {

         Scanner sc=new Scanner(System.in);
         int fact=1;
         System.out.println("Enter value: ");
         int n=sc.nextInt();

         for(int i=1;i<=n;i++){
             fact *=i;
         }
         System.out.println("factorial of "+n+" is "+fact);

    }
}
/*
Output :

        Enter value :
        5
        Factorial of 5 is 120

 */
