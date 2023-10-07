import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.print("Enter your choice between 1 and 2: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            System.out.print("Enter text for encryption: ");
            String inputText = scanner.nextLine();
            String encryptedText = encrypt(inputText);

            writeToFile("encrypted.txt", encryptedText);

            System.out.println("Text is encrypted");
        } else if (choice == 2) {
            String encryptedText = readFromFile("encrypted.txt");
            String decryptedText = decrypt(encryptedText);
            System.out.println("Decrypted Text is  " + decryptedText);
        } else {
            System.out.println("Invalid choice. Please enter 1 for encryption or 2 for decryption.");
        }

        scanner.close();
    }

    // Encryption method (Caesar cipher with 'a')
    private static String encrypt(String text) {
        StringBuilder encryptedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encryptedText.append((char) (c + 'a'));
        }
        return encryptedText.toString();
    }

    private static String decrypt(String encryptedText) {
        StringBuilder decryptedText = new StringBuilder();
        for (char c : encryptedText.toCharArray()) {
            decryptedText.append((char) (c - 'a'));
        }
        return decryptedText.toString();
    }

    // Write text to a file
    private static void writeToFile(String fileName, String text) {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Read text from a file
    private static String readFromFile(String fileName) {
        StringBuilder text = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                text.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text.toString();
    }
}