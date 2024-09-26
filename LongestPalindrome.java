// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : YES
// Any problem you faced while coding this : NO
import java.util.HashSet;

class LongestPalindrome {
    public int longestPalindrome(String s) {
        HashSet<Character> set = new HashSet<>();
        int res =0;
        for(char ch : s.toCharArray()){
            if(set.contains(ch)){
                res += 2;
                set.remove(ch);
            }
            else{
                set.add(ch);
            }
        }
        if(set.isEmpty())
            return res;
        return res+1;
    }
}
