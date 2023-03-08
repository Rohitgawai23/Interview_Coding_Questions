package _MNC_Coding_Que;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int no =153;
        int rev = 0, rem;

        for(int i=no; i!=0; i=i/10){
            rem = i % 10;
            rev = rev +(rem*rem*rem);
        }
        if(no == rev){
            System.out.println("It is Armstrong number :");
        }
        else{
            System.out.println("It is not Armstrong number :");
        }
    }
}
