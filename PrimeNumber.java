package _MNC_Coding_Que;

public class PrimeNumber {
    public static void main(String[] args) {

        int num = 10;
        int i;
        for( i=2; i<=num; i++)
        {
            if(num % i == 0)
                break;
        }
        if(num == i)
        {
            System.out.println("It is prime Number");
        }
        else
            System.out.println("it is not prime number ");
    }
}
