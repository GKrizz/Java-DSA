package Searching.Binary_Search_Algorithm;

public class Order_Agnostic_Binary_Search {

    // Main method for order-agnostic binary search
    static int orderAgnostic_BS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Determine whether the array is sorted in ascending or descending order
        boolean isAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) return mid; // Target found at mid

            if (isAscending) {
                // Binary search for ascending order arrays
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                // Binary search for descending order arrays
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {6, 5, 3, 1}; // Example descending array
        int target = 5;

        System.out.println(orderAgnostic_BS(arr, target)); // Output: 1 (index of 5)

        int[] arr2 = {1, 3, 5, 7, 9}; // Example ascending array
        System.out.println(orderAgnostic_BS(arr2, 7)); // Output: 3 (index of 7)
    }
}
