package Searching.Binary_Search_Algorithm;

public class Q1_Ceiling_Num {
    static int search(int[] arr,int target){
        if(target>arr[arr.length-1]) return -1;
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid])
                s=mid+1;
            else if (target<arr[mid])
                e=mid-1;
            else
                return mid;
        }
        return s;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        int target=4;
        System.out.println(search(arr,target));
    }
}
