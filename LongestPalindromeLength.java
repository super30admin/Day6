// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashSet;

public class LongestPalindromeLength {
    public static int lengthOfLongestPalindrome(String s){
        HashSet<Character> set = new HashSet<>();
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(set.contains(s.charAt(i))){
                // Counting pairs of same alphabets
                set.remove(s.charAt(i));
                count++;
            } else {
                set.add(s.charAt(i));
            }
        }

        // Set will now contain characters who didn't have pair of same character
        if(set.isEmpty()){
            return count*2;
        } else {
            return count*2+1;
        }
    }

    public static void main(String args[]){
        String s = "abccccdd";
        System.out.println(lengthOfLongestPalindrome(s));
        System.out.println("Length  by method 2: " +longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        int count = 0;
        int single = 0;

        int[] freq = new int[128];

        for(char c:s.toCharArray()){
            freq[c]++;
        }

        for(int i=0; i<freq.length; i++){
            if(freq[i] % 2 == 0){
                count += freq[i];
            } else {
                count += freq[i] - 1;
                single = 1;


            }
        }

        return count + single;
    }
}
