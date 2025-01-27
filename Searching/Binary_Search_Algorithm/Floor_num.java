package Searching.Binary_Search_Algorithm;

public class Floor_num {
    static int search(int[] arr,int target){

        int s=0;
        int e=arr.length-1;
        // When the target is smaller than the first element
        if (target < arr[s]) {
            return -1; // No floor exists
        }

        while (s<=e){
            int mid=s+(e-s)/2;
            if(target>arr[mid])
                s=mid+1;
            else if (target<arr[mid])
                e=mid-1;
            else
                return mid;
        }
        return e;
    }
    public static void main(String[] args) {
        int[] arr={1,3,5,7};
        int target=0;
        System.out.println(search(arr,target));
    }
}
