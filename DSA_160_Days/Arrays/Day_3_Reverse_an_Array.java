package DSA_160_Days.Arrays;

public class Day_3_Reverse_an_Array {
    public void reverseArray(int arr[]) {
        int len=arr.length;
        // for(int i=len-1;i>0;i--){
        //     System.out.print(arr[i]);
        //     if(i>0){
        //         System.out.print(" ");
        //     }
        // }

        int start=0;
        int end=len-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 4, 3, 2, 6, 5};

        // Create an instance of the class to call the method
        Day_3_Reverse_an_Array obj = new Day_3_Reverse_an_Array();

        // Call the method to reverse the array
        obj.reverseArray(arr);

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
