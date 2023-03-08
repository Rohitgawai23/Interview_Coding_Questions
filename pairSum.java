package _MNC_Coding_Que;

public class pairSum {
    public static void main(String[] args) {
        int array[] = {5, 3, 6, 1};
        int sum = 9;
        int c = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == sum) {
                    System.out.println("pairs of " + sum + " is: " + array[i] + "+" + array[j]);
                    c++;
                }
            }
        }
        if (c == 0)
            System.out.println("Pairs is Not found in array: ");

    }
}
