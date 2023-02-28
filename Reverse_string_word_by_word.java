package _MNC_Coding_Que;

public class Reverse_string_word_by_word
{
    public static void main(String[] args)
    {

        String str="Rohit Niranjan Gawai";
        String word[]=str.split(" ");
        for(int i=word.length-1; i>=0; i--){
            System.out.print(word[i]+" ");
        }

    }
}

/*
Output:
        Gawai Niranjan Rohit
*/
