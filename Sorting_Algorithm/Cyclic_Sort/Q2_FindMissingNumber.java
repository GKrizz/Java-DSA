package Sorting_Algorithm.Cyclic_Sort;
//  https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
//  Asked in GOOGLE

import java.util.ArrayList;
import java.util.List;

public class Q2_FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> result = findDisappearedNumbers(arr);
        System.out.println(result);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            // Check bounds and avoid infinite swapping on duplicates
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // Find missing numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
