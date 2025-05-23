package Sorting_Algorithm;

import java.util.Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        int len=arr.length;

        boolean swapped;
        //run the step n-1 times
        for(int i=0;i<len;i++){ 
            swapped=false;
            //from each step,max item will come at the last respective index
            for(int j=1;j<len-i;j++){
                //swap if the item is smaller than the previous item
                if(arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }
            }
            // If no swaps happened, break early ,the array is already sorted
            if(!swapped)
                break;
        }
    }
}
