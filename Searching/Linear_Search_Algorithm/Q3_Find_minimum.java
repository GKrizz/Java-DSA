package Searching.Linear_Search_Algorithm;

public class Q3_Find_minimum {
    static int find_min(int[] arr){
        int min=arr[0];
        for(int num:arr){
            if(num<min){
                min=num;
            }
        }
        return min;

    }
    public static void main(String[] args) {
        int[] arr={3,5,8,1};
        System.out.println(find_min(arr));
    }
}
