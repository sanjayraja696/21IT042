package Arrays;
import java.util.*;
class SecondMax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int max=0;
        int second=0;
        for(int i=0;i<n;i++)
        {
            if(max<arr[i])
            {
                second = max;
                max=arr[i];
            }
            else if(second != max && max > arr[i]){
                second=arr[i];
            }
        }
        Arrays.sort(arr);
        int start=arr[n-1];
        int end = arr[n-2];
        System.err.println(end);
        System.out.print(second);
    }
}
