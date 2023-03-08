package _MNC_Coding_Que;

public class palindrome_using_StringBuffer {
    public static void main(String[] args) {

        String str = "level";

        StringBuffer ob = new StringBuffer(str);
        System.out.println(ob.reverse());

        String s = ob.toString();

        if(str.equals(s))
        {
            System.out.println("palindrome string");
        }
        else
        {
            System.out.println("not palindrome string");
        }
    }
}
