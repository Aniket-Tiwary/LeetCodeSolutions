package leetcode75challenge;

public class LeetCode392 {

    private static boolean isSubsequence(String s, String t) {
        if(s.equals(""))
            return true;
        if(s.length() > t.length())
            return false;
        int j = 0;
        for(int i=0;i<t.length();i++){
            if(j >= s.length())
                return true;
            if(t.charAt(i) == (s.charAt(j)))
                j++;
        }
        return j == s.length();
    }


    public static void main(String args[]){
        String s = "abc";
        String t = "axbvfgc";
        System.out.println("Are the strings Isomorphic : " + isSubsequence(s,t));
    }

}
