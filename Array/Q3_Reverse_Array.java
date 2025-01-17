package Array;

import java.util.Arrays;

public class Q3_Reverse_Array {
    static void rev(int[] arr){
        int len=arr.length;
        int start=0;
        int end=len-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
        System.out.println("Reversed Array: "+Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println("Original Array: "+Arrays.toString(arr));
        rev(arr);
    }
}
