package Linear_Search_Algorithm;

import java.util.Arrays;

public class Q4_Search_in_2D_Arrays {

    // Method to search in a 2D array and return row and column indices
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col}; // Return row and column if target is found
                }
            }
        }
        return new int[]{-1, -1}; // Return -1, -1 if target is not found
    }

    static int max(int[][] arr) {
        int max=Integer.MIN_VALUE;
        for(int[] ints:arr){
            for (int element:ints){
                if(element>max){
                    max=element;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {
                {5, 3, 12},
                {8, 22, 9, 21},
                {4, 41}
        };
        int target = 41; // Target element to find

        int[] ans = search(arr, target); // Search for target in 2D array
        System.out.println("Index of "+target+" :"+Arrays.toString(ans)); // Print the result as [row, col]

        System.out.println("Max in 2D: "+max(arr));
    }
}
