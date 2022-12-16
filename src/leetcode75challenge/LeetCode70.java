package leetcode75challenge;

public class LeetCode70 {

    public static int climbStairs(int n) {
        int prev = 1;
        int curr = 1;
        for(int i=2;i<=n;i++){
            int res = prev + curr;
            prev = curr;
            curr = res;
        }
        return curr;
    }

    public static void main(String args[]){
        System.out.println("Number of ways to climb 12 stairs is : "+climbStairs(12));
    }
}
