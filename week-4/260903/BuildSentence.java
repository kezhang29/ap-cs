import java.util.Scanner;

public class BuildSentence {
    public static void main(String[] args) {
        // Instantiate scanner
        Scanner sc = new Scanner(System.in);
        // Ask user for verb and noun
        System.out.print("Enter a verb: ");
        String verb = sc.next();
        System.out.print("Enter a noun: ");
        String noun = sc.next();

        // Concanenate verb and noun into sentence String
        String sentence = "The " + noun + " " + verb + "s";
        // Print Sentence
        System.out.println(sentence);
        sc.close();
    }
}
