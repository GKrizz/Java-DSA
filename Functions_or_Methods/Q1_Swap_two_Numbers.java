package Functions_or_Methods;

public class Q1_Swap_two_Numbers {

    static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a = "+a+" b = "+b);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.println("a = "+a+" b = "+b);
        swap(a,b);

    }
}
