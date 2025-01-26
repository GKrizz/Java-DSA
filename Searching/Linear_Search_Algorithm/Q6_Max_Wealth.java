package Searching.Linear_Search_Algorithm;

public class Q6_Max_Wealth {
    public static void main(String[] args) {
        int[][] arr={
                {4,2,3},
                {2,4,1},
                {2,3,1}
        };
        System.out.println(maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts){
        int max=Integer.MIN_VALUE;

        for (int person=0;person<accounts.length;person++){//row
            //when u start with new line take a new sum for that row
            int sum=0;
            for (int account=0;account< accounts[person].length;account++){//col
                sum+=accounts[person][account];
            }
            //now you have sum of the account of person
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }
}
