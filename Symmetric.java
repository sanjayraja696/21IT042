package Arrays;

import java.util.*;
class Symmetric
{
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
        int temp=0;
        for(int i=0;i<a;i++)
        {
            for(int j=0;j<b;j++)
            {
                if(arr[i][j]==arr[j][i])
                {
                    continue;
                }
                else
                {
                    temp=1;
                    break;
                }
            }
            if(temp==1)
                {
                    break;
                }
        }
        if(temp==1)
        {
            System.out.println("Not Symmetric");
        }
        else
        {
            System.out.println("Symmetric");
        }
    }
}