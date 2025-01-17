package Array;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] arr = {1, 52, 7, 3, 4};
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println("\nArray: " + Arrays.toString(arr));

        arr[1]=5;
        System.out.println("Array: " + Arrays.toString(arr));

    }
}
