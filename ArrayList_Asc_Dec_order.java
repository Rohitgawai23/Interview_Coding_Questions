package _MNC_Coding_Que;

import java.util.ArrayList;

import java.util.Collections;

public class ArrayList_Asc_Dec_order {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(9);
        list.add(1);
        list.add(13);

        System.out.println("Default Order: "+list);

        Collections.sort(list);  // Ascending Order
        System.out.println("Ascending Order: "+list);

        Collections.sort(list,Collections.reverseOrder());  // Descending Order
        System.out.println("Descending Order: "+list);


    }
}

/*
Output:
    Default Order: [3, 5, 9, 1, 13]
    Ascending Order: [1, 3, 5, 9, 13]
    Descending Order: [13, 9, 5, 3, 1]
*/