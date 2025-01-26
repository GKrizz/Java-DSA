package Searching.Linear_Search_Algorithm;

public class Q2_Search_in_Range {
    static boolean linear_search_1(String str,char target,int start,int end){
        if(str.length()==0) return false;

        for(int i=start;i<end;i++){
            if(target==str.charAt(i))
                return true;
        }
        return false;
    }

    static int linear_search_2(String str,char target,int start,int end){
        if(str.length()==0) return -1;

        for(int i=start;i<end;i++){
            if(target==str.charAt(i))
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        String str="Gobal";
        char target='a';

        int res=linear_search_2(str,target,1,5);
        System.out.println(res);

    }
}
