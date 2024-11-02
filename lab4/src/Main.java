import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


// Given text. The text is divided into words, it is assumed that a word is a
// group of characters that do not contain spaces and are separated by spaces from
// other words. The text may contain several sentences, the end of a sentence is
// indicated by a period. Write a program to process text information according to
// the specified condition.
// Determine if the text contains characters other than letters and spaces.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("[^a-zA-Zа-яА-Я ]");
        Matcher matcher = pattern.matcher(text);
        System.out.printf("Text contains non-letter and non-space characters: %b\n", matcher.find());
    }
}