package solutions;

public class LeetCode198 {

    public static int rob(int[] nums) {
        int[] maxRobAmount = new int[nums.length+2];
        maxRobAmount[0] = 0;
        maxRobAmount[1] = 0;
        for(int i=2;i<maxRobAmount.length;i++){
            maxRobAmount[i] = Math.max(maxRobAmount[i-1], (maxRobAmount[i-2] + nums[i-2]));
        }
        return maxRobAmount[maxRobAmount.length-1];
    }

    public static void main(String args[]){
        int[] amountInHouses = {2,7,9,3,1};
        System.out.println("Maximum Amount that can be robbed from houses are  : " + rob(amountInHouses));
    }
}
