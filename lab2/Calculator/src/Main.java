import java.util.Scanner;
class Calculator
{
    public static int add(int a,int b) //
    {
        return a+b;
    }
    public static float add(float a,float b) //
    {
        return a+b;
    }
    public static String add(String a,String b) //
    {
        return a+b;
    }
    public static int add(int[] arr) ///
    {
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        return sum;
    }
    public static String add (String []arr) //
    {
        String concent=" ";
        for(int i=0;i<arr.length;i++)
        {
            concent+=arr[i];
        }
        return concent;
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println(Calculator.add(1,2)); //4


        System.out.println(Calculator.add(1.2f,2.1f));

        System.out.println(Calculator.add("hello","world"));

        int []arr={1,2,3};
        System.out.println(Calculator.add(arr));

        String []arr1={"areeba","tariq","javaLab"};
        System.out.println(Calculator.add(arr1));

    }
}