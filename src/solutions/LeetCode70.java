package solutions;

public class LeetCode70 {

    public static int climbStairs(int stairs){
        int prev = 1;
        int curr = 1;
        for(int i=2;i<=stairs;i++){
            int res = prev + curr;
            prev = curr;
            curr = res;
        }
        return curr;
    }

    public static void main(String[] args){
        int stairs = 5;
        System.out.println("Ways to climb stairs : "+climbStairs(stairs));
    }
}
