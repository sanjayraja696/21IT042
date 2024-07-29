package Arrays;
import java.util.*;
class TransposeMultiplication {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        int arr[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                arr[i][j]=s.nextInt();
            }
        }
        int res[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<a;j++)
            {
               
                res[j][i]=arr[i][j];

            }
        }
        int res1[][]=new int[a][b];
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                for(int k=0;k<b;k++)
                {
                res1[i][j]+=arr[i][k]*res[k][j];
                }
            }

        }
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                System.out.print(res1[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
