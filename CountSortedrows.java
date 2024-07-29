package Arrays;
import java.util.*;
class CountSortedrows {

public static boolean isSorted(int n[])
{
    int res=n.length;
    boolean asc=true;
    boolean des=true;
    for(int i=0;i<res;i++)
    {
        if(n[i]>n[i+1])
            asc=false;
        if(n[i]<n[i+1])
            des=false;
    }
    return asc||des;
}
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

    }
}
