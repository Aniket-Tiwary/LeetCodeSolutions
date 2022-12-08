package leetcode75challenge;

import java.util.HashMap;

public class LeetCode205 {

    public static boolean isIsomorphic(String s,String t){
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Integer> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(sMap.containsKey(s.charAt(i))) {
                if (t.charAt(i) != sMap.get(s.charAt(i)))
                    return false;
            }else{
                if(tMap.containsKey(t.charAt(i)))
                    return false;
                sMap.put(s.charAt(i),t.charAt(i));
                tMap.put(t.charAt(i),1);
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s = "gadc";
        String t = "baba";
        System.out.println("Are strings " + s + " " + t + " Isomorphic : " + isIsomorphic(s,t));
    }
}
