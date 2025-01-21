package Linear_Search_Algorithm;

public class Searching {
    //search target and return index
    static int linear_search_1(int[] arr,int target){
        if(arr.length==0) return -1;

        for (int index=0;index<arr.length;index++){
            if(arr[index]==target){
                return index;
            }
        }
        return -1;
    }

    //search target and return element
    static int linear_search_2(int[] arr,int target){
        if(arr.length==0) return -1;

        for(int element:arr){
            if(element==target){
                return element;
            }
        }
        return -1;
    }

    //search target and return true or false
    static boolean linear_search_3(int[] arr,int target){
        if(arr.length==0) return false;

        for(int element:arr){
            if(element==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr={2,5,7,6};
        int target=54;
        int ans1=linear_search_1(arr,target);
        int ans2=linear_search_2(arr,target);
        boolean ans3=linear_search_3(arr,target);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }
}
