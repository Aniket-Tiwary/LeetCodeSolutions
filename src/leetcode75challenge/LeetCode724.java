package leetcode75challenge;

public class LeetCode724 {

    /*
        We can calculate totalSum and as we want left most pivot index we start out search from 0th index and
        go on to calculate leftSum which is the total of all the elements of the array before this index and
        if leftSum is equal to the sum of the rest of the elements i.e, totalSum-leftSum-currentArrayElemt we
        have found our index.
     */
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }
        int leftSum = 0;
        for(int i=0;i<nums.length;i++){
            if(leftSum == (totalSum-leftSum-nums[i])){
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }

    public static void main(String args[]){
        int[] arr = new int[]{1,7,3,6,5,6};
        System.out.printf("Pivot Index of the array is : " + pivotIndex(arr));
    }
}
