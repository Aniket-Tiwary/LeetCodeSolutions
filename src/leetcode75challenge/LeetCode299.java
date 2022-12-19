package leetcode75challenge;

import java.util.Arrays;

public class LeetCode299 {

    public static String getHint(String secret, String guess) {
        int[] secretMap = new int[10];
        int[] guessMap = new int[10];
        Arrays.fill(secretMap,0);
        Arrays.fill(guessMap,0);
        Integer bulls = 0;
        for(int i=0;i<secret.length();i++){
            if(secret.charAt(i) == guess.charAt(i))
                bulls++;
            else{
                secretMap[secret.charAt(i)-48]++;
                guessMap[guess.charAt(i)-48]++;
            }
        }
        int cows = 0;
        for(int i=0;i<10;i++){
            cows += Math.min(secretMap[i],guessMap[i]);
        }
        return String.valueOf(bulls) + "A" + String.valueOf(cows) + "B";
    }

    public static void main(String args[]){
        System.out.println(getHint("1807","7810"));
    }
}
