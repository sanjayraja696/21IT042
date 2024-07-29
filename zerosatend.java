package Arrays;
import java.util.*;
class zerosatend {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        //int res[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0)
            {
                arr[j++]=arr[i];
            }
        }
        while(j<n){
            arr[j++]=0; 
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}
