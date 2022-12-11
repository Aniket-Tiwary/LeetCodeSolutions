package leetcode75challenge;

public class LeetCode121 {

    public static int maxProfit(int[] prices) {
        int res = 0;
        int min = Integer.MAX_VALUE;
        for(int price:prices){
            if(price < min)
                min = price;
            else if(price - min > res)
                res = price - min;
        }
        return res;
    }

    public static void main(String args[]){
        int[] prices = {7,1,5,3,6,4};
        System.out.println("Max Profit from stock exchange is : " + maxProfit(prices));
    }
}
