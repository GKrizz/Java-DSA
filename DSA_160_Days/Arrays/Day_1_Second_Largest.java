package DSA_160_Days.Arrays;

public class Day_1_Second_Largest {
    public static int getSecondLargest(int[] arr) {
        int max=Integer.MIN_VALUE;
        int secmax=Integer.MIN_VALUE;
        for(int a:arr){
            if(a>max){
                secmax=max;
                max=a;
            }
            if(a>secmax && a!=max){
                secmax=a;
            }
            // if(secmax==max) return -1;
        }
        return secmax==Integer.MIN_VALUE ? -1:secmax;
    }

    public static void main(String[] args) {
        int[] arr={12, 35, 1, 10, 34, 1};
        int res=getSecondLargest(arr);
        System.out.println("Sec largest : "+res);
    }
}
