package _MNC_Coding_Que;

public class String_UpperToLowerCase {
    public static void main(String[] args)
    {
        String str = "Java Compiler";
        String s1[] = str.split("");
        char ch[] = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z')
                s1[i] = s1[i].toUpperCase();
            else
                s1[i] = s1[i].toLowerCase();
        }
        for (int i = 0; i < s1.length; i++) {
            System.out.print(s1[i]);
        }


    }
}
