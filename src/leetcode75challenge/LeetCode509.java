package leetcode75challenge;

public class LeetCode509 {

    public static int fib(int n) {
        if(n <= 1)
            return n;
        int f1 = 0;
        int f2 = 1;
        int res = -1;
        for(int i=2;i<=n;i++){
            res = f1+f2;
            f1 = f2;
            f2 = res;
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println("Fibonaaci F(30) is : " + fib(30));
    }
}
