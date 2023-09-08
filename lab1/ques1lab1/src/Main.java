import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a no");
        Scanner obj = new Scanner(System.in);
        int number = obj.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
    }
}