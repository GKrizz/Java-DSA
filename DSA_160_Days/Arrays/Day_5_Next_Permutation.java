package DSA_160_Days.Arrays;

public class Day_5_Next_Permutation {
    static void nextPermutation(int[] arr) {
        // Edge case: If array is null or has only one element
        if (arr == null || arr.length <= 1) return;

        // Step 1: Find the break point
        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        // Step 2: Find the next largest
        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap
            swap(arr, i, j);
        }

        // Step 4: Reverse the subarray
        reverse(arr, i + 1, arr.length - 1);
    }

    // Helper method to swap two elements in the array
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start++, end--);
//            start++;
//            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 2, 5, 1};
        nextPermutation(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
