package _MNC_Coding_Que;

public class StringToInteger {
    public static void main(String[] args) {
        String str="371211";
        int res=Integer.parseInt(str);        // Using Integer.parseInt()
        int result = Integer.valueOf(str);    // Using Integer.valueOf()
        System.out.println("The Converted int is: "+result);
        System.out.println("The Converted int is: "+res);
    }
}
