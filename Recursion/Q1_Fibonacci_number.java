package Recursion;

public class Q1_Fibonacci_number {

    // Recursive method to calculate Fibonacci number at position n
    static int fibonacci(int n) {
        if (n < 2)
            return n;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Iterative method to print Fibonacci sequence up to num terms
    static void printFibonacciIterative(int num) {
        int a = 0, b = 1, c;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        int num = 6;

        // Using recursive method
        System.out.print("Fibonacci Series (Recursive): ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Using iterative method
        System.out.print("Fibonacci Series (Iterative): ");
        printFibonacciIterative(num);
    }
}
