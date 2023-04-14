package _MNC_Coding_Que;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class ReverseEachWordOfString {
    public static void main(String[] args)
    {
        String str = "This is a sample sentence.";
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String w : words) {
            StringBuilder reversedWord = new StringBuilder(w);
            reversedWord.reverse();
            sb.append(reversedWord).append(" ");
        }
        System.out.println(sb.toString().trim());
/*

        // Initialize the input string
        String str = "This is a sample sentence.";

        // Split the string into an array of words using " " (space) as the delimiter
        String[] words = str.split(" ");

        // Create a list to store the reversed words
        List<String> wordList = new ArrayList<>();

        // Reverse each word in the words array and add it to the wordList
        for (String word : words) {
            // Create a StringBuilder object to reverse the current word
            StringBuilder reversedWord = new StringBuilder(word);
            // Reverse the current word using the reverse() method
            reversedWord.reverse();
            // Add the reversed word to the wordList
            wordList.add(reversedWord.toString());
        }

        // Create a StringBuilder to concatenate the reversed words
        StringBuilder sb = new StringBuilder();

        // Concatenate the reversed words from the wordList with a space after each word
        for (String reversedWord : wordList) {
            sb.append(reversedWord).append(" ");
        }

        // Trim any extra spaces at the end of the resulting string
        String result = sb.toString().trim();

        // Print the result
        System.out.println(result);

*/

    }
}
