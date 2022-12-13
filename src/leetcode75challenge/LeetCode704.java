package leetcode75challenge;

public class LeetCode704 {

    public static int search(int[] nums, int target) {
        if(nums.length == 0)
            return -1;
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int middle = (left+right)/2;
            if(nums[middle] < target){
                left = middle + 1;
            }else if(nums[middle] > target){
                right = right - 1;
            }else{
                return middle;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        int[] nums = {2,10,66,77,89};
        int target = 77;
        System.out.println("Index of target is : "+search(nums,target));
    }
}
