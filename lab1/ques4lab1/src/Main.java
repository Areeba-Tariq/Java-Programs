import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Enter size");
        Scanner s = new Scanner(System.in);
        int rows = s.nextInt();
        int columns = s.nextInt();

        System.out.println("Enter array elements");
        int[][] array = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array[i][j] = s.nextInt();
            }
        }

        int[][] t = new int[columns][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                t[j][i] = array[i][j];
            }
        }
        System.out.println("Transposed Matrix:");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(t[i][j] + " ");
            }
            System.out.println();
        }
    }
}