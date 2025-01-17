package Functions_or_Methods;

import java.util.Arrays;

public class Overloading {
    static void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    static void fun(String ...name){
        System.out.println(Arrays.toString(name));
    }
    public static void main(String[] args) {
        fun(5,3,4);
        fun("hello","Welcome");
    }
}
