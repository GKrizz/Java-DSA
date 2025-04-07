package Strings_and_StringBuilder;

public class Q1_palindrome {
    public static void main(String[] args) {
        String str = "malayalam";
        int start = 0;
        int end = str.length()-1;
        while (start < end) {
            if (str.charAt(start) != str.charAt((end))) {
                System.out.println("Not palindrome");
            }
            start++;
            end--;
        }
        System.out.println("palindrome");
    }
}
