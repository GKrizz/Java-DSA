package Searching.Binary_Search_Algorithm;

public class Q3_Smallest_Letter_Greater_Than_Target {
    static char nextGreatestLetter(char[] arr, char target){
        int s=0;
        int e=arr.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(target>=arr[mid])
                s=mid+1;
            else
                e=mid-1;
        }
        return arr[s% arr.length];

    }
    public static void main(String[] args) {
        char[] arr={'c','f','j'};
        char target='c';
        System.out.println(nextGreatestLetter(arr,target));

    }
}
