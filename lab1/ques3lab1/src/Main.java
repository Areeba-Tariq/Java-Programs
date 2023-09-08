import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a no between 0-1000");

        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();

        if(number>=0 && number<=1000) {
            System.out.println("The sum of all digits is ");
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            System.out.println(sum);
        }
        else {
            System.out.println("Incorrect value");
        }
    }
}