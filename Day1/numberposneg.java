//Write a Java program to check whether a number is positive, negative, or zero.
import java.util.*;
class numberposneg {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n==0)
        {
            System.out.println("Zero");
        }
        else if(n<0)
        {
            System.out.println("Negative");
        }
        else
        {
            System.out.println("Positive");
        }
    }
}
