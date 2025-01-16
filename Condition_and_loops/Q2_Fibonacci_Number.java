package Condition_and_loops;

public class Q2_Fibonacci_Number {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int n=7;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<=n;i++){
            int c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
