package Arrays;
import java.util.*;
class Binary {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        while(n!=0)
        {
            if(n%2!=0)
            {
                count++;
            }
            n/=2;
        }
        System.out.print(count);
    }
}
