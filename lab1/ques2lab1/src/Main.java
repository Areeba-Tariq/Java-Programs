import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a no");

        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();

        System.out.println("Enter "+number+ "elements of array");
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter element" + (i + 1)+" = ");
            array[i] = obj.nextInt();
        }

        System.out.println("Enter a no for rotation");
        int numrotate=obj.nextInt();

        if(numrotate>=0 && numrotate<=number) {
            int[] array2 = new int[number];
            int j = 0;
            for (int i = numrotate; i < number; i++) {
                array2[i] = array[j];
                j++;
            }

            for (int i = 0; i < numrotate; i++) {
                array2[i] = array[j];
                j++;
            }
            for (int i = 0; i < number; i++) {
                System.out.println(array2[i]);
            }
        }
        else {
            System.out.println("Incorrect rotation number");
        }
    }
}