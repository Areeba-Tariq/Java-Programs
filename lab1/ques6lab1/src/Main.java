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

        int sum=0;
        for(int i=0;i<number;i++)
        {
            if(array[i]%2!=0)
            {
                sum+=array[i];
            }
        }

        System.out.println("The sum of all odd is "+sum);
    }
}