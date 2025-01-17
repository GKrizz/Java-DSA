package Functions_or_Methods;

public class Q2_Prime_Number {
    static boolean isPrime(int n){
        if(n<=1)
            return false;
        int i=2;
        while (i*i<=n){
            if(n%i==0)
                return false;
            i++;
        }
        return true;

    }
    public static void main(String[] args) {
        int n=4;
        System.out.println(isPrime(n));
    }
}
