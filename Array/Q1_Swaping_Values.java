package Array;

import java.util.Arrays;

public class Q1_Swaping_Values {
    static void swap(int[] arr,int index_1,int index_2){
        int temp=arr[index_1];
        arr[index_1]=arr[index_2];
        arr[index_2]=temp;

    }
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
    }
}
