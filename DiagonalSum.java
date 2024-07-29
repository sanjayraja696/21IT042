package Arrays;

import java.util.Scanner;

public class DiagonalSum {
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
        int sum=0;
        for(int i=0;i<a;i++)
        {
           sum+=arr[i][i];
           
        }
        System.out.print(sum);
    }
}
