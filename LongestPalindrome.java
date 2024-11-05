// Time Complexity : O(n)  n length of chars in the string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
// Approach -



/**
 *  LongestPalindrome : LongestPalindrome
 *
 * @author : Kavya Mandaliya
 * @version : 1.0 (Oct 31, 2024)
 * @since : 1.0 (Oct 31, 2024)
 *
 */
import java.util.*;

 public class LongestPalindrome {
 
     public int longestPalindrome(String s) {
      Set<Character> set = new HashSet<>();
      int count = 0;
      for(char c: s.toCharArray()){
       if(set.contains(c)){
        set.remove(c);
        count = count + 2;
       }
       else set.add(c);
      }
      return set.size() == 0 ? count : count+1;
     }
}
