package leetcode75challenge;

public class LeetCode1480 {
    public static int[] runningSum(int[] nums){
        for(int i=1;i<nums.length;i++){
            nums[i] += nums[i-1];
        }
        return nums;
    }

    public static void main(String args[]){
        int[] arr = new int[]{1,2,3,4};
        System.out.print("Running Sum array : ");
        int [] nums = runningSum(arr);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
