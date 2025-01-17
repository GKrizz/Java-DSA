package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimansion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
/*
        int[][] arr2D={
                {1,2,3},
                {4,5},
                {6,7,8}
        };

        // Using nested loops
        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                System.out.print(arr2D[row][col] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");

        for (int[] row : arr2D) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------");


        System.out.println(Arrays.deepToString(arr2D));

        System.out.println("---------------------------------------------");
*/
        int row_size=3;
        int col_size=2;
        int[][] arr_2D=new int[row_size][col_size];
        int len=arr_2D.length;
        System.out.println("Array length: "+len);
        //Input
        for(int row=0;row<len;row++){
            for (int col=0;col<arr_2D[row].length;col++){
                System.out.print("Enter element ("+row+","+col+") : ");
                arr_2D[row][col]=input.nextInt();
            }
        }
        //Output
        for(int row=0;row<len;row++){
            System.out.println(Arrays.toString(arr_2D[row]));
        }

        System.out.println();
        //Output  ----> For Each loop
        for (int[] row:arr_2D){
            System.out.println(Arrays.toString(row));
        }

        System.out.println();
        //Output
        for(int row=0;row<len;row++){
            for (int col=0;col<arr_2D[row].length;col++){
                System.out.print(arr_2D[row][col]+" ");
            }
            System.out.println();
        }

    }
}
