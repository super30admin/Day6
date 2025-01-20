// Time Complexity :O(n)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
//https://leetcode.com/problems/longest-palindrome/
// Any problem you faced while coding this : No
import java.util.HashSet;

public class MakeLongestPalindrome {
    public int longestPalindrome(String s) {
        int count = 0;
        HashSet<Character> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(hs.contains(c)){
                count = count + 2;
                hs.remove(c);
            }
            else{
                hs.add(c);
            }
        }
        if(!hs.isEmpty()){
            count++;
        }
        return count;
    }
}
