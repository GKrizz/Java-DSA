package Sorting_Algorithm.Cyclic_Sort;

import java.util.ArrayList;
import java.util.List;

public class Q4_findAllDuplicate {
    public static void main(String[] args) {
        int[] arr = {4,2,3,2,1,3,4};
        List<Integer> result = findAllDuplicate(arr);
        System.out.println(result);
    }

    public static List<Integer> findAllDuplicate(int[] arr) {
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
                ans.add(arr[index]);
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
