package Condition_and_loops;

public class Q6_CaseCheck {
    public static void main(String[] args) {
        char str = 'c';
        System.out.println(str);
        if (str >= 'a' && str <= 'z') {
            System.out.println("Lower case");
        } else if (str >= 'A' && str <= 'Z') {
            System.out.println("Upper case");
        } else {
            System.out.println("Not a letter");
        }
    }
}
