import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.print("Enter the word to count: ");
        String wordToCount = scanner.next().toLowerCase();

        // Remove punctuation and convert the input text to lowercase
        text = text.replaceAll("[^a-zA-Z ]", "").toLowerCase();

        // Split the text into words
        String[] words = text.split("\\s+");

        // Create a HashMap to store word frequencies
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Count word frequencies
        for (String word : words) {
            if (!word.isEmpty()) {
                wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Get and display the frequency of the specified word
        int frequency = wordFrequencyMap.getOrDefault(wordToCount, 0);
        System.out.println("Frequency of '" + wordToCount + "': " + frequency);

        scanner.close();
    }
}