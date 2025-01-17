package Functions_or_Methods;

import java.util.Arrays;

public class Q3_Armstrong_Number {
    static boolean armstrong(int num, int count) {
        int original_num = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, count);
            num /= 10;
        }

        return sum==original_num;
    }

    public static void main(String[] args) {
//        int num = 1634;
        int num;
        for (num=100;num<1000;num++){
            int count = (int) Math.log10(num) + 1;
            if (armstrong(num,count)){
                System.out.println(num);
            }
        }

//        armstrong(num, count);
    }
}
