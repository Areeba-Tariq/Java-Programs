import java.util.Scanner;

class Palindrome
{
    boolean FindPalindrome()
    {
        System.out.println("Enter a no");
        Scanner obj=new Scanner(System.in);
        int number=obj.nextInt();

        System.out.println("Enter "+number+ "elements of array");
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter element" + (i + 1)+" = ");
            array[i] = obj.nextInt();
        }
        for(int i=0,j=number-1;i<number/2&&j>=number/2;i++,j--)
        {
            if(array[i]!=array[j])
            {
                return false;
            }
        }
        return true;
    }

}
public class Main {
    public static void main(String[] args) {

        Palindrome obj=new Palindrome();
        boolean ans=obj.FindPalindrome();
        if(ans) System.out.println("Its a palindrome");
        else {
            System.out.println("Not a palindrome");
        }
    }
}