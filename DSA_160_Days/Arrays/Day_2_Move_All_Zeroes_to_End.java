package DSA_160_Days.Arrays;

public class Day_2_Move_All_Zeroes_to_End {

    static void pushZerosToEnd(int[] arr) {
        int len = arr.length;
        int index = 0;

        // Move non-zero elements to the front
        for (int i = 0; i < len; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }

        // Fill remaining array with 0's
        while (index < len) {
            arr[index] = 0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};

        // Call method to move zeroes to the end
        pushZerosToEnd(arr);

        // Print the modified array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
