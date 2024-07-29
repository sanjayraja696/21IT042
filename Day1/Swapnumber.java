import java.util.*;
class Swapnumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=10;
        int b=23;
        a = a+b;
        b= a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }
}
