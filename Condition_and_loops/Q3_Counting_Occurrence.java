package Condition_and_loops;

public class Q3_Counting_Occurrence {
        public static void main(String[] args) {
            int n=1;
            int num=112;
            int originalNum = num;
            int count=0;
            while (num>0){
                int rem=num%10;
                if(rem==n){
                    count++;
                }
                num=num/10;
            }
            System.out.println("count of "+n+" in "+originalNum+" = "+count);

        }
    }
