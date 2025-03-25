package TCS.programs;

public class Q1_CubeOfAllNumbers_In_Range {
    public static void main(String[] args) {
        int start=2;
        int end=4;
        int ans=0;
        for(int i=start;i<=end;i++){
            ans+=i*i*i;
        }
        System.out.println("cube of "+start+" and "+end+" : "+ ans);
    }
}
