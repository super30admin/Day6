// Time Complexity : O(N)
// Space Complexity : O(1) (Extra space for hashmap, but since only lower and upper case charcters are allowed it will be constant (52 chars)) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Calculate the frequency of the characters and if even add it to the answer. 
// If first odd then add it to sum, if second odd then then subtract -1 and add it to sum
// Alternate approac: Use char arrays for lower and upper charcters instead of the hashmap
import java.util.*;
class LongestPalindromeSolution {
    public int longestPalindrome(String s) {
        if(s == null) {
            return 0;
        }
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch: s.toCharArray()) {
            if(map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch, 1);
            }
        }
        int ans =0; 
        boolean isFirstOdd = false;
        for(Character ch: map.keySet()) {
            if(map.get(ch)%2==0)
                ans = ans+map.get(ch);
            else {
               if(isFirstOdd == false) {
                   ans+=map.get(ch);
                   isFirstOdd = true;
               } else {
                   ans += map.get(ch)-1;
               }
            }
        }
        return ans;
    }
}