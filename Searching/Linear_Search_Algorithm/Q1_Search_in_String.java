package Searching.Linear_Search_Algorithm;

import java.util.Arrays;

public class Q1_Search_in_String {
    //Using for with index
    static boolean search_1(String word,char target){

        if(word.length()==0) return false;

        for (int index=0;index<word.length();index++){
            if(target==word.charAt(index))
                return true;
        }
        return false;
    }
    //For each
    static boolean search_2(String word,char target){

        if(word.length()==0) return false;

        for (char str:word.toCharArray()){
            if(str==target)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String word="Hello";
        char target='o';

        System.out.println(Arrays.toString(word.toCharArray()));
        boolean result=search_1(word,target);
        System.out.println(result);

    }
}
