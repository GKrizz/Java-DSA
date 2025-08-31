package Recursion;

public class Q2_BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,5,9,12,65};
        int target=9;
        int start=0;
        int end=arr.length-1;
        System.out.println(search(arr,target,start,end));

    }
    static int search(int[] arr,int target,int start, int end){
        if(start>end) return  -1;
        int mid=start+(end-start)/2;
        if (arr[mid]==target) return mid;
        if(target<arr[mid]){
            return search(arr,target,start,mid-1);
        }else {
            return search(arr,target,mid+1,end);
        }
    }
}
