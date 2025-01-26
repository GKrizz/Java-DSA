package Searching.Linear_Search_Algorithm;

public class Q5_Even_Digits {
    static int findNumbers(int[] arr){
        int count=0;
        for (int num:arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        return digits(num)%2==0;
    }

    static int digits(int num){

        return (int) (Math.log10(num))+1;
//        int count=0;
//        while (num>0){
//            count++;
//            num/=10;
//        }
//        return count;
    }
    public static void main(String[] args) {
        int[] arr={345,57,7896};
        System.out.println(findNumbers(arr));
    }
}
