package leetcode75challenge;

import java.util.Arrays;

public class LeetCode409 {

    public static int longestPalindrome(String s) {
        int[] charMap = new int[256];
        Arrays.fill(charMap,0);
        int index = -1;
        for(int i=0;i<s.length();i++){
            index = s.charAt(i);
            charMap[index] = charMap[index] + 1;
        }
        int res = 0;
        boolean oddUsed = false;
        for(int val : charMap){
            if(val % 2 == 0)
                res += val;
            else{
                res += oddUsed ? val-1 : val;
                oddUsed = true;
            }
        }
        return res;
    }

    public static void main(String args[]){
        String s = "abccccdd";
        System.out.println("Length of longest palindrome we can create from s is : " + longestPalindrome(s));
    }
}
