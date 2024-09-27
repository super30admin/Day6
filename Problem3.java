// Time Complexity : O(n) where n = length of string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.*;
public class Problem3 {
    
    public static int longestPalindrome(String s) {
        // Store frequency of each character in a hashmap
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);
            map.put(curr, map.getOrDefault(curr, 0) + 1);   
        }
        int ans = 0;
        boolean oddchartaken = false;
        // Loop through the values in the hashmap and add 2*(number of pairs) to answer
        // If frequency of any of the characters is odd, add 1 to the ans
        for (int count: map.values()) {
            ans += (count/2) * 2;
            if (!oddchartaken && count%2==1) {
                ans++;
                oddchartaken = true;
            }  
        }
        // Return ans
        return ans;
    }

    public static void main(String[] args) {
        String s = "abccccdd";
        int ans = longestPalindrome(s);
        System.out.println(ans);
    }
}
