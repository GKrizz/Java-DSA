package Searching.Binary_Search_Algorithm;

public class Q6_Peak_index_in_an_mountain_array {
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;
        while (start<end){
            int mid=start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start=mid+1;
            } else if (arr[mid]>arr[mid+1]) {
                end=mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int[] arr={0,2,8,0};
        Q6_Peak_index_in_an_mountain_array obj=new Q6_Peak_index_in_an_mountain_array();
        System.out.println(obj.peakIndexInMountainArray(arr));
    }
}
