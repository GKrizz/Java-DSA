package Condition_and_loops;

public class Q4_Reverse {

    public static void main(String[] args) {

        int num = 145;

        // Call each function to process the number
        int rev = reverseNumber(num);
        int sd = sumOfDigits(num);
        int nd = countDigits(num);
        int largestDigit = findLargestDigit(num);
        long factorial = factorial(nd);
        boolean palindrome = isPalindrome(num, rev);
        boolean evenOrOdd = isEvenOrOdd(num);
        boolean perfectSquare = isPerfectSquare(num);
        int sumOfSquares = sumOfSquaresOfDigits(num);
        boolean prime = isPrime(num);

        // Output all results
        System.out.println("Reversed number: " + rev);
        System.out.println("Sum of digits: " + sd);
        System.out.println("Number of digits: " + nd);
        System.out.println("Largest digit: " + largestDigit);
        System.out.println("Factorial of number of digits (" + nd + "): " + factorial);
        System.out.println("Is palindrome: " + palindrome);
        System.out.println("Is even: " + evenOrOdd);
        System.out.println("Is perfect square: " + perfectSquare);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        System.out.println("Is prime: " + prime);

    }

    // Function to reverse the number
    public static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return rev;
    }

    // Function to calculate the sum of digits
    public static int sumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

    // Function to count the number of digits
    public static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    // Function to find the largest digit in the number
    public static int findLargestDigit(int num) {
        int largest = 0;
        while (num > 0) {
            int rem = num % 10;
            if (rem > largest) {
                largest = rem;
            }
            num = num / 10;
        }
        return largest;
    }

    // Function to calculate the factorial of the number of digits
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if the number is a palindrome
    public static boolean isPalindrome(int original, int reversed) {
        return original == reversed;
    }

    // Function to check if the number is even or odd
    public static boolean isEvenOrOdd(int num) {
        return num % 2 == 0;
    }

    // Function to check if the number is a perfect square
    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);  // Find the square root of the number
        return sqrt * sqrt == num;  // Check if the square of the integer sqrt is equal to num
    }

    // Function to calculate the sum of squares of the digits
    public static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            sum += rem * rem;  // Add the square of the digit to sum
            num = num / 10;
        }
        return sum;
    }

    // Function to check if the number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // If num is divisible by i, it's not prime
            }
        }
        return true;
    }
}
