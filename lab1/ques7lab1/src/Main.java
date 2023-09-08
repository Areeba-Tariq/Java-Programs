import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter a no");
        Scanner obj=new Scanner(System.in);

        float number1=obj.nextInt();
        float number2=obj.nextInt();

        System.out.println("Press 1 for + , 2 for - and 3 for * and 4 for / and 5 for mod");
        int operation=obj.nextInt();

        switch(operation)
        {
            case 1:
                float ans=number1+number2;
                System.out.println(number1+" + "+number2+" = "+ans);
                break;
            case 2:
                ans=number1-number2;
                System.out.println(number1+" - "+number2+" = "+ans);
                break;
            case 3:
                ans=number1*number2;
                System.out.println(number1+" * "+number2+" = "+ans);
                break;
            case 4:
                float ans1=number1/number2;
                System.out.println(number1+" / "+number2+" = "+ans1);
                break;
            case 5:
                ans=number1%number2;
                System.out.println(number1+" % "+number2+" = "+ans);
                break;
        }


    }
}