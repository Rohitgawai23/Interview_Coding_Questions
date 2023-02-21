package _MNC_Coding_Que;
// Swapping 2 variable using third variable

public class Swap_2_number {
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        System.out.println("Before Swapping");
        System.out.println("value of x: "+ x);
        System.out.println("value of y: "+ y);

        System.out.println("After Swapping");
        int temp = x;
        x = y;
        y = temp;
        System.out.println("value of x: "+ x);
        System.out.println("value of y: "+ y);



    }
}
