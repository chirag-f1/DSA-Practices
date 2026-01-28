
import java.util.Scanner;
public class fibonacci {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n : ");
        int n = sc.nextInt();
        int a =0;
        int b =1;
        int c =0;
        System.out.println(fib(n,0,1,0));
    }
    static int fib(int n,int a , int b,int c){

        for (int i = 2; i <= n; i++) {
            if(a==0){return 0;}
            if(b==1){return 1;}
            c = a+b;
          a =b;
            b=c;

        }
        return c;
    }
}
