package Condition_and_loops;

public class Q1_Largest_of_three {
    public static void main(String[] args) {
        int a=10;
        int b=21;
        int c=56;
        int max=Math.max(c,Math.max(a,b));
        int min=Math.min(c,Math.min(a,b));

        System.out.println("Max num: "+max);
        System.out.println("Min num: "+min);
    }
}
