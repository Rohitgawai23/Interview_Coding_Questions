package _MNC_Coding_Que;

public class Reverse_string {
    public static void main(String[] args) {

        String str = "welcome to cloudtech";
        for(int i=str.length()-1; i>=0; i--){
            System.out.print(str.charAt(i));
        }

    }
}

/*
OutPut:
        hcetduolc ot emoclew
*/
