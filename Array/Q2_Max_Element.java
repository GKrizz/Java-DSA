package Array;

import java.util.Arrays;

public class Q2_Max_Element {
    static void max(int[] arr){
        if (arr == null || arr.length == 0) {
            System.out.println("Empty array");
        }
        int max=0;
        for(int res:arr){
            if(res>max){
                max=res;
            }
        }
        System.out.println("Max : "+max);
    }
    static void max_Range(int[] arr,int start,int end){
        if(start < 0 || end >= arr.length || start>end) {
            System.out.println("Invalid range");
        }

        int max=0;
        for(int i=start;i<=end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Max in range [" + start + "," + end + "]: " + max);

    }
    public static void main(String[] args) {
        int[] arr={1,21,3,4,45};
        System.out.println(Arrays.toString(arr));
        max(arr);
        max_Range(arr,1,3);
    }
}
