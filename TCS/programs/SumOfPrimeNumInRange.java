package TCS.programs;

public class SumOfPrimeNumInRange {
    public static void main(String[] args) {
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++) {
            if (isPrime(i)){
                sum+=i;
                System.out.println(i + " is a prime number.");
            }
//            else System.out.println(n + " is not a prime number.");
        }
        System.out.println("Sum of 1"+" to "+n+" prime num is : "+sum);

    }
    public static boolean isPrime(int num){
        if(num<=1) return false;
        if(num==2) return true;
        if(num%2==0) return false;
        for(int i=3;i*i<=num;i+=2){
            if (num%i==0) return false;
        }
        return true;
    }
}
