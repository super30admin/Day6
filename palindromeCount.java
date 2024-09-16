// Time Complexity : O(n)
// Space Complexity : O(1) since we use 26 lowercase characters which is further a constant space complexity.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
import java.util.*;
class palindromeCount{
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int count = 0;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hm.containsKey(c)){
                count=count+2;
                hm.remove(c);
            }
            else{
                hm.put(c,1);
            }
        }
        if(!hm.isEmpty())
            count++;
        return count;
    }
}