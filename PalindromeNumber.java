package _MNC_Coding_Que;

public class PalindromeNumber {
    public static void main(String[] args) {


        int NO=121;
        int rev=0, rem;

        for(int i=NO; i!=0; i=i/10){
            rem=i%10;
            rev=rev*10+rem;
        }
        if(NO==rev)
            System.out.println("It is palindrome Number");
        else
            System.out.println("It is not palindrome number ");





    }
}
