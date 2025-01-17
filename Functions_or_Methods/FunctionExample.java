package Functions_or_Methods;

import java.util.Arrays;

public class FunctionExample {
    //Dont return
    static void sum(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    //Return integer value
    static int sum2(int a,int b){
        int sum=a+b;
        return sum;
    }
    //Return String
    static String greet(String name){
        return "Welcome "+name+" !";
    }
    public static void main(String[] args) {
        sum(10,20);
        System.out.println(sum2(1,2));
        System.out.println(greet("Gobala Krishnan"));
    }

    public static class VarArgs {
        static void fun(int ...n){
            System.out.println(Arrays.toString(n));
        }
        public static void main(String[] args) {
            fun(4,5,6,2,1);
        }
    }
}
