package Array.Dynamic_Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Array_List_Example {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        Scanner input =new Scanner(System.in);
/*
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        list.set(1,46);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
*/
        // Input
        for(int i=0;i<5;i++){
            list.add(input.nextInt());
        }
        //Get items at any index
        for(int i=0;i<5;i++){
            System.out.print(list.get(i));
        }
        System.out.println(list);
    }
}