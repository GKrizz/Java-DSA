package Functions_or_Methods;

import java.util.Arrays;

public class VarArgs {
    static void fun(int ...num){
        System.out.println(Arrays.toString(num));
    }
    public static void main(String[] args) {
        fun(1,2,3,4);
    }
}
