package Java_Coding_Programming.String_Manupulation;

public class CountWordInString {
    public static void main(String[] args) {
        String str = "This is a sample string to count words";

        // Split the string by whitespace and get the array of words
        String[] words = str.trim().split(" ");

        // The length of the array gives the word count
        int wordCount = words.length;

        System.out.println("Word count: " + wordCount);
    }
}
