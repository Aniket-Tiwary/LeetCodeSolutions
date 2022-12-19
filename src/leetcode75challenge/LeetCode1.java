package leetcode75challenge;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1 {

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> prevNums = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(prevNums.containsKey(target-nums[i]))
                return new int[]{prevNums.get(target-nums[i]),i};
            prevNums.put(nums[i],i);
        }
        return new int[2];
    }

    public static void main(String args[]){
        int[] nums = {2,7,11,15};
        System.out.println("Tager 9 can be acheived by adding numbers at indices : " + Arrays.toString(twoSum(nums,9)));
    }
}
