/* Leetcode Problem - 409
https://leetcode.com/problems/longest-palindrome/
 Time Complexity : O(n)
 Space Complexity : O(n) worst case
 Did this code successfully run on Leetcode : Yes
 Any problem you faced while coding this : No

Your code here along with comments explaining your approach
1. Traverse through the entire strung
2. Add element to set, if repeating element, update count to +2, and remove the element from set.
3. If set is not empty at the end, it means that, there were some characters that occured odd number of times in teh string
4. Return count + 1, if set is not empty, else return count
*/
import java.util.HashSet;
public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int result = 0;
        
        HashSet<Character> set = new HashSet<>();
        
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                set.remove(s.charAt(i));
                result += 2;
            } else {
                set.add(s.charAt(i));    
            }            
        }
        if (set.size() == 0) {
            return result;
        } else {
            return result+1;
        }
    }
}