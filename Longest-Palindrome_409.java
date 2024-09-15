import java.utils.*;
// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
  //Count the frequencies of each character in String, add the even frequencies and odd frequencies -1.
  //if there was any odd number frequency then add 1 to result, since a unique character can be in middle of palindrome
class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        int result=0;
        boolean odd = false;

        for(Map.Entry<Character,Integer> e: map.entrySet()) {
            if (e.getValue() %2 == 0) {
                result+=e.getValue();
            }
            else  {
                result+=e.getValue()-1;
                odd = true;
            }
        }

        result = result + (odd ? 1 : 0);
        return result;
    }
}
