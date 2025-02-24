package Searching.Binary_Search_Algorithm;

import java.util.Arrays; // Import Arrays class for printing

public class Q4_First_and_Last_pos_sorted_arr {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target))); // Correct way to print array
    }

    public static int[] searchRange(int[] nums, int target) {
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        return new int[]{first, last};
    }

    private static int findFirst(int[] nums, int target) {
        int start = 0, end = nums.length - 1, firstIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                firstIndex = mid; // Possible first occurrence
                end = mid - 1; // Move left
            } else if (nums[mid] < target) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1; // Search left half
            }
        }
        return firstIndex;
    }

    private static int findLast(int[] nums, int target) {
        int start = 0, end = nums.length - 1, lastIndex = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                lastIndex = mid; // Possible last occurrence
                start = mid + 1; // Move right
            } else if (nums[mid] < target) {
                start = mid + 1; // Search right half
            } else {
                end = mid - 1; // Search left half
            }
        }
        return lastIndex;
    }
}
