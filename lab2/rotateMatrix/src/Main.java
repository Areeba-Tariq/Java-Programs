import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter row col size");

        Scanner obj=new Scanner(System.in);
        int row=obj.nextInt();
        int col=obj.nextInt();

        int[][] matrix0=new int[row][col];
        int [][]matrix1=new int[col][row];
        System.out.println("Enter elements of size"+row*col);
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix0[i][j]=obj.nextInt();
            }
        }

        int l=row,k=0;
        for(int i=0;i<row;i++)
        {
            k=0;l--;
            for(int j=0;j<col;j++)
            {
                matrix1[k][l]=matrix0[i][j];
                k++;
            }
        }

        for(int i=0;i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
                System.out.print(matrix1[i][j]);
            }
            System.out.print("\n");
        }



    }
}