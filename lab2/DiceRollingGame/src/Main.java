import java.util.Random;

class RollingDice
{
    public void rolldice()

    {
        int[][] arr = new int[10][10];
        int count=0;
        int sum=0;
        int num=0;

        while(sum<100)
        {
            num=randomNo();
            sum+=num;
            count=0;
            for(int i=0;i<10;i++)
            {
                for(int j=0;j<10;j++)
                {
                    count++;
                    if(count==sum)
                    {
                        System.out.print("x");
                    }
                    else System.out.print(arr[i][j]);
                }
                System.out.println();
            }
            System.out.println("\n");
           // System.out.println(count);
        }
    }
    public int randomNo()
    {
        Random random=new Random();
        return random.nextInt(6)+1;
    }

}
public class Main {
    public static void main(String[] args) {
        RollingDice dice1=new RollingDice();
        dice1.rolldice();
    }
}