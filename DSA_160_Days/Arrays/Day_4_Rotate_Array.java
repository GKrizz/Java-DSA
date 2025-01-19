package DSA_160_Days.Arrays;

public class Day_4_Rotate_Array {

    static void rotateArr(int arr[], int d) {
        int len = arr.length;
        d = d % len; // In case d is greater than array length

        // Reverse the first part of the array (0 to d-1)
        reverse(arr, 0, d - 1);

        // Reverse the second part of the array (d to len-1)
        reverse(arr, d, len - 1);

        // Reverse the entire array (0 to len-1)
        reverse(arr, 0, len - 1);
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int d = 2;
        System.out.print("Array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Call rotateArr to rotate the array
        rotateArr(arr, d);

        // Print the rotated array
        System.out.print("Left Rotate : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
