package Searching.Binary_Search_Algorithm;

public class Binary_Search {
    static int binarySearch(int[] arr,int target){
        //if target exist return  => index else -1
        int start=0;
        int end= arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }else {
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr={0,1,22,33,44,55,66};
        System.out.println(binarySearch(arr,22));
        System.out.println(binarySearch(arr,66));

    }
}
