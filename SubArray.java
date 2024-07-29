package Arrays;
import java.util.*;
class Subarray {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int [n];
        int start=arr[0];
        int end=arr.length-1;
        int mid=start+end/2;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        
    }
}
